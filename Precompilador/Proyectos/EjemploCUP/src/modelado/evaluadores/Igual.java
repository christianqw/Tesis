/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelado.evaluadores;
/**
 *
 * @author Chris
 */
public class Igual extends Evaluador{

    private final Integer _value1, _value2;
   
    public Igual(int value1, int value2) {
        this._value1 = value1;
        this._value2 = value2;
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean evaluar() {
         return _value1.equals(_value2);
    }

}
