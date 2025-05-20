/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import MODELO.FactoryUsuario;
import MODELO.Usuario;
import CONEXCIONSQL.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ControladorUsuario {

    private FactoryUsuario factory;

    public ControladorUsuario() {
        this.factory = new FactoryUsuario();
    }

    public Usuario crearUsuario(String nombre, String tipoUsuario) {
        return factory.crearUsuario(nombre, tipoUsuario);
    }

    public boolean registrarUsuario(Usuario u) {
    try {
        CConexion con = new CConexion();
        Connection conexion = con.establecerConexion();

        String sql = "{CALL sp_RegistrarUsuario(?, ?)}"; // Llama al SP
        PreparedStatement ps = conexion.prepareCall(sql); // usamos prepareCall

        ps.setString(1, u.getNombre());
        ps.setString(2, u.getTipoUsuario());

        System.out.println("Registrando: " + u.getNombre() + " - " + u.getTipoUsuario());

        int rows = ps.executeUpdate();
        conexion.close();
        return rows > 0;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
        e.printStackTrace();
    return false;
}
}
}

