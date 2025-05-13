/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


/**
 *
 * @author User
 */
public class ControladorDenuncias {
    private UsuarioDenunciante usuario;
    
    public ControladorDenuncias(UsuarioDenunciante usuario){
        this.usuario=usuario;
    }
    
    public void registrarDenuncias(String descripcion, boolean anonima){
        usuario.registrarDenuncia(descripcion, anonima);
    }
    
    public void verEstadoDenuncia(int idDenuncia){
        usuario.verEstadoDenuncia(idDenuncia);
    }
}
