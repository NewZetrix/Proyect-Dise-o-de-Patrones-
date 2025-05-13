/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MODELO;

/**
 *
 * @author ADRIANO
 */
public interface CallableProcedure extends Cloneable{
    void ejecutar(String titulo, String descripcion);
    CallableProcedure clonar();
}
