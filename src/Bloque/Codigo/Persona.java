/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloque.Codigo;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static {
        System.out.println("Ejecución bloque estatico");
        ++Persona.contadorPersona;
    }
    
    {
        System.out.println("Ejecucón bloque no codigo");
        this.idPersona = Persona.contadorPersona++;
    }
    
    
    public Persona(){
        System.out.println("Ejecución del constructor");
    }
    
    public int getIdPersona(){
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
