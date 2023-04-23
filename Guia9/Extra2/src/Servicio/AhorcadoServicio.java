///*
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la 
//palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después 
//ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en 
//un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que 
//ingresó el usuario.
//Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar 
//como se usa el vector.length.
//Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra 
//ingresada es parte de la palabra o no. También informará si la letra estaba o no.
//Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas 
//letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si 
//la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que 
//no esté, se le restará uno a sus oportunidades.
//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
//Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados 
//e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método 
//se llamará en el main.
//
// */
package Servicio;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\\n");
    Ahorcado ah = new Ahorcado();
//
//    /*
//    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la 
//    palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después 
//    ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en 
//    un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que 
//    ingresó el usuario.
//     */

    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de jugadas maxima");
        int cantidadMaximaJugadas = leer.nextInt();

        String[] palabraBuscar = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraBuscar[i] = palabra.substring(i, i + 1);
        }
        int cantidadEncontradas = 0;
        ah.setPalabraBuscar(palabraBuscar);
        ah.setCantidadMaximaJugadas(cantidadMaximaJugadas);
        ah.setPalabra(palabra);
        return new Ahorcado(palabraBuscar, palabra, cantidadEncontradas, cantidadMaximaJugadas);

    }

//    /*
//    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar 
//    como se usa el vector.length.
//     */
    public void longitud(Ahorcado ah) {

        System.out.println("La longitud de la palabra es: " + ah.getPalabraBuscar().length);
    }

//    /*
//    Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra 
//    ingresada es parte de la palabra o no. También informará si la letra estaba o no.
//     */
    public void buscar(Ahorcado ah, String letra) {

        boolean encontrada = false;

        for (int i = 0; i < ah.getPalabraBuscar().length; i++) {
            if (ah.getPalabraBuscar()[i].equalsIgnoreCase(letra)) {
                encontrada = true;

            } else {
                encontrada = encontrada;

            }
        }
        if (encontrada) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
        }

    }

//    /*
//    Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas 
//    letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si 
//    la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que 
//    no esté, se le restará uno a sus oportunidades.
//     */
    public void encontradas(Ahorcado ah, String letra) {
        boolean encontrada = false;
        int cont = 0;
        ah.getCantidadEncontradas();
        for (int i = 0; i < ah.getPalabraBuscar().length; i++) {
            if (ah.getPalabraBuscar()[i].equals(letra)) {
                cont++;
                encontrada = true;
            } else {
                encontrada = encontrada;
            }
        }
        if (encontrada) {
            ah.setCantidadEncontradas(ah.getCantidadEncontradas() + cont);
            ah.setCantidadMaximaJugadas(ah.getCantidadMaximaJugadas());
            System.out.println("Numero de letras (encontradas, faltantes): (" + ah.getCantidadEncontradas() + ", " + (ah.getPalabraBuscar().length - ah.getCantidadEncontradas()) + ")");
        } else {
            ah.setCantidadMaximaJugadas(ah.getCantidadMaximaJugadas() - 1);
            encontrada = encontrada;
            System.out.println("Numero de letras (encontradas, faltantes): (" + ah.getCantidadEncontradas() + ", " + (ah.getPalabraBuscar().length - ah.getCantidadEncontradas()) + ")");
        }
    }

    //Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public void intentos(Ahorcado ah) {

        System.out.println("La cantidad de jugadas que le quedan son: " + ah.getCantidadMaximaJugadas());
        System.out.println(ah.getPalabra());
    }

    /*
    Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados 
    e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método 
    se llamará en el main.
     */
    public void juego() {
        crearJuego();
        do {
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            longitud(ah);
            buscar(ah, letra);
            encontradas(ah, letra);
            intentos(ah);
//            String palabra = ah.getPalabra();
            String palabraSecreta = ah.getPalabra();
        char[] palabraMostrada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraMostrada.length; i++) {
            palabraMostrada[i] = '_';
            
        }
//        Scanner scanner = new Scanner(System.in);

            System.out.println(palabraMostrada);
            char letra1 = letra.charAt(0);
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra1) {
                    palabraMostrada[i] = letra1;
                }
            }
        
        System.out.println(palabraMostrada);

//            char letra1 = letra.charAt(0);
//            char[] letrasPorAdivinar = palabra.toCharArray();
//            char[] letrasAdivinadas = new char[letrasPorAdivinar.length];
//            Arrays.fill(letrasAdivinadas, '_');
//
//            boolean acierto = false;
//            for (int i = 0; i < letrasPorAdivinar.length; i++) {
//
//                if (letrasPorAdivinar[i] == letra1) {
//                    letrasAdivinadas[i] = letra1;
//                    acierto = true;
//                }
//            }
//
//            System.out.println(letrasAdivinadas);

        } while (ah.getCantidadMaximaJugadas() > 0 && ah.getPalabraBuscar().length != ah.getCantidadEncontradas());
        if (ah.getPalabraBuscar().length == ah.getCantidadEncontradas()) {
            System.out.println("¡Felicidades, has ganado!");
        } else {
            System.out.println("Lo siento, has perdido.");
        }
    }
}
/*
public class Ahorcado {
    public static void main(String[] args) {
        String palabraSecreta = "palabra";
        char[] palabraMostrada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraMostrada.length; i++) {
            palabraMostrada[i] = '_';
        }
        Scanner scanner = new Scanner(System.in);
        while (new String(palabraMostrada).contains("_")) {
            System.out.println(palabraMostrada);
            System.out.print("Introduce una letra: ");
            char letra = scanner.nextLine().charAt(0);
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraMostrada[i] = letra;
                }
            }
        }
        System.out.println(palabraMostrada);
        System.out.println("¡Has ganado!");
    }
}
*/