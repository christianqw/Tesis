/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelado;

import java.util.HashMap;
import modelado.data.Atributo;

/**
 *
 * @author Chris
 */
public class Elemento {
    
    private HashMap<String, Atributo> _atributos;
    private int _posx, _posy;
    private String _name;

    void setPosicion(int x, int y) {
        this._posx = x;
        this._posy = y;
    }
    
    void setNombre(String name){
        this._name= name;
    }

    public int getvalue(String nameAtributo) {
        return _atributos.get(nameAtributo).getValue();
    }
    
    
    
}
