/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import herencia.*;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class TestHerencia {
    
    public static void main(String[] args) {
        
        Empleado ep1 = new Empleado(3000, "Jesus");
        System.out.println(ep1);
        
        Empleado ep2 = new Empleado(4000, "Armando");
        System.out.println(ep2);
        
        Date fecha = new Date();
        Cliente c1 = new Cliente(fecha, true, "Armando Valeta", 'M', 27, "Moñitos");
        System.out.println(c1);
        
    }
    
}
