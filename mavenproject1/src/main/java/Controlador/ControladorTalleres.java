/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author User
 */
public class ControladorTalleres {
    private UsuarioEmpoderamiento usuario;
    
    public ControladorTalleres(UsuarioEmpoderamiento usuario){
        this.usuario=usuario;
    }
    
    public void inscribirseTaller (String nombreTaller){
        usuario.inscribirseTaller(nombreTaller);
    }
    
    public void verTalleresDisponibles(){
        usuario.verTalleresDisponibles();
    }
}
