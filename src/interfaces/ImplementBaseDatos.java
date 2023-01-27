/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author USUARIO
 */
public class ImplementBaseDatos implements BaseDatos{

    @Override
    public void insetar() {
        System.out.println("Se inserto un registro");
    }

    @Override
    public void listar() {
        System.out.println("Mostrando registro exitoso");
    }

    @Override
    public void actualizar() {
        System.out.println("Se actualizo el registro");
    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino un registro");
    }
    
}
