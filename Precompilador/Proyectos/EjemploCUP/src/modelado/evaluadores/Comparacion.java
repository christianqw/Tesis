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
public abstract class Comparacion extends Evaluador{
    
    /*
    Los evaluadores de menor, mayor e igual, lo que hacen es comparar si 
    */
    
    private int _att1;
    private int _att2;
    private int _param1;
    private int _param2;

    public Comparacion() {
    }
    
    public void setElemIzq(int atributo, int posParametro){
        this._att1 = atributo;
        this._param1 = posParametro;
    }
    
    public void setElemDer(int atributo, int posParametro){
        this._att2 = atributo;
        this._param2 = posParametro;
    }
    
}