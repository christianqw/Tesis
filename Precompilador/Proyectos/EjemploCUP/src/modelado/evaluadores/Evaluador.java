/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelado.evaluadores;

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public abstract class Evaluador {

    @Override
    public abstract String toString();

    public abstract boolean evaluar();
     
}