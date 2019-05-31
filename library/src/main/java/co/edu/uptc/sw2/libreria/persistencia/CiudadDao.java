package co.edu.uptc.sw2.libreria.persistencia;

import co.edu.uptc.sw2.libreria.persistencia.entities.Ciudad;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CiudadDao {

    @PersistenceContext
    private EntityManager em;

    public List<Ciudad> getCiudadDao() {
        String query = "Select c from  Ciudad c";
        return em.createQuery(query).getResultList();
    }

    public List<String> deleteCiudadDao(int id) {
        Ciudad c = em.find(Ciudad.class, id);
        em.remove(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }
    
    public List<String> postCiudadDao(Ciudad  c) {
        em.persist(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }
}
