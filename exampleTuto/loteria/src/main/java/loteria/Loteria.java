package loteria;

public class Loteria {
   public String path(String path) {
      return "http://localhost:8080/loteria/"+ path;
   }

   public Ticket ganador() throws Exception {
      DefaultHttpClient httpclient = new DefaultHttpClient();
      HttpResponse response = httpclient.execute(new HttpGet(path("/ganador")));
      ObjectMapper mapper = new ObjectMapper();
      return mapper.readValue( EntityUtils.toString(response.getEntity()), Ticket.class);
   }
}
