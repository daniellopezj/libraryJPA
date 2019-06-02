package co.edu.uptc.sw2.libreria.persistencia;

import co.edu.uptc.sw2.libreria.persistencia.entities.Ciudad;
import co.edu.uptc.sw2.libreria.persistencia.entities.Prestamo;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PrestamoDao {

    @PersistenceContext
    private EntityManager em;

    public List<Prestamo> getPrestamoDao() {
        String query = "Select p from  Prestamo p";
        return em.createQuery(query).getResultList();
    }
    
       public List<String> deletePrestamoDao(int id) {
        Prestamo c = em.find(Prestamo.class, id);
        em.remove(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }

    public List<String> postPrestamoDao(Prestamo c) {
        em.persist(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }

    public List<String> PutPrestamoDao(Prestamo c) {
        em.merge(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }
}