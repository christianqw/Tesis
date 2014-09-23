/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelado.data;

/**
 *
 * @author Chris
 */
public abstract class Evaluador {
    
    private int _numParametros;
    
    public abstract boolean evaluar();

    public int getNumParametros() {
        //se declara de esta forma para que el numero de parametros a retornar sea
        // el definido en el evaluador padre que define al predicado.
        return _numParametros;
    }

    public void setNumParametros(int numero) {
        this._numParametros = numero;
    }
    
    @Override
    public abstract String toString();
     
}