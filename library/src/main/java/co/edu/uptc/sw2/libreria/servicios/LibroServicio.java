package co.edu.uptc.sw2.libreria.servicios;
import co.edu.uptc.sw2.libreria.persistencia.entities.Libro;
import co.edu.uptc.sw2.libreria.servicios.logica.LibroLogica;
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

@Path("libro")
public class LibroServicio {

    @EJB
    private LibroLogica dfl;

    @GET
    public List<Libro> getlibro() {
        return dfl.obtenerlibrologica();
    }
      
   @POST
    public List<String> addLibro(Libro c){
            return dfl.addLibroLogica(c);
    }
    
    @PUT
    public List<String> updateLibro(Libro c){
            return dfl.updateLibroLogica(c);
    }
    
    @DELETE
    @Path("/{id}")
    public List<String> DeleteLibro(@PathParam("id") int user) {
        return dfl.deleteLibroLogica(user);
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