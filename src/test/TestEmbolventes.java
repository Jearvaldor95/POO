/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author USUARIO
 */
public class TestEmbolventes {
    public static void main(String[] args) {
        
        Integer n = 10;
        System.out.println("Entero -> "+n);
        
        String ns = n.toString();
        System.out.println("Entero a string -> "+ns+" ->"+(ns + ns));
        
        System.out.println("Entero a double -> "+ n.doubleValue());
        
        int n2 = n;
        
        n2 = Integer.parseInt(ns);
        System.out.println(n2 + n2);
        
        double nd = Double.parseDouble(ns);
        System.out.println(nd);
                
    }
    
}
