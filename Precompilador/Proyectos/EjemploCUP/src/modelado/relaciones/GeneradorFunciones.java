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
public class GeneradorFunciones {
    
    private static HashMap<String, Evaluador> _funciones; 
    
    public static void cargarFunciones(){
        /*Genera los objetos de las funciones que son definidas en el archivo
     de configuracion, de esta forma se permite redefinir los nombres de las funciones
        y ademas eliminar si alguna no forma parte de los componentes.*/
    }
    
    public GeneradorFunciones(){
        //Cargamos las funciones que la configuracion determina.
        
    }
    
    public Evaluador getFuncion(String Id, ArrayList<Elemento> parametros, ArrayList<Elemento> dom){
       //las verificaciones de Existencia y de cantidad de paramentros se realizan previo a invocar esta funcion
        Evaluador fun = this._funciones.get(Id);
        fun.setParametros(parametros);
        fun.setInstanciaDominio(dom);
        return fun;
    }
    
    public boolean cantidadParametrosCorrectos(String id, int parametros) {
        return (this._funciones.get(id).getCantidadParametros() == parametros);
    }

    public boolean existeId(String id) {
        return this._funciones.containsKey(id);
    }
    
}
