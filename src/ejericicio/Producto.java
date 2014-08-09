/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicio;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class Producto {
    
    String Descripción;
    String valor;
    boolean tipo;
    ArrayList videos= new ArrayList();
    String Formato;
    String libros;

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public ArrayList getVideos() {
        return videos;
    }

    public void setVideos(ArrayList videos) {
        this.videos = videos;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public String getLibros() {
        return libros;
    }

    public void setLibros(String libros) {
        this.libros = libros;
    }

   
     
    
}
