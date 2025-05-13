/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import MODELO.IRecursosEducativos;
import MODELO.UsuarioSistema;

/**
 *
 * @author User
 */
public class UsuarioEducativo implements UsuarioSistema, IRecursosEducativos{

    @Override
    public void mostrarPerfil() {
         System.out.println("Perfil de Usuario Educativo");
    }

    @Override
    public void verRecursos() {
       System.out.println("Mostrando recursos educativos...");
    }

    @Override
    public void buscarRecurso(String palabraClave) {
        System.out.println("Buscando recurso: " + palabraClave);
    }
    
}
