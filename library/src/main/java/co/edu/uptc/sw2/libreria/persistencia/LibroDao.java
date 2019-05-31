package co.edu.uptc.sw2.libreria.persistencia;

import co.edu.uptc.sw2.libreria.persistencia.entities.Libro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LibroDao {

    @PersistenceContext
    private EntityManager em;

    public List<Libro> getLibroDao() {
        String query = "Select l from  Libro l";
        return em.createQuery(query).getResultList();
    }
}