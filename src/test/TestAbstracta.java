/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import abstractas.*;
/**
 *
 * @author USUARIO
 */
public class TestAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo1");
        figura.dibujar();
        
        figura = new Cuadrado("Cuadrado1");
        figura.dibujar();
        
        
        
        
    }
}
