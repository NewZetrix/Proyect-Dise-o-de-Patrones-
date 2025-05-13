/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import CONEXCIONSQL.CConexion;
import MODELO.CallableProcedure;

/**
 *
 * @author ADRIANO
 */
public class AgregarRecursoProcedure implements CallableProcedure{
    
    private final String procedimientoSQL = "{call sp_AgregarRecursoEducativo(?, ?)}";

    @Override
    public void ejecutar(String titulo, String descripcion) {
        try (Connection conn = new CConexion().establecerConexion();
             CallableStatement stmt = conn.prepareCall(procedimientoSQL)) {

            stmt.setString(1, titulo);
            stmt.setString(2, descripcion);
            stmt.execute();
            System.out.println("Recurso insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al ejecutar el procedimiento: " + e.getMessage());
        }
    }

    @Override
    public CallableProcedure clonar() {
        try {
            return (CallableProcedure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar el procedimiento.");
        }
    }
    
}
