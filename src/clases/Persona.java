/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
   public void setEdad(int edad){
       this.edad = edad;
   }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
   
   
   
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}
