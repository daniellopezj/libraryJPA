package co.edu.uptc.sw2.libreria.persistencia;

import co.edu.uptc.sw2.libreria.persistencia.entities.Ciudad;
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
}
