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
public class Simple extends Evaluador{
    /*
    Evaluador que utiliza un valor de un determinado atributo previamente definido
    los predicados definidos de forma automatica utilizan este tipo de evaluador.
    */
    
    private String _att;
    private String _value;

    public Simple(String atributo, String valor) {
        this._att = atributo;
        this._value = valor;
    }
    
    @Override
    public boolean evaluar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
