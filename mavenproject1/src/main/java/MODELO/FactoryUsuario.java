/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

public class FactoryUsuario {

    public Usuario crearUsuario(String nombre, String tipoUsuario) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setTipoUsuario(tipoUsuario);
        return usuario;
    }
}

