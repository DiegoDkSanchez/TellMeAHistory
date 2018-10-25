package sv.dk.com.dimeunahistoria.Modelos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by DK-Ragnar on 8/9/2018.
 */

public class Historia implements Serializable {

    private String titulo;
    private String autor;
    private String portada;
    private String categoria;
    private ArrayList<Seccion> secciones;
    private String color;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(ArrayList<Seccion> secciones) {
        this.secciones = secciones;
    }

    public String getColor() {
        if(categoria.equals("Terror")){
            color = "#9D03000F";
        }else if(categoria.equals("Drama")){
            color = "#9D170A3E";
        }else if(categoria.equals("Slasher")){
            color = "#9D210005";
        }
        return color;
    }
}
