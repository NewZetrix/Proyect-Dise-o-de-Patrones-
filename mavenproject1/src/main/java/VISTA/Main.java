/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VISTA;

import MODELO.UsuarioSistema;
import MODELO.CallableProcedure;
import MODELO.AgregarRecursoProcedure;
import Controlador.UsuarioEmpoderamiento;
import Controlador.UsuarioEducativo;
import Controlador.UsuarioDenunciante;
import Controlador.ReporteTalleres;
import Controlador.ReporteGenero;
import Controlador.GeneradorReportes;
import Controlador.ControladorRecursos;
import Controlador.ControladorTalleres;
import Controlador.ControladorDenuncias;
import CONEXCIONSQL.CConexion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<UsuarioSistema> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioEducativo());
        usuarios.add(new UsuarioDenunciante());
        usuarios.add(new UsuarioEmpoderamiento());
        
        for (UsuarioSistema usuario : usuarios) {
            usuario.mostrarPerfil();
        }

        // OCP en acción
        GeneradorReportes generador = new GeneradorReportes();
        generador.generarReporte(new ReporteGenero());
        generador.generarReporte(new ReporteTalleres());
        
        CConexion objconexion=new CConexion();
        objconexion.establecerConexion();
       
        
        
        //procedimiento
        
        // Crea el prototipo
        CallableProcedure procedimientoOriginal = new AgregarRecursoProcedure();

        // Clona para una nueva ejecución
        CallableProcedure procedimiento1 = procedimientoOriginal.clonar();
        procedimiento1.ejecutar("Artículo sobre igualdad laboral", "Explicación de brechas de género en el trabajo.");

        
        // Otro clon
        CallableProcedure procedimiento2 = procedimientoOriginal.clonar();
        procedimiento2.ejecutar("Guía educativa visual", "Material interactivo para docentes.");
        
        //Prueba para denuncias
        UsuarioDenunciante denunciante=new UsuarioDenunciante();
        ControladorDenuncias ctrlDenuncias=new ControladorDenuncias(denunciante);
        ctrlDenuncias.registrarDenuncias("Acoso en el trabajo", true);
        ctrlDenuncias.verEstadoDenuncia(1);
        
        //Prueba para talleres
        UsuarioEmpoderamiento empoderada = new UsuarioEmpoderamiento();
        ControladorTalleres ctrlTalleres = new ControladorTalleres(empoderada);
        ctrlTalleres.inscribirseTaller("Taller de liderazgo");
        ctrlTalleres.verTalleresDisponibles();

        // Prueba para recursos educativos
        UsuarioEducativo educativo = new UsuarioEducativo();
        ControladorRecursos ctrlRecursos = new ControladorRecursos(educativo);
        ctrlRecursos.verRecurso();
        ctrlRecursos.buscarRecurso("Derechos Humanos");

    }
    
}
