/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Representacion de un cuadrilatero
 * @author Anvil
 */
public class Cuadrilatero extends Poligono{
    private int alfa,beta;
    private float a,b;
    private float base,altura;
    /**
     * Calculo del perimetro
     * @return 
     */
    public double perimetro(){
        return 2*(base+altura);
    }
    /**
     * Calculo del area
     * @return Area del cuadrilatero
     */
    public double area(){
        return base*altura;
    }
    /**
     * Modifica el atributo base
     * @param base Nuevo valor de base 
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Modifica el atributo base
     * @return El valor de base
     */
    public float getBase() {
        return base;
    }
    /**
     * Modifica el atributo altura
     * @return El valor de altura
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Modifica el atributo altura
     * @param altura Nuevo valor de la altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Obtiene el atributo alfa
     * @return El valor de alfa
     */
    public int getAlfa() {
        return alfa;
    }
    /**
     * Modifica el atributo alfa
     * @param alfa Nuevo valor de alpha
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    /**
     * Obtine el atributo beta
     * @return El valor de beta
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Modifica el atributo beta
     * @param beta Nuevo valor de beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Obtiene el atributo a
     * @return El valor de a
     */
    public float getA() {
        return a;
    }
    /**
     * Modifica el atributo a
     * @param a  Nuevo valor de la a
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * Obtiene el atributo b
     * @return El valor de b
     */
    public float getB() {
        return b;
    }
    /**
     * Modifica el atributo b
     * @param b Nuevo valor de b
     */
    public void setB(float b) {
        this.b = b;
    }
     
    @Override
    public String toString() {
        return "Cuadrilatero";
    }
     
}
