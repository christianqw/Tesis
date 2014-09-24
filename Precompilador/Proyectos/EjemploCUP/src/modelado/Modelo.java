/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;

import modelado.data.Atributo;
import modelado.data.Estructura;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import modelado.evaluadores.Evaluador;

/**
 *
 * @author Chris
 */
public class Modelo {
    
    //Estructur que define los distintos elementos que conforman al Modelo.
    //Los elementos del dominio comparten la misma estructura en comun. 
    private Estructura _estructura;
    
    //posee un conjunto con los diferentes elementos que estan definidos
    //dentro del modelo.
    private HashMap<String, Elemento> _dominio; 
    
    private HashMap<String, Evaluador> _evalPredicados;
    
    //Constructor de la clase, es necesario definir mediante la estructura
    // que atributos poseen los distintos elenemtos que confroman el modelo
    public Modelo(Estructura estruc) {
        this._estructura = estruc; 
   }
    
    // -- GENERICO AL MODELO
    public String evaluarFuncion (String id, ArrayList<String> parametros, Error error){
        if (dominioVacio()){
            error.setError(Error.tipoError.DOMVACIO, "El modelo no posee definido elementos dentro de su Dominio");
            return "";
        }
        if (!existeIdFuncion (id)){
            error.setError(Error.tipoError.NOEXISTEP, "No Existe la funcion "+ id);
            return "";
        } else
            if (!aridadFuncionCorrecta(id, parametros)){
                error.setError(Error.tipoError.ARIDAD, "Cantidad de paramentros incorrecta dentro de " + id);
                return "";
            } else 
                return evaluarFunc(id, parametros);
    }
    
    /* public Collection<String> getDominio(){
        //Verificar en que lugares se utiliza esto.
        return this._dominio;
    }
    */
    
    public boolean verificarPredicado (String id, ArrayList<String> parametros, Error error){
        if (dominioVacio()){
            error.setError(Error.tipoError.DOMVACIO, "El modelo no posee definido elementos dentro de su Dominio");
            return false;
        }
        if (!existeIdPredicado (id)){
            error.setError(Error.tipoError.NOEXISTEP, "No Existe el predicado "+ id);
            return false;
        } else
            if (!aridadCorrecta(id, parametros)){
                error.setError(Error.tipoError.ARIDAD, "Cantidad de paramentros incorrecta dentro de " + id);
                return false;
            } else 
                //Llegando a este punto, este predicado no posee ningun tipo de error
                return evaluarPred(id, parametros);
    }
    boolean agregarElemento(String name, Elemento elem){
        if (!dominioContiene(name)){
            this._dominio.put(name, elem);
            return true;
        }
        else 
            return false;
    }
    boolean eliminarElemento(String name){
        if (dominioContiene(name)){
            return (this._dominio.remove(this._dominio.get(name)));
        }
        else 
            return false;
    }
    void renombrarElemento(String name, String newname){
    }
    
    // -- MANEJO DE PREDICADOS
    boolean evaluarPred(String predicado, ArrayList<String> elementos){
       return _evalPredicados.get(predicado).evaluar(elementos);
    }
    String evaluarFunc(String predicado, ArrayList<String> elementos){
        return "";
    }
    boolean dominioVacio(){
        return this._dominio.isEmpty();
    }
    boolean dominioContiene(String name){
        return this._dominio.contains(name);        
    }
    
    
    // -- MODIFICACION DE ELEMENTOS
    boolean setAtributo (String name, Atributo value){
        if (this.dominioContiene(name)){
            return true;
        }
        return false;
    }
    boolean setPosicion(String name, int x, int y){
        if (this.dominioContiene(name)){
            Iterator<Elemento> aux = this._dominio.iterator(name);
            return true;
        }
        return false;
    }

    private boolean aridadCorrecta(String id, ArrayList<String> parametros) {
        return (_evalPredicados.get(id).getNumParametros() == parametros.size());
    }

    private boolean existeIdPredicado(String id) {
        //engloba la consulta de si existe la funcion a analizar o existe
        //el predicado a analizar, el comportamiento es igual para las 2 alternativas
        return this._evalPredicados.containsKey(id);
    }

    private boolean aridadFuncionCorrecta(String id, ArrayList<String> parametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean existeIdFuncion(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
