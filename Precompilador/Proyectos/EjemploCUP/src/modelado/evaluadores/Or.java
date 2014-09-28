/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelado.evaluadores;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Chris
 */
public class Or extends Compuesto{
 
    private ArrayList<Evaluador> _elementos;

    public Or() {
         this._elementos = new ArrayList() ;
    }   
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("OR de comparadores");
    }

    @Override
    public boolean evaluar() {
        boolean parcial = false;
        Iterator<Evaluador> it = _elementos.iterator();
        while (!parcial && it.hasNext()){
            parcial = parcial || it.next().evaluar();
        }
        return parcial;
    }
    
    
    
}
