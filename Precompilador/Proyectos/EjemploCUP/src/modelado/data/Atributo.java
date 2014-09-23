/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelado.data;
import java.util.Collection;
import java.util.Set;
/**
 *
 * @author Chris
 */
public class Atributo {
    
    private Opciones _opciones;
    private String _value;

    public Atributo(Opciones opciones) {
        this._opciones = opciones;
    }

    public Atributo(Opciones opciones, String value) {
        this._opciones = opciones;
        this._value = value;
    }

    public String getValue() {
        return _value;
    }

    public boolean setValue(String value) {
        if (this._opciones.contains(value)){
            this._value = _value;
            return true;
        }
        else return false; 
    }
    
    
}
