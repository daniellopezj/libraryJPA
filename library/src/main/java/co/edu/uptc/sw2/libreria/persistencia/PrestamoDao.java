package co.edu.uptc.sw2.libreria.persistencia;

import co.edu.uptc.sw2.libreria.persistencia.entities.Ciudad;
import co.edu.uptc.sw2.libreria.persistencia.entities.Prestamo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PrestamoDao {

    @PersistenceContext
    private EntityManager em;

    public List<Prestamo> getPrestamoDao() {
        String query = "Select cp from  Prestamo p";
        return em.createQuery(query).getResultList();
    }
}