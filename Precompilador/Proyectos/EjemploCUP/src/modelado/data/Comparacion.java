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
public abstract class Comparacion extends Evaluador{
    
    /*
    Los evaluadores de menor, mayor e igual, lo que hacen es comparar si 
    */
    
    private String _att1;
    private String _att2;

    public Comparacion(String atributo1, String atributo2) {
        this._att1 = atributo1;
        this._att2 = atributo2;
    }
    
}0