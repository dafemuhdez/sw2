/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicio;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Producto{
    
    String Descripción;
    String valor;
    String tipo;
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

    public String isTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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
    
    public void actualizarMembresia(){ 
        JOptionPane.showMessageDialog(null, "La membresia ha sido actualizada", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
        
        
      
    /**
     *
     * @param nombre
     * @param apellido
     * @param identificacion
     * @param direccion
     * @param correo
     */}
    
    public void activarMembresia(){ 
        JOptionPane.showMessageDialog(null, "La membresia ha sido activada", "Orden de compra", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    public void enviarEmail (int opcion){
        if(opcion==1){
            JOptionPane.showMessageDialog(null, "El correo ha sido enviado informando la activación ", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "El correo ha sido enviado informando la  actualización ", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
        }
    
      
  }

   
     
    
}
