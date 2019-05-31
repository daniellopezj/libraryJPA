package co.edu.uptc.sw2.libreria.persistencia;

import co.edu.uptc.sw2.libreria.persistencia.entities.Autor;
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
}
