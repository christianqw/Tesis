/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraLogica;

import java.util.HashMap;
import modelado.Modelo;
import modelado.Error;

/**
 *
 * @author Chris
 */
public class Negacion implements Formula{

    private Formula elem;

    public Negacion(Formula elem) {
        this.elem = elem;
    }
    
    @Override
    public boolean verificar(Modelo m, HashMap<String, String> instancia, modelado.Error e) {
        return (! elem.verificar(m, instancia, e));
    }

    @Override
    public String toString() {
        return "Negacion{" + "elem=" + elem + '}';
    }
    
}
