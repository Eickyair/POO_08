/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Representacion de una figura geometrica triangulo
 * @author Anvil
 */
public class Triangulo extends Poligono{
    private int alfa,beta,gama;
    private float a,b,c;
    private float base,altura;
    /**
     * Obtiene el perimetro del triangulo
     * @return El valor del perimetro
     */
    public double perimetro(){
        return a+b+c;
    }
    /**
     * Obtine al area del triangulo
     * @return El valor del area
     */
    public double area(){
        return base*altura/2;
    }
    /**
     * Modifica el atributo base
     * @param base Nuevo valor de la base
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Modifica el atributo altura
     * @param altura Nuevo valor de la altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Modifica el atributo alfa
     * @param alfa Nuevo valor de alfa
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    /**
     * Modifica el atributo beta
     * @param beta Nuevo valor de beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Modifica el atributo gama
     * @param gama Nuevo valor de beta
     */
    public void setGama(int gama) {
        this.gama = gama;
    }
    /**
     * Modifica el atributo a
     * @param a Nuevo valor de beta
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * Modifica el atributo b
     * @param b Nuevo valor de beta
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * Modifica el atributo c
     * @param c Nuevo valor de beta
     */
    public void setC(float c) {
        this.c = c;
    }
    /**
     * Obtiene el atributo alfa
     * @return El valor de alfa
     */
    public int getAlfa() {
        return alfa;
    }
    /**
     * Obtiene el atributo beta
     * @return El valor de beta
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Obtiene el atributo gama
     * @return El valor de gama
     */
    public int getGama() {
        return gama;
    }
    /**
     * Obtiene el atributo a
     * @return El valor de a
     */
    public float getA() {
        return a;
    }
    /**
     * Obtiene el atributo b
     * @return El valor de b
     */
    public float getB() {
        return b;
    }
    /**
     * Obtiene el atributo c
     * @return El valor de c
     */
    public float getC() {
        return c;
    }
    /**
     * Obtiene el atributo base
     * @return El valor de base
     */
    public float getBase() {
        return base;
    }
    /**
     * Obtiene el atributo altura
     * @return El valor de la altura
     */
    public float getAltura() {
        return altura;
    }
    @Override
    public String toString() {
        return "Triangulo";
    }
    
      
}
