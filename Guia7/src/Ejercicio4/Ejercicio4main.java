
package Ejercicio4;

import Ejercicio4.Rectangulo;

public class Ejercicio4main {


    public static void main(String[] args) {
        Rectangulo rectang1 = new Rectangulo();
        
        rectang1.datosUsuario();
        System.out.println("La superficie del rectangulo es: "+rectang1.superficieRectangulo());
        System.out.println("El perimetro del rectangulo es: "+rectang1.perimetroRectangulo());
        rectang1.dibujoRectangulo();
        
    }
    
}
