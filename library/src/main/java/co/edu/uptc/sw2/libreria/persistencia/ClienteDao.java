package co.edu.uptc.sw2.libreria.persistencia;

import co.edu.uptc.sw2.libreria.persistencia.entities.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ClienteDao {

    @PersistenceContext
    private EntityManager em;

    public List<Cliente> getClienteDao() {
        String query = "Select c from  Cliente c";
        return em.createQuery(query).getResultList();
    }
}