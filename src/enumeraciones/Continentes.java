/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 *
 * @author USUARIO
 */
public enum Continentes {
    AFRICA(54),
    EUROPA(50),
    ASIA(48),
    AMERICA(35),
    OCEANIA(14);
    
    private final int paises;
    
    private Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
