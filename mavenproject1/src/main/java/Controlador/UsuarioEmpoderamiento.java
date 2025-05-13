/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import MODELO.IEmpoderamientoMujer;
import MODELO.UsuarioSistema;

/**
 *
 * @author User
 */
public class UsuarioEmpoderamiento implements UsuarioSistema, IEmpoderamientoMujer{

    @Override
    public void mostrarPerfil() {
        System.out.println("Perfil de Usuario de Empoderamiento");
    }

    @Override
    public void inscribirseTaller(String nombreTaller) {
         System.out.println("Inscripción en el taller: " + nombreTaller);
    }

    @Override
    public void verTalleresDisponibles() {
        System.out.println("Lista de talleres disponibles...");
    }
    
}
