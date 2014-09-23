/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraLogica;

import java.util.Collection;
import java.util.HashMap;
import modelado.*;

/**
 *
 * @author Chris
 */
public class Variable extends Termino{

    private String id;
    
    public String evaluar(Modelo m, HashMap<String, String> instancia, modelado.Error e) {
        String temp = this.id;
        
        //verifica si la variable existe en la instacia
        if (instancia.containsKey(this.id))
            temp = instancia.get(this.id);
        //verifica en el dominio
        Collection dominio = m.getDominio();
        if (!dominio.contains(temp)){
            e.setError(modelado.Error.tipoError.VARLIBRE, temp);
            return "";
        }   
        return temp;
    }

    public Variable(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Variable{" + "id=" + id + '}';
    }    
    
}
