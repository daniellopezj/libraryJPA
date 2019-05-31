package co.edu.uptc.sw2.libreria.servicios;

import co.edu.uptc.sw2.libreria.persistencia.entities.Cliente;
import co.edu.uptc.sw2.libreria.servicios.logica.ClienteLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("Cliente")
public class ClienteServicio {

    @EJB
    private ClienteLogica dfl;

    @GET
    public List<Cliente> getCiudad() {
        return dfl.obtenerClienteLogica();
    }
    
    public void list(){
    }
}