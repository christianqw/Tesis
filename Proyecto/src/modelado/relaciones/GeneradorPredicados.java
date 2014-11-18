/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelado.relaciones;

import java.util.ArrayList;
import java.util.HashMap;
import modelado.Elemento;
import modelado.data.EstructuraPredicado;

/**
 *
 * @author Chris
 */
public class GeneradorPredicados {
    
    //             Id utilizado dentro del Archivo | Nombre de la clase
    private HashMap<String, String> _clases; 
    //                     Id del predicado | Estructura del predicado
    private HashMap<String, EstructuraPredicado> _definidor;

    
    public void cargarClases(){
        this._clases = new HashMap<>();
        
        //Agregamos los objetos predicados de contruccion
        this._clases.put("IGUAL", "modelado.relaciones.Igual");
        this._clases.put("OR", "modelado.relaciones.Or");
    }
    
    public GeneradorPredicados(HashMap<String, EstructuraPredicado> pred) {
        this._definidor = pred;
        cargarClases();
    }
    
    public Verificador getPredicado(String Id, ArrayList<Elemento> parametros){
        ArrayList<Verificador> parciales = new ArrayList(); 
        //mantenemos los evaluadores parciales para generar nuevos evaluadores compuestos.
        ArrayList<String> lista = _definidor.get(Id).getListaClaves();
        //lista que posee las claves de las contruccion de objetos de predicados
        ArrayList<Integer> numparametro = _definidor.get(Id).getListaParam();
        //lista que define el roden en el que son utilizados los lelementos, el orden es creciente.
        ArrayList<String> atributo = _definidor.get(Id).getListaAtributos();
        //lista donde figuran los atributos que se utilizan.
        int Index = 0;
        /*
        For (lista de claves)
            if (es "simple") //Igual
                hace new del elemento con 2 parametros de la lista
        else (Es "compuesto") //
                hace el New del compuesto, 
                y le agrega los parciales hasta que lo vacie
                se agrega en la lista de parciales
        */
        int valor2;
        int valor1;
        for (int pos = 0; pos < lista.size() ; pos++) {
            //recorremos la lista de claves
            if(lista.get(pos).equals("IGUAL")){ //Simple (que utiliza parametros)
            try {
                
                valor1 = parametros.get(numparametro.get(Index)).getvalue(atributo.get(Index));
                Index ++;
                if (numparametro.get(Index).equals(-1)){ //si es un valor especifico
                    valor2 =  Integer.parseInt(atributo.get(Index));
                } else{
                    valor2 = parametros.get(numparametro.get(Index)).getvalue(atributo.get(Index));
                    Index ++;
                }
                parciales.add((Verificador) Class.forName(_clases.get(lista.get(pos))).newInstance());
                pos++;
            } catch (Exception ex) {
                     System.err.println("EXPLOTO LA GENERACION DE CLASES SIMPLE !!!!!!!!!");//Hacer algo
                }
            }
            if(lista.get(pos).equals("OR")){ //compuesto (que utiliza parciales)
                try {
                    Compuesto aux = (Compuesto) Class.forName(_clases.get(lista.get(pos))).newInstance();
                    aux.setEvaluadores(parciales);
                    //Eliminar todos los elementos
                    
                    pos++;
                } catch (Exception ex) {
                         System.err.println("EXPLOTO LA GENERACION DE CLASES COMPUESTO !!!!!!!!!");//Hacer algo
                    }
                }
            }
        return parciales.get(0);
    }

    public boolean cantidadParametrosCorrectos(String id, int parametros) {
        return (this._definidor.get(id).getCantidadParametros() == parametros);
    }

    public boolean existeId(String id) {
        return this._definidor.containsKey(id);
    }

    @Override
    public String toString() {
        return "GeneradorPredicados{" + "Lista de Clases=" + _clases + ", \n EstrucPredicados =" + _definidor + '}';
    }
}
