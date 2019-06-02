package co.edu.uptc.sw2.libreria.servicios.logica;

import co.edu.uptc.sw2.libreria.persistencia.ClienteDao;
import co.edu.uptc.sw2.libreria.persistencia.entities.Cliente;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ClienteLogica {
    
    @EJB
    private ClienteDao dao;
    
    public List<Cliente> obtenerClienteLogica(){
     return dao.getClienteDao();
    }
    
     public List<String> deleteClienteLogica(int id) {
        return dao.deleteClienteDao(id);
    }

    public List<String> addClienteLogica(Cliente c) {
        return dao.postClienteDao(c);
    }
    
     public List<String> updateCiudadLogica(Cliente c) {
        return dao.PutClienteDao(c);
    }
}