package JSONSimple;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONValue;
import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;  
/**
 *
 * @author Chris
 */
 

public class JSONWrite {  
    
    /*
    Mediante la presente clase se desarrolla un generador de archivos de configuracion, que por el momento
    intenta definir los ditintos atributos y sus opciones de los elementos del modelo.
    Para mejor legibilidad se Inplementas los archivos de configuracion de forma que 
    se mantenga el orden en el que se definen los componentes.
    */
  
    public static void main(String[] args) {  
  
        Map ElementObj = new  LinkedHashMap();  
        //permite que conserve el orden de los elementos agregados. 
        
        ElementObj.put("Dominio", "Figura");  

        JSONArray listOfAtributos = new JSONArray(); 
        
        ArrayList<String> opciones = new ArrayList<String> ();
        opciones.add("circulo");  
        opciones.add("piramide");  
        opciones.add("hexaedro");  
        listOfAtributos.add(new AtributoJSON("Tipo", opciones));  
        
        opciones = new ArrayList<String> ();
        opciones.add("chico");  
        opciones.add("mediano");  
        opciones.add("grande"); 
        listOfAtributos.add(new AtributoJSON("Tamaño", opciones));  

        opciones = new ArrayList<String> ();
        opciones.add("1");  
        opciones.add("2");  
        opciones.add("3");
        
        listOfAtributos.add(new AtributoJSON("Col", opciones)); 

        listOfAtributos.add(new AtributoJSON("Fil", opciones)); 
        
        ElementObj.put("ListAtributos", listOfAtributos); 
        
        JSONArray users = new JSONArray();
        users.add(new AtributoJSON("Tipo", opciones));
        users.add(new AtributoJSON("Fil", opciones));
        users.add(new AtributoJSON("Col", opciones));
        System.out.println(users);
        
        
        try {  
              
            // Writing to a file  
            File file=new File("ExampleConfigJSONFile.json");  
            file.createNewFile();  
            FileWriter fileWriter = new FileWriter(file);  
            
            //para generar el String a guardar
            StringWriter out = new StringWriter();
            JSONValue.writeJSONString(ElementObj, out);
            String jsonText = out.toString();
            
            System.out.println("Writing JSON object to file");  
            System.out.println("-----------------------");  
            System.out.println(jsonText);  
            
            fileWriter.write( jsonText);  
            fileWriter.flush();  
            fileWriter.close();  
  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
}  
