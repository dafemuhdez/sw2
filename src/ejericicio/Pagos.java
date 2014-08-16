/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicio;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Administrator
 */
public class Pagos {

    /**
     * @param args the command line arguments
     */
   
   
        
        /** Pagos producto = new Pagos(producto,nombre);
        
         
         /**
     *
     */  
      private float valor;
      private String Fecha;
      private String Nombre;
      private String Apellido;
      private String Id;
      private String correo_electronico;
      
 
    public void generar_Orden(){

        JOptionPane.showMessageDialog(null, "Generando orden de entrega ", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
    }
              
   public void enviarDept(){
     
    JOptionPane.showMessageDialog(null, "Enviando duplicado de orden al departamento de libros...", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
  } 
    
}
