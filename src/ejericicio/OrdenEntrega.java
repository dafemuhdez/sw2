/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejericicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel M
 */
public class OrdenEntrega {
    
    public void generarOrden(){
        JOptionPane.showMessageDialog(null, "Generando orden de entrega ", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void generarDuplicado(){  
      JOptionPane.showMessageDialog(null, "Enviando duplicado de orden al departamento de libros...", "Orden de compra", JOptionPane.INFORMATION_MESSAGE);
    } 
    
}
