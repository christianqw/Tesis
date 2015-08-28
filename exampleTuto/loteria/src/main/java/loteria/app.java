package loteria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App  {
    public static void main( String[] args ) throws Exception {
        Loteria  loteria =  new Loteria();
        Ticket t = loteria.ganador();
        System.out.println( t );
    }
}
