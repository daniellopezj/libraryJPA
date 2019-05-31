package co.edu.uptc.sw2.libreria.servicios.logica;

import co.edu.uptc.sw2.libreria.persistencia.CiudadDao;
import co.edu.uptc.sw2.libreria.persistencia.entities.Ciudad;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class CiudadLogica {
    
    @EJB
    private CiudadDao dao;
    
    public List<Ciudad> obtenerCiudadLogica(){
     return dao.getCiudadDao();
    }
}