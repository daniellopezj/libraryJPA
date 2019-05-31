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
}