/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelado.data;

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class EstructuraPredicado {

    private ArrayList<String> _listaClaves, _listaAtributos;
    private ArrayList<Integer> _listaParametros;
    private int _cantidadParametros;
    private String _id;

    public EstructuraPredicado(ArrayList<String> _listaClaves, ArrayList<String> _listaAtributos, ArrayList<Integer> _listaParametros, int _cantidadParametros, String _id) {
        this._listaClaves = _listaClaves;
        this._listaAtributos = _listaAtributos;
        this._listaParametros = _listaParametros;
        this._cantidadParametros = _cantidadParametros;
        this._id = _id;
    }
    
    public ArrayList<String> getListaClaves() {
        return this._listaClaves;
    }

    public ArrayList<Integer> getListaParam() {
        return this._listaParametros;
    }

    public ArrayList<String> getListaAtributos() {
       return this._listaAtributos;
    }
    
    public int getCantidadParametros(){
        return this._cantidadParametros;
    }

    public String getId() {
        return this._id;
    }

}
