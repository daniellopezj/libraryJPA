package co.edu.uptc.sw2.libreria.persistencia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autor {

    @Id
    private int id;
    private String name;
    private String nacionalidad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
