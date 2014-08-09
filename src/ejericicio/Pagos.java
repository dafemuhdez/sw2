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
        System.out.println("Generando orden de entrega...");
    }
              
   public void enviarDept(){
     
      System.out.println("Enviando duplicado de orden al departamento de libros...");
  } 
    
}
