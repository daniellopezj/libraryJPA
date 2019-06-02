package co.edu.uptc.sw2.libreria.servicios.logica;

import co.edu.uptc.sw2.libreria.persistencia.LibroDao;
import co.edu.uptc.sw2.libreria.persistencia.entities.Libro;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class LibroLogica {

    @EJB
    private LibroDao dao;

    public List<Libro> obtenerlibrologica() {
        return dao.getLibroDao();
    }

    public List<String> deleteLibroLogica(int id) {
        return dao.deleteLibroDao(id);
    }

    public List<String> addLibroLogica(Libro c) {
        return dao.postLibroDao(c);
    }

    public List<String> updateLibroLogica(Libro c) {
        return dao.PutLibroDao(c);
    }
}
