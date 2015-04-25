package com.app.monumento.monumentapp;

/**
 * Created by Patricia Gloria on 10/02/2015.
 */
public class Monumentos {

    private int imagen;
    private String descripcion;
    private String parrafo;

    public Monumentos ( int imagen, String descripcion, String parrafo){
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.parrafo = parrafo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getParrafo() {
        return parrafo;
    }

    public void setParrafo(String parrafo) {
        this.parrafo = parrafo;
    }
}
