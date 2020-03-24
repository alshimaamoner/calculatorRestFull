package service;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

@Path("/Calculator")
public class CalculatorImpl {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public double add(@QueryParam("num1")double num1,@QueryParam("num2") double num2) {
        return num1+num2;
    }
    @GET
    @Path("sub/{num1}/{num2}")
    @Produces(MediaType.TEXT_PLAIN)
    public double sub(@PathParam("num1")double num1,@PathParam("num2")  double num2) {
        return num1-num2;
    }
    @GET
    @Path("mul/{num1}/{num2}")
    @Produces(MediaType.TEXT_PLAIN)
    public double mul(@PathParam("num1")double num1,@PathParam("num2")double num2) {
        return num1*num2;
    }
   @GET
    @Path("div/{num1}/{num2}")
    @Produces(MediaType.TEXT_PLAIN)
    public double div(@PathParam("num1") double num1, @PathParam("num2")  double num2) {
        return num1/num2;
    }

}