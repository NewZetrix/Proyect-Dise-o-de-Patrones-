/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONEXCIONSQL;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author User
 */

public class CConexion {
    Connection conectar=null;
    
    String usuario="LeoGMZ";
    String password="5125_MDB";
    String bd="IgualdadGenero";
    String ip="localhost";
    String puerto="1433";
    
    String cadena="jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
    public Connection establecerConexion(){
        try {
            String cadena="jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+bd;
            conectar=DriverManager.getConnection(cadena,usuario,password);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, error: "+e.toString());
        }
        return conectar;
    }
}
