/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicio;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.ResultSet;
import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class ControladorPago {
    
    
    
     //public static void main(String[] args) {
     //}
   
    
public void pagar(String opcion,String Nombre,String Apellido, String Identificacion,String Direccion, String Correo){  
       
    
        
        
        
        
        
     OrdenEntrega oe= new OrdenEntrega();
     Producto prod= new Producto();
     Video vid=new Video();
     Agente agen=new Agente();
     Conexión_BD bd = new Conexión_BD();
     bd.abrirConexion();
     bd.ejecutar("INSERT INTO cb_orden_de_compra.cliente values('"+Nombre+"', '"+Apellido+"', '"+Identificacion+"', '"+Direccion+"', '"+Correo+"')");
            
     
        switch(opcion){
            case "Producto Fisico":
              oe.generarOrden();
              agen.generarPagoComisión();
                break;
            case "Libro":
                oe.generarOrden();
                oe.generarDuplicado();
                agen.generarPagoComisión();
                break;
            case "Activar Membresia":       
                        prod.activarMembresia();
                        prod.enviarEmail(1);
                        break;
            case "Actualizar Membresia":
                        prod.actualizarMembresia();
                        prod.enviarEmail(2);
                        break;
            case "Video":
                new VistaVideo().setVisible(true);
                break;
            default:
                break;
             } 
         }


}  

         

