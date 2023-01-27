/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import interfaces.*;

/**
 *
 * @author USUARIO
 */
public class TestInterface {
    public static void main(String[] args) {
        BaseDatos datos = new ImplementBaseDatos();
        datos.actualizar();
        datos.eliminar();
        datos.insetar();
        datos.listar();
    }
}
