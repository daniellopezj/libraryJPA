package co.edu.uptc.sw2.libreria.persistencia;

import co.edu.uptc.sw2.libreria.persistencia.entities.Autor;
import co.edu.uptc.sw2.libreria.persistencia.entities.Ciudad;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AutorDao {

    @PersistenceContext
    private EntityManager em;

    public List<Autor> getAutorDao() {
        String query = "Select a from  Autor a";
        return em.createQuery(query).getResultList();
    }
    
    public List<String> deleteAutorDao(int id) {
        Autor c = em.find(Autor.class, id);
        em.remove(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }

    public List<String> postAutorDao(Autor c) {
        em.persist(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }

    public List<String> PutAutorDao(Autor c) {
        em.merge(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }
}
