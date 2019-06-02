package co.edu.uptc.sw2.libreria.servicios;

import co.edu.uptc.sw2.libreria.persistencia.entities.Cliente;
import co.edu.uptc.sw2.libreria.servicios.logica.ClienteLogica;
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

@Path("Cliente")
public class ClienteServicio {

    @EJB
    private ClienteLogica dfl;

    @GET
    public List<Cliente> getCliente() {
        return dfl.obtenerClienteLogica();
    }
    
   @POST
    public List<String> addCliente(Cliente c){
            return dfl.addClienteLogica(c);
    }
    
    @PUT
    public List<String> updateCliente(Cliente c){
            return dfl.updateCiudadLogica(c);
    }
    
    @DELETE
    @Path("/{id}")
    public List<String> DeleteCliente(@PathParam("id") int user) {
        return dfl.deleteClienteLogica(user);
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