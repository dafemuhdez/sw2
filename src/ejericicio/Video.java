/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicio;

import java.util.Scanner;
import javax.swing.JOptionPane;
 /*
 * @author Administrator
 */
public class Video {
    
    String nombre;
    float costo;
    String descripción;
    
   public void comparar_video(){
        String nombre;
        Scanner leer= new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Introduzca el nombre del video", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
        nombre=leer.nextLine();
        if(nombre.equalsIgnoreCase("aprendiendo a eskiar")){
          JOptionPane.showMessageDialog(null, "Se agregara un video de primeros auxilios a su paquete de entrega", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
        }

}
    

    
}
