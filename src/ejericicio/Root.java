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
public class Root {
    
    
    
     public static void main(String[] args) {
     }
         public void seleccionar(String opcion){
         
     Pagos p1= new Pagos();
     Membresia mem=new Membresia();
     Scanner leer= new Scanner(System.in);
     Video vid=new Video();
     Agente agen=new Agente();
     
     //boolean while1=true;
     int op;
        
      // while(while1){
        System.out.println("1: fisico");
        System.out.println("2: libro");
        System.out.println("3: activar membresia");
        System.out.println("4: actualizar membresia");
        System.out.println("5: video");
        System.out.println("ingrese la opción: ");
        op=leer.nextInt();
        switch(opcion){
            case "sd":
              p1.generar_Orden();
              agen.generar_pagodecomisión();
              //while1=false;
                break;
            case "dasd":
                p1.generar_Orden();
                p1.enviarDept();
                agen.generar_pagodecomisión();
                break;
            case "asdsad":       
                        mem.Activar_Membresia();
                        mem.Enviar_Email(1);
                        break;
            case "asdasd":
                        mem.Actualizar_Membresia();
                        mem.Enviar_Email(2);
                        break;
            case "asd":
                vid.comparar_video();
                break;
            default:
                break;
             } 
         }
     }

         

