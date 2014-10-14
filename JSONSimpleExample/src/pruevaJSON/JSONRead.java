/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruevaJSON;  
  
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
  
  JSONParser parser = new JSONParser();  
  
  try {  
  
   Object obj = parser.parse(new FileReader("ExampleConfigJSONFile.json"));  
  
   JSONObject jsonObject = (JSONObject) obj;  
  
   String nameOfCountry = (String) jsonObject.get("Name");  
   System.out.println("Name Of Country: "+nameOfCountry);  
  
   long population = (long) jsonObject.get("Population");  
   System.out.println("Population: "+population);  
  
   System.out.println("States are :");  
   JSONArray listOfStates = (JSONArray) jsonObject.get("States");  
   Iterator<String> iterator = listOfStates.iterator();  
   while (iterator.hasNext()) {  
    System.out.println(iterator.next());  
   }  
  
  } catch (FileNotFoundException e) {  
   e.printStackTrace();  
  } catch (IOException e) {  
   e.printStackTrace();  
  } catch (ParseException e) {  
   e.printStackTrace();  
  }  
  
 }  
}   

