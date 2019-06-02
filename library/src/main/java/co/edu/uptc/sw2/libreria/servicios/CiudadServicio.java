package co.edu.uptc.sw2.libreria.servicios;

import co.edu.uptc.sw2.libreria.persistencia.entities.Ciudad;
import co.edu.uptc.sw2.libreria.servicios.logica.CiudadLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("Ciudad")
public class CiudadServicio {

    @EJB
    private CiudadLogica dfl;

    @GET
    public List<Ciudad> getCiudad() {
        return dfl.obtenerCiudadLogica();
    }

    @POST
    public List<String> addCiudad(Ciudad c){
            return dfl.addCiudadLogica(c);
    }
    
    @PUT
    public List<String> updateCiudad(Ciudad c){
            return dfl.updateCiudadLogica(c);
    }
    
    @DELETE
    @Path("/{id}")
    public List<String> DeleteCiudad(@PathParam("id") int user) {
        return dfl.deleteCiudadLogica(user);
    }    
    
    @GET
    @Path("/")
    @Produces({MediaType.TEXT_PLAIN})
    public Response index() {
        return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .entity("")
                .build();
    }
}
