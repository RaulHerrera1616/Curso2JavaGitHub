
package MainExEj7;

import Extras7.Rectangulo;


public class MainExEj7 {

 
    public static void main(String[] args) {
       Rectangulo rectangulo1 = new Rectangulo();
       rectangulo1.setLado1(4);
       rectangulo1.setLado2(6);
        System.out.println(rectangulo1.getLado1());
        System.out.println(rectangulo1.getLado2());
        System.out.println(rectangulo1.calcularArea());
    }
    
}
