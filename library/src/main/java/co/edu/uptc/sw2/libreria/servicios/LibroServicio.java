package co.edu.uptc.sw2.libreria.servicios;
import co.edu.uptc.sw2.libreria.persistencia.entities.Libro;
import co.edu.uptc.sw2.libreria.servicios.logica.LibroLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("libro")
public class LibroServicio {

    @EJB
    private LibroLogica dfl;

    @GET
    public List<Libro> getlibro() {
        return dfl.obtenerlibrologica();
    }
}