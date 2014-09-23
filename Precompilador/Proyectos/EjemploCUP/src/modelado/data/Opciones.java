/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelado.data;

import java.util.Set;

/**
 *
 * @author Chris
 */
public class Opciones {
    
    private Set<String> _opciones;
    private String _clave;

    public Opciones(Set<String> _opciones, String _clave) {
        this._opciones = _opciones;
        this._clave = _clave;
    }
    
    public boolean contains(String name){
         return this._opciones.contains(name);
    }
    
    public boolean add(String name){
        return this.add(name);
    }
    public boolean isEmpty(){
        return this._opciones.isEmpty();
    }
    public boolean remove (String name){
        return this._opciones.remove(name);
    }
    public int size(){
        return this._opciones.size();
    }
    public void setClave(String name){
        this._clave = name; 
    }
}
