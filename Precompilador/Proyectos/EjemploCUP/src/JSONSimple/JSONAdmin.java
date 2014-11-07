/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JSONSimple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import modelado.data.EstructuraElemento;
import modelado.data.EstructuraPredicado;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Chris
 */
public class JSONAdmin {
    
    
    public EstructuraElemento ReadJSONElemento (String ruta){
        JSONParser parser = new JSONParser();  
        try {  
            //Cargamos el Archivo para ser parseado
            Object obj = parser.parse(new FileReader(ruta));  
            //Se realiza el casteo del mismo
            JSONObject jsonObject = (JSONObject) obj;  
           //obtenemos el Dominio de los elementos definidos (primer atributo)
            String nameOfElement = (String) jsonObject.get("Dominio");  

           // Generamos la estructuraElemento a partir  de la lectura del archivo JSON
            EstructuraElemento estructura = new EstructuraElemento();
            estructura.setDominio(nameOfElement);
           //Comnezamos a cargar los distintos atributos
            JSONArray listOfAtributos; //Lista de Atributos definidos
            JSONObject jsonAtributo;
            JSONArray listOfOpciones;  //Lista de opciones de cada atributo

            listOfAtributos = (JSONArray)jsonObject.get("ListAtributos"); 
            int indexOpciones, indexAtributo;
            indexAtributo = 0;
            while (indexAtributo < listOfAtributos.size()) {  //Recorremos todos los Atributos
                jsonAtributo = (JSONObject) listOfAtributos.get(indexAtributo);
                //obtenemos el nombre del atributo
                String nameOfAtributo = (String) jsonAtributo.get("Atributo");  
                listOfOpciones = (JSONArray)jsonAtributo.get("Opciones");
                //Generamos una lista con las opciones del atributo
                ArrayList<String> listOpciones = new ArrayList<>();
                indexOpciones = 0;
                while (indexOpciones < listOfOpciones.size()){
                    String Opcion = (String) listOfOpciones.get(indexOpciones); 
                    listOpciones.add(Opcion);
                    indexOpciones++;
                }
                indexAtributo++;
                //Agregamos el atributo y sus opciones a la estructura
                estructura.AddAtributo(nameOfAtributo, listOpciones);
            } 
            return estructura;
      } catch (FileNotFoundException e) {
            System.out.println("   FileNotFoundException "); 
            e.printStackTrace();  
            return null;
      } catch (IOException e) {  
            System.out.println("   IOException "); 
            e.printStackTrace(); 
            return null;
      } catch (ParseException e) {
            System.out.println("ParseException" ); 
            System.out.println("Posible pos: "+ e.getPosition() + " Posible error con: " + e);
            e.printStackTrace(); 
            return null;
      }  

    } 
    
    public EstructuraPredicado ReadJSONPredicado (String Ruta){
        return null;
    }
    
 public void WriteJSONElemento(){
     
 }



}
    