/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;

import modelado.data.Atributo;
import modelado.data.EstructuraElemento;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import modelado.evaluadores.Constructor;

/**
 *
 * @author Chris
 */
public class Modelo {
    
    //Estructur que define los distintos elementos que conforman al Modelo.
    //Los elementos del dominio comparten la misma estructura en comun. 
    private EstructuraElemento _estructura;
    
    //posee un mapa con los diferentes elementos que estan definidos
    //dentro del modelo. NUESTRO DOMINIO
    private HashMap<String, Elemento> _dominio; 
    
    //posee un contructor de predicados que es utilizado para definir los 
    //predicados que el modelo reconoce y sus respectivas caracteristicas.
    private Constructor _defPredicados;
    
    //Constructor de la clase, es necesario definir mediante la estructura
    // que atributos poseen los distintos elenemtos que confroman el modelo
    public Modelo(EstructuraElemento estruc) {
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
            return evaluarFunc(id, parametros);
    }
    
    public boolean verificarPredicado (String id, ArrayList<String> parametros, Error error){
        if (dominioVacio()){
            error.setError(Error.tipoError.DOMVACIO, "El modelo no posee definido elementos dentro de su Dominio");
            return false;
        }
        if (!existeIdPredicado (id)){
            error.setError(Error.tipoError.NOEXISTEP, "No Existe el predicado "+ id);
            return false;
        } else
            //Llegando a este punto, este predicado no posee ningun tipo de error
            return evaluarPred(id, parametros);
    }
    
    // -- MODIFICACION DE ELEMENTOS
    
    public boolean agregarElemento(String name, Elemento elem){
        if (!dominioContiene(name)){
            this._dominio.put(name, elem);
            return true;
        }
        else 
            return false;
    }
    public boolean eliminarElemento(String name){
        if (dominioContiene(name)){
            this._dominio.remove(name);
            return true;
        }
        else return false;
    }
    public boolean renombrarElemento(String name, String newname){
        if (dominioContiene(name)){
            return true;
        }
        else return false;
    }

    boolean setAtributo (String name, Atributo value){
        if (this.dominioContiene(name)){
            return true;
        }
        return false;
    }
    boolean setPosicion(String name, int x, int y){
        if (this.dominioContiene(name)){
            Elemento aux = this._dominio.get(name);
            aux.setPosicion( x, y);
            return true;
        }
        return false;
    }

    // -- MANEJO DE PREDICADOS
    
    /* public Collection<String> getDominio(){
        //Verificar en que lugares se utiliza esto.
        return this._dominio;
    }
    */
    
    private boolean evaluarPred(String predicado, ArrayList<String> elementos){
        return _defPredicados.getPredicado(predicado, transformaPAramentros(elementos)).evaluar();
    }
    
    String evaluarFunc(String predicado, ArrayList<String> elementos){
        return "";
    }
    
    private ArrayList<Elemento> transformaPAramentros( ArrayList<String> elementos){
        return null;
    }
    
    private boolean dominioVacio(){
        return this._dominio.isEmpty();
    }
    
    public boolean dominioContiene(String name){
        return this._dominio.containsKey(name);        
    }
    
    public Set<String> getListaElementos(){
        return this._dominio.keySet();
    }
    public boolean aridadPredicadoCorrecta(String id, int parametros) {
        return _defPredicados.cantidadParametrosCorrectos(id, parametros);
    }

    private boolean existeIdPredicado(String id) {
        return this._defPredicados.existeId(id);
    }
    
    public boolean aridadFuncionCorrecta(String id, int parametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean existeIdFuncion(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
