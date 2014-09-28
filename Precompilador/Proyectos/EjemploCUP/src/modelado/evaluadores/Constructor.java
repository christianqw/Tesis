/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelado.evaluadores;

import java.util.ArrayList;
import java.util.HashMap;
import modelado.Elemento;
import modelado.data.EstructuraPredicado;

/**
 *
 * @author Chris
 */
public class Constructor {
    
    private static HashMap<String, String> _clases; 
    private static HashMap<String, EstructuraPredicado> _definidor;

    
    public static void cargarClases(){
        _clases.put("IGUAL", "modelado.evaluadores.Igual");
        _clases.put("OR", "modelado.evaluadores.Or");
    }
    
    public Constructor() {
        cargarClases();
    }
    
    public Evaluador getPredicado(String Id, ArrayList<Elemento> parametros){
        ArrayList<Evaluador> parciales = new ArrayList();
        ArrayList<String> lista = _definidor.get(Id).getListaClaves();
        ArrayList<Integer> numparametro = _definidor.get(Id).getListaParam();
        ArrayList<String> atributo = _definidor.get(Id).getListaAtributos();
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
                parciales.add((Evaluador) Class.forName(_clases.get(lista.get(pos))).newInstance());
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
    
}
