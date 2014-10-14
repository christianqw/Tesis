package jsonsimpleexample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  

/**
 *
 * @author Chris
 */
import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;  

public class JSONSimpleWritingToFileExample {  
  
    public static void main(String[] args) {  
  
        JSONObject countryObj = new JSONObject();  
        countryObj.put("Dom", "Figura");  
        //countryObj.put("Population", new Integer(1000000));  
  
        JSONArray listOfTypes = new JSONArray();  
        listOfTypes.add("circulo");  
        listOfTypes.add("piramide");  
        listOfTypes.add("hexaedro");  
  
        countryObj.put("Tipo", listOfTypes);  
        
        JSONArray listOfSize = new JSONArray();  
        listOfSize.add("chico");  
        listOfSize.add("mediano");  
        listOfSize.add("grande");  
  
        countryObj.put("Tamaño", listOfSize);  
  
        listOfTypes = new JSONArray();  
        listOfTypes.add(new Integer(1));  
        listOfTypes.add(new Integer(2));  
        listOfTypes.add(new Integer(3));  
  
        countryObj.put("Col", listOfTypes);  
        countryObj.put("Fil", listOfTypes);  
        
        try {  
              
            // Writing to a file  
            File file=new File("ExampleConfigJSONFile.json");  
            file.createNewFile();  
            FileWriter fileWriter = new FileWriter(file);  
            System.out.println("Writing JSON object to file");  
            System.out.println("-----------------------");  
            System.out.print(countryObj);  
  
            fileWriter.write(countryObj.toJSONString());  
            fileWriter.flush();  
            fileWriter.close();  
  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
}  
