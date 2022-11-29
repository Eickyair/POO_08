/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author Anvil
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Poligono poligono = new Poligono();
        //System.out.println(poligono);
        //poligono = new Cuadrilatero();
        //System.out.println(poligono);
        //Object obj = poligono;
        //System.out.println(obj);
        //El operador punto trabajo con la clase(tipo) de la variable no con su contenido
        //System.out.println(obj.area());
        
        
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        Triangulo triangulo = new Triangulo();
        tipoPoligono(triangulo);
        
        
        System.out.println(Meses.DOS);
        pruebaMeses();
    }

    private static void tipoPoligono(Poligono poligono) {
        if(poligono instanceof Triangulo){
            System.out.println("Soy un Triangulo");
        }else if(poligono instanceof Poligono){
            System.out.println("Soy un Poligono");
        }else if(poligono instanceof Cuadrilatero){
            System.out.println("Soy un Cuadrilatero");
        }
    }
    public static void pruebaMeses(){
        System.out.println("El mes: "+Meses.DOS+" corresponde a: "
                + ""+Meses.NOMBRES_MESES[Meses.DOS]);
    }
}
