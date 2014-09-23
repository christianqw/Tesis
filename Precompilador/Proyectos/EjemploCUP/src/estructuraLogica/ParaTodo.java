/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraLogica;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import modelado.Modelo;
import modelado.Error;
/**
 *
 * @author Chris
 */
public class ParaTodo implements Formula{
    
    private Formula elemento;
    private String var;

    public ParaTodo(Formula elemento, String var) {
        this.elemento = elemento;
        this.var = var;
    }

    @Override
    public boolean verificar(Modelo m, HashMap<String, String> instancia, modelado.Error e) {
       Collection<String> dominio = m.getDominio();
        
        //se verifica que la variable exista en el dominio
        if (!dominio.contains(this.var)){ 
            e.setError(modelado.Error.tipoError.CUANTIFICACION, var);
            return false;
        }
        
        //se verifica que la variable exista en la instancia
        String temp = "";
        //Si la variable esta dentro de la instancia la almacenamos en la variable temporal
        if (instancia.containsKey(var))
            temp = instancia.get(var);
        
        Iterator<String> it = dominio.iterator();
        boolean resultado = true;
        while (it.hasNext() && resultado && (e.getTipoError() == modelado.Error.tipoError.SINERROR)){
            String valorIt = it.next();
            instancia.put(var, valorIt); // ---------- VER -----------
            resultado = this.elemento.verificar(m, instancia, e);
        }
        
        //Si se encontro algun erro cuando se verifico antes
        if (e.getTipoError() != modelado.Error.tipoError.SINERROR)
            return false;
        
        if (temp != ""){
             instancia.put(var, temp);
        }else{
            instancia.remove(var);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "ParaTodo{" + "elemento=" + elemento + ", var=" + var + '}';
    }
    
}