/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author Danny Mencos
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            parser p = new parser(new Yylex(new java.io.FileInputStream("D:\\Ejemplo\\entrada.txt")));
            p.parse();
        }
        catch(Exception e) { System.out.println(e.getMessage());}
    }
}
