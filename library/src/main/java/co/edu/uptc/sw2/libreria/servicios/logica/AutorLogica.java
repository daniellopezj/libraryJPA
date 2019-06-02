package co.edu.uptc.sw2.libreria.servicios.logica;

import co.edu.uptc.sw2.libreria.persistencia.AutorDao;
import co.edu.uptc.sw2.libreria.persistencia.entities.Autor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class AutorLogica {
    
    @EJB
    private AutorDao dao;
    
    public List<Autor> obtenerAutorLogica(){
     return dao.getAutorDao();
    }
    
     public List<String> deleteAutorLogica(int id) {
        return dao.deleteAutorDao(id);
    }

    public List<String> addAutorLogica(Autor c) {
        return dao.postAutorDao(c);
    }
    
     public List<String> updateCiudadLogica(Autor c) {
        return dao.PutAutorDao(c);
    }
}