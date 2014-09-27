/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraLogica;

import java.util.ArrayList;
import java.util.HashMap;
import modelado.Modelo;

/**
 *
 * @author Chris
 */
public class Funcion extends Termino{
    
    private final String _id;
    private ArrayList<Termino> _terminos;

    /**
     *
     * @param id
     */
    public Funcion(String id) {
        this._id = id;
    }

    public Funcion(String id, ArrayList<Termino> terminos) {
        this._id = id;
        this._terminos = terminos;
    }

    public void AgregarTermino(Termino t){
        this._terminos.add(t);
    }
    
    @Override
    @SuppressWarnings("empty-statement")
    public String evaluar(Modelo m, HashMap<String, String> instancia, modelado.Error e) {
       ArrayList<String> parametros = new ArrayList();
       
       /* definicion de los parametros de la función 
       Se realiza una busqueda de los diferenetes parametros 
       para poder hacer la correspondiente evaluacion */
       int cont = 0;
       while (cont < this._terminos.size() && e.getTipoError()== modelado.Error.tipoError.SINERROR){
            parametros.add(this._terminos.get(cont).evaluar(m, instancia, e));
            cont++;
       };
       
       String res;
       if (e.getTipoError() == modelado.Error.tipoError.SINERROR){
           res = m.evaluarFuncion(this._id, parametros, e);
           if (e.getTipoError() != modelado.Error.tipoError.SINERROR){
               res = ""; 
               /*"evaluarFuncion"1 retorna ' ' pero para una mayor 
               consistencia se le asigna el resultado de error de 
               forma explicita.*/
           }
       } else res = "";
    
       return res;
    }

    @Override
    public String toString() {
        return "Funcion{" + "id=" + this._id + ", terminos=" + this._terminos + '}';
    }

}
