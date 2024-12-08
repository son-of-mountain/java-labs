package ma.fstt.jaxrsapp;

import jakarta.ejb.EJB;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import ma.fstt.ejb.HelloRemote;

@Path("/hello-world")
public class HelloResource {


    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @GET
    @Path("/hellomessage")
    @Produces("text/plain")
    public String ejbHello(@QueryParam("message") String message) {


        return "Hello " + message ;

    }


    @POST
    @Path("/req")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User reqHello(User user) {


        return user ;

    }

}


