package demo;

/**
 * Created by 154415p on 11/14/2016.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hi") //this annotation denotes that path to access the web service, similar to the @url-patterns in servlet.
public class HiWorld {
    @GET //denotes the handler to handle the GET method call
    @Produces(MediaType.TEXT_PLAIN) //denotes the return type of the messages.  In this case, a plain text is returned.
    public String getMessage() {
        return "Hi world! (PLAIN)";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String getXMLMessage(){
        return "<hi>Hi world!(XML)</hi>";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHTMLMessage(){
        return "<b>Hi world! (HTML)</b>";
    }
}