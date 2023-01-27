/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import clases.Persona;

/**
 *
 * @author USUARIO
 */
public class TestPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Jesus",27);
        System.out.println(p.getNombre());
        
        p.setEdad(26);
    }
}
