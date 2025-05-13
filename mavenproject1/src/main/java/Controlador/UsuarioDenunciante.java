/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import MODELO.IDenunciasGenero;
import MODELO.UsuarioSistema;

/**
 *
 * @author User
 */
public class UsuarioDenunciante implements UsuarioSistema, IDenunciasGenero{

    @Override
    public void mostrarPerfil() {
        System.out.println("Perfil de Usuario Denunciante");    
    }

    @Override
    public void registrarDenuncia(String descripcion, boolean anonima) {
         System.out.println("Denuncia registrada: " + descripcion + " (Anónima: " + anonima + ")");
    }

    @Override
    public void verEstadoDenuncia(int idDenuncia) {
        System.out.println("Estado de la denuncia #" + idDenuncia);
    }
    
}
