/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


/**
 *
 * @author User
 */
public class ControladorRecursos {
    private UsuarioEducativo usuario;
    
    public ControladorRecursos(UsuarioEducativo usuario){
        this.usuario=usuario;
    }
    
    public void verRecurso(){
        usuario.verRecursos();
    }
    
    public void buscarRecurso(String palabraClave){
        usuario.buscarRecurso(palabraClave);
    }
}
