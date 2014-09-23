 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraLogica;

import java.util.ArrayList;
import java.util.HashMap;
import modelado.Modelo;
import modelado.Error;

/**
 *
 * @author Chris
 */
public class Predicado implements Formula{
    
    private String id;
    private ArrayList<Termino> terminos;

    public Predicado(String id) {
        this.id = id;
    }

    public Predicado(String id, ArrayList<Termino> terminos) {
        this.id = id;
        this.terminos = terminos;
    }
    
    public void agregarTermino(Termino t){
        this.terminos.add(t);
    };

    @Override
    public boolean verificar(Modelo m, HashMap<String, String> instancia, modelado.Error e) {
        ArrayList<String> consulta = new ArrayList<String>();
        
        //primero busca las distintas variables intervinientes (pueden ser resultados de funciones)
        int cont = 0;
        while (cont < this.terminos.size() && e.getTipoError() == modelado.Error.tipoError.SINERROR){
            consulta.add(this.terminos.get(cont).evaluar(m, instancia, e));
            cont++;
        }
        
        //realizamos la verificacion y la evaluacion del predicado dentro del modelo en cuestion
        boolean res = true; 
        if (e.getTipoError()==modelado.Error.tipoError.SINERROR){
            res = m.verificarPredicado(id, consulta, e);
            if (e.getTipoError()!=modelado.Error.tipoError.SINERROR)
                res=false;
        } else res = false;
        
        return res;
    }

    @Override
    public String toString() {
        return "Predicado{" + "id=" + id + ", terminos=" + terminos + '}';
    }
   
}
