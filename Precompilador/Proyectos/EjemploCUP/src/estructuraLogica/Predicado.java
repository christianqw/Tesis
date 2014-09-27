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
public class Predicado implements Formula{
    
    private final String _id;
    private ArrayList<Termino> _terminos;

    public Predicado(String id) {
        this._id = id;
    }

    public Predicado(String id, ArrayList<Termino> terminos) {
        this._id = id;
        this._terminos = terminos;
    }
    
    public void agregarTermino(Termino t){
        this._terminos.add(t);
    };

    @Override
    public boolean verificar(Modelo m, HashMap<String, String> instancia, modelado.Error e) {
        ArrayList<String> consulta = new ArrayList<String>();
        
        //primero busca las distintas variables intervinientes (pueden ser resultados de funciones)
        int cont = 0;
        while (cont < this._terminos.size() && e.getTipoError() == modelado.Error.tipoError.SINERROR){
            consulta.add(this._terminos.get(cont).evaluar(m, instancia, e));
            cont++;
        }
        
        //realizamos la verificacion y la evaluacion del predicado dentro del modelo en cuestion
        boolean res = true; 
        if (e.getTipoError()!= modelado.Error.tipoError.SINERROR)
            res = false; 
        else {
            res = m.verificarPredicado(this._id, consulta, e);
            if (e.getTipoError()!=modelado.Error.tipoError.SINERROR)
                res = false;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Predicado{" + "id=" + this._id + ", terminos=" + this._terminos + '}';
    }
   
}
