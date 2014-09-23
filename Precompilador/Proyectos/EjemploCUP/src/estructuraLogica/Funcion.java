/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraLogica;

import java.util.ArrayList;
import java.util.HashMap;
import modelado.Modelo;

/**
 *
 * @author Chris
 */
public class Funcion extends Termino{
    
    private String id;
    private ArrayList<Termino> terminos;

    public Funcion(String id) {
        this.id = id;
    }

    public Funcion(String id, ArrayList<Termino> terminos) {
        this.id = id;
        this.terminos = terminos;
    }

    public void AgregarTermino(Termino t){
        this.terminos.add(t);
    }
    
    @Override
    public String evaluar(Modelo m, HashMap<String, String> instancia, modelado.Error e) {
       ArrayList<String> consulta = new ArrayList<String>();
       int cont = 0;
       while (cont < this.terminos.size() && e.getTipoError()== modelado.Error.tipoError.SINERROR){
            consulta.add(this.terminos.get(cont).evaluar(m, instancia, e));
            cont++;
       };
       
       String res;
       if (e.getTipoError() == modelado.Error.tipoError.SINERROR){
           res = m.evaluarFuncion(this.id, consulta, e);
           if (e.getTipoError() != modelado.Error.tipoError.SINERROR)
               res = "";
       }else res = "";
    
       return res;
    }

    @Override
    public String toString() {
        return "Funcion{" + "id=" + id + ", terminos=" + terminos + '}';
    }

}
