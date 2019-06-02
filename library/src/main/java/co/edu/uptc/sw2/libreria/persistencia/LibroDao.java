package co.edu.uptc.sw2.libreria.persistencia;

import co.edu.uptc.sw2.libreria.persistencia.entities.Libro;
import java.util.ArrayList;
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
    
      public List<String> deleteLibroDao(int id) {
        Libro c = em.find(Libro.class, id);
        em.remove(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }

    public List<String> postLibroDao(Libro c) {
        em.persist(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }

    public List<String> PutLibroDao(Libro c) {
        em.merge(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }
}