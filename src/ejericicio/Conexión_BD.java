package ejericicio;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Conexión_BD {
    private Connection conexion;
    private Statement sentencia;
    
    public Conexión_BD(){
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexión_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexión_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
    public void abrirConexion(){
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://us-cdbr-cb-east-01.cleardb.net:3306/cb_orden_de_compra");
            sentencia = conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Conexión_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    public void ejecutar(String sql){
        try {
            sentencia.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexión_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet consultar(String sql){
        ResultSet r = null;
        try {
            r = sentencia.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexión_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
}
