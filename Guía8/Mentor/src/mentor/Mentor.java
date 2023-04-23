/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package mentor;

import Entidades.Fraccion;
import Servicio.FraccionService;
import java.util.Scanner;

public class Mentor {

    public static void main(String[] args) {
        Fraccion f = FraccionService.crearFraccion();
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elija una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    FraccionService.sumarFraccion(f);
                    break;
                case 2:
                    FraccionService.restarFraccion(f);
                    break;
                case 3:
                    FraccionService.multiplicarFraccion(f);

                    break;
                case 4:
                    FraccionService.dividirFraccion(f);
                    break;
                case 5:
                    System.out.println("Hasta la proxima");
                    break;

            }
            System.out.println("---------------------------------");
        } while ( opcion > 0 && opcion<5);

    }

}
