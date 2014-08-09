/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicio;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */



public class Membresia {
    
   public void Actualizar_Membresia (){
       String nombre, apellido, identificacion, direccion, correo;
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca su Nombre:");
        nombre=leer.nextLine();
        System.out.println("Introduzca su Apellido:");
        apellido=leer.nextLine();
        System.out.println("Introduzca su Identificación:");
        identificacion=leer.nextLine();
        System.out.println("Introduzca su Dirección:");
        direccion=leer.nextLine();
        System.out.println("Introduzca su correo electronico:");  
        correo=leer.nextLine();
        System.out.println(nombre+" "+apellido+" "+identificacion+" "+direccion+" "+correo);
    System.out.println("La membresia ha sido actualizada");
      
  }
   public void Activar_Membresia (){ 
       String nombre, apellido, identificacion, direccion, correo;
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca su Nombre:");
        nombre=leer.nextLine();
        System.out.println("Introduzca su Apellido:");
        apellido=leer.nextLine();
        System.out.println("Introduzca su Identificación:");
        identificacion=leer.nextLine();
        System.out.println("Introduzca su Dirección:");
        direccion=leer.nextLine();
        System.out.println("Introduzca su correo electronico:");  
        correo=leer.nextLine();
        System.out.println(nombre+" "+apellido+" "+identificacion+" "+direccion+" "+correo);
    System.out.println("La membresia ha sido activada");
      
  }
 public void Enviar_Email (int opcion){
     if(opcion==1){
         System.out.println("El correo informando activación se ha enviado");
     }else{
         System.out.println("El correo informando actualización se ha enviado");
     }
    
      
  }    
}
