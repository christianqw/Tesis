package loteria;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/ganador")
public class DemoController {
   private Ticket ganador;
   
   @RequestMapping(method = RequestMethod.GET)
   public @ResponseBody Ticket showWinner(ModelMap model) {
      if ( ganador == null ) {
         ganador = new Ticket(45678);
      }
      return ganador;
   }
}
