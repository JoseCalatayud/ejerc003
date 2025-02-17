package es.santander.ascender.ejerc003.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Boligrafo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int color;

    private String nombre;
    private boolean escribe;

    public Boligrafo() {
    }

    public Boligrafo(Long id, int color, String nombre, boolean escribe) {
        this.id = id;
        this.color = color;
        this.nombre = nombre;
        this.escribe = escribe;
    }
    

    public Boligrafo(int color, String nombre, boolean escribe) {
        this.color = color;
        this.nombre = nombre;
        this.escribe = escribe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {

        this.color = color;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEscribe() {
        return escribe;
    }

    public void setEscribe(boolean escribe) {
        this.escribe = escribe;
    }

}
