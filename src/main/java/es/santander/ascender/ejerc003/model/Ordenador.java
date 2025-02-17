package es.santander.ascender.ejerc003.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class Ordenador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Min(0)
    private int teclas;

    private short[] color = new short[3];
    private boolean intel;
    @Min(0)
    private int peso;

    public Ordenador() {
    }

    public Ordenador(int teclas, short[] color, boolean intel, int peso) {
        this.teclas = teclas;
        this.color = color;
        this.intel = intel;
        this.peso = peso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTeclas() {
        return teclas;
    }

    public void setTeclas(int teclas) {
        this.teclas = teclas;
    }

    public short[] getColor() {
        return color;
    }

    public void setColor(short red, short green, short blue) {
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
            throw new IllegalArgumentException("Cada componente (R,G,B) debe estar entre 0 y 255");
        }
        this.color[0] = red;
        this.color[1] = green;
        this.color[2] = blue;
    }

    public boolean isIntel() {
        return intel;
    }

    public void setIntel(boolean intel) {
        this.intel = intel;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
