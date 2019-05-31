package co.edu.uptc.sw2.libreria.servicios;

import co.edu.uptc.sw2.libreria.persistencia.entities.Autor;
import co.edu.uptc.sw2.libreria.servicios.logica.AutorLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("Autor")
public class AutorServicio {

    @EJB
    private AutorLogica dfl;

    @GET
    public List<Autor> getAutor() {
        return dfl.obtenerAutorLogica();
    }
}

