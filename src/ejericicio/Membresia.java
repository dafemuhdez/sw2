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

public class Membresia {
    private Object Nombre;
    private Object accion;
  
    
   public void Actualizar_Membresia(){ 
  JOptionPane.showMessageDialog(null, "La membresia ha sido actualizada", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
        
        
      
    /**
     *
     * @param nombre
     * @param apellido
     * @param identificacion
     * @param direccion
     * @param correo
     */}
    public void Activar_Membresia(){ 
    JOptionPane.showMessageDialog(null, "La membresia ha sido activada", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
      
    }
    public void Enviar_Email (int opcion){
     if(opcion==1){
         JOptionPane.showMessageDialog(null, "El correo ha sido enviado informando la activación ", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
     }else{
         JOptionPane.showMessageDialog(null, "El correo ha sido enviado informando la  actualización ", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
     }
    
      
  }    

   
}
