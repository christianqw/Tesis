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
public abstract class Compuesto extends Evaluador{

    private ArrayList<Evaluador> _elementos;

    public void setEvaluadores (ArrayList<Evaluador> comp) {
        this._elementos = comp;
    }   
    
    public void addComparador(Evaluador c) {
        this._elementos.add(c);
    }  
    
}
