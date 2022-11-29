/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase abstracta de un poligono
 * @author Anvil
 */
public abstract class Poligono {
    /**
     * Metodo polimorfico
     * @return Area del poligono
     */
    public abstract double area();
    /**
     * Metodo polimorfico
     * @return Perimetro del poligono
     */
    public abstract double perimetro();
    @Override
    public String toString() {
        return "Poligono";
    }
    
}
