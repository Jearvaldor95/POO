/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author USUARIO
 */
public class ExceptionVerificada {
    public static void main(String[] args) throws FileNotFoundException {
        readFile1();
    }
    public static void readFile1()throws FileNotFoundException{
        File file = new File("c://file.txt");
        FileReader fr = new FileReader(file);
    }
    
}
