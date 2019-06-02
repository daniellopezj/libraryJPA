package co.edu.uptc.sw2.libreria.persistencia;

import co.edu.uptc.sw2.libreria.persistencia.entities.Cliente;
import java.util.ArrayList;
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
    
    public List<String> deleteClienteDao(int id) {
        Cliente c = em.find(Cliente.class, id);
        em.remove(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }

    public List<String> postClienteDao(Cliente c) {
        em.persist(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }

    public List<String> PutClienteDao(Cliente c) {
        em.merge(c);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }
}