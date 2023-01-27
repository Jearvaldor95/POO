/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TestExcepcione {

    public static void main(String[] args) throws OperadorException {
        Scanner leer = new Scanner(System.in);

        boolean continuarEjecucion = true;
        do {
            try {
                System.out.println("Ingrese n1");
                int n1 = leer.nextInt();
                System.out.println("Ingrese n2");
                int n2 = leer.nextInt();
                int resultado = dividir(n1 , n2);
                System.out.println("Resultado: "+resultado);
                continuarEjecucion = false;
            } catch (OperadorException e) {
                System.out.println("Solo se puede ingresar datos numericos enteros " +e.getMessage());
                System.out.println(e);
                leer.nextLine();

            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre cero");
                System.out.println(e);
            } finally {
                System.out.println("Se reviso la operación");
            }

        } while (continuarEjecucion);
    }
    
    static int dividir(int n, int d)throws OperadorException{
        if(d==0){
            throw new OperadorException("Divición entre cero");
        }
        return n / d;
    }
}
