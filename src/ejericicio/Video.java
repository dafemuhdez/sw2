/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicio;

import java.util.Scanner;
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
        System.out.println("Introduzca el Nombre del video:");
        nombre=leer.nextLine();
        if(nombre.equalsIgnoreCase("aprendiendo a eskiar")){
            System.out.println("se agregara un video de primeros auxilios a su paquete de entrega");
        }

}
    

    
}
