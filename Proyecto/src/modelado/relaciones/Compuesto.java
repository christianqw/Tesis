/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelado.relaciones;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Chris
 */
public abstract class Compuesto extends Verificador{

    private ArrayList<Verificador> _elementos;

    public void setEvaluadores (ArrayList<Verificador> comp) {
        this._elementos = comp;
    }   
    
    public void addComparador(Verificador c) {
        this._elementos.add(c);
    }  
    
}
