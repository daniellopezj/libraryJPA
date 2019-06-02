package co.edu.uptc.sw2.libreria.servicios;

import co.edu.uptc.sw2.libreria.persistencia.entities.Autor;
import co.edu.uptc.sw2.libreria.servicios.logica.AutorLogica;
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

@Path("Autor")
public class AutorServicio {

    @EJB
    private AutorLogica dfl;

    @GET
    public List<Autor> getAutor() {
        return dfl.obtenerAutorLogica();
    }
    
    @POST
    public List<String> addAutor(Autor c){
            return dfl.addAutorLogica(c);
    }
    
    @PUT
    public List<String> updateCiudad(Autor c){
            return dfl.updateCiudadLogica(c);
    }
    
    @DELETE
    @Path("/{id}")
    public List<String> DeleteAutor(@PathParam("id") int user) {
        return dfl.deleteAutorLogica(user);
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

