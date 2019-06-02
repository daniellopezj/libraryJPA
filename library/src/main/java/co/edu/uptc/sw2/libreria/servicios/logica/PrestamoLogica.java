package co.edu.uptc.sw2.libreria.servicios.logica;

import co.edu.uptc.sw2.libreria.persistencia.PrestamoDao;
import co.edu.uptc.sw2.libreria.persistencia.entities.Prestamo;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class PrestamoLogica {

    @EJB
    private PrestamoDao dao;

    public List<Prestamo> obtenerPrestamoLogica() {
        return dao.getPrestamoDao();
    }
    
    
    public List<String> deletePrestamoLogica(int id) {
        return dao.deletePrestamoDao(id);
    }

    public List<String> addPrestamoLogica(Prestamo c) {
        return dao.postPrestamoDao(c);
    }

    public List<String> updatePrestamoLogica(Prestamo c) {
        return dao.PutPrestamoDao(c);
    }
}