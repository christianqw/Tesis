/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONSimple;  
  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;  
import java.util.Iterator;  
import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;  
import org.json.simple.parser.JSONParser;  
import org.json.simple.parser.ParseException;  
/**
 *
 * @author Chris
 */
public class JSONRead {  
    
    /*
    Se propone que la presente clase sea capas de leer e interpretar los
    archivos de configuracion de los elementos del modelo.
    */
  
 public static void main(String[] args) {  
  
     JSONAdmin asd = new JSONAdmin("ExampleConfigJSONFile.json");
     //asd.ReadJSONElemento();
     //asd.ReadJSONFunciones();
     
     asd.ReadJSONElemento();
     asd.ReadJSONPredicado();
     asd.ReadJSONFunciones();
     
//  JSONParser parser = new JSONParser();  
//  
//  try {  
//  
//   //Cargamos el Archivo para ser parseado
//   Object obj = parser.parse(new FileReader("ExampleConfigJSONFile.json"));  
//   //Se realiza el casteo del mismo
//   JSONObject jsonObject = (JSONObject) obj;  
//  //obtenemos el Dominio de los elementos definidos (primer atributo)
//   String nameOfElement = (String) jsonObject.get("Dominio");  
//   System.out.println("Name Of Element: "+ nameOfElement);  
//  //Comnezamos a cargar los distintos atributos
//   System.out.println("Atributos :");  
//   JSONArray listOfAtributos; //Lista de Atributos definidos
//   JSONObject jsonAtributo;
//   JSONArray listOfOpciones;  //Lista de opciones de cada atributo
//   
//   listOfAtributos = (JSONArray)jsonObject.get("ListAtributos"); 
//   int indexOpciones, indexAtributo;
//   indexAtributo = 0;
//   while (indexAtributo < listOfAtributos.size()) {  //Recorremos todos los Atributos
//       jsonAtributo = (JSONObject) listOfAtributos.get(indexAtributo);
//       //obtenemos el nombre del atributo
//       String nameOfAtributo = (String) jsonAtributo.get("Atributo");  
//       System.out.println("Name Of Atributo: "+ nameOfAtributo);  
//       listOfOpciones = (JSONArray)jsonAtributo.get("Opciones");
//       System.out.println("    Opciones :"); 
//       indexOpciones = 0;
//       while (indexOpciones < listOfOpciones.size()){
//           String Opcion = (String) listOfOpciones.get(indexOpciones); 
//           System.out.println("    " + Opcion); 
//           indexOpciones++;
//       }
//       indexAtributo++;
//       
//   }  
//  
//  } catch (FileNotFoundException e) {
//        System.out.println("   FileNotFoundException "); 
//   e.printStackTrace();  
//  } catch (IOException e) {  
//        System.out.println("   IOException "); 
//   e.printStackTrace();  
//  } catch (ParseException e) {
//        System.out.println("ParseException" ); 
//        System.out.println("Posible pos: "+ e.getPosition() + " Posible error con: " + e);
//   e.printStackTrace();  
//  }  
  
 }  
}   

