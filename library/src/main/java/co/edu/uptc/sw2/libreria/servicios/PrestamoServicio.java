package co.edu.uptc.sw2.libreria.servicios;
import co.edu.uptc.sw2.libreria.persistencia.entities.Prestamo;
import co.edu.uptc.sw2.libreria.servicios.logica.PrestamoLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("Prestamo")
public class PrestamoServicio {

    @EJB
    private PrestamoLogica dfl;

    @GET
    public List<Prestamo> getlibro() {
        return dfl.obtenerPrestamoLogica();
    }
}