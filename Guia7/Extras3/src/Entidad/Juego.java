/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos 
y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador adivina el número
o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Extras3;

import java.util.Scanner;

public class Juego {

    private int jugador1Gana;
    private int jugador2Gana;
    private int intentos;

    public Juego() {

    }

    public int getJugador1Gana() {
        return jugador1Gana;
    }

    public int getJugador2Gana() {
        return jugador2Gana;
    }

    public int getIntentos() {
        return intentos;
    }

    public Juego(int jugador1Gana, int jugador2Gana, int intentos) {
        this.jugador1Gana = jugador1Gana;
        this.jugador2Gana = jugador2Gana;
        this.intentos = intentos;
    }

    public void setJugador1Gana(int jugador1Gana) {
        this.jugador1Gana = jugador1Gana;
    }

    public void setJugador2Gana(int jugador2Gana) {
        this.jugador2Gana = jugador2Gana;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);
        int numero;
        int adivinarNumero;
        String res = "";
        do {
            System.out.println("Jugador 1 ingrese el numero a adivinar");
            numero = leer.nextInt();
            System.out.println("Jugador 2 adivina el numero");
            intentos = 10;
            do {

                adivinarNumero = leer.nextInt();
                intentos--;
                if (adivinarNumero == numero) {
                    System.out.println("¡Felicidades! Has adivinado el numero en: " + (10 - intentos) + " intentos");
                    jugador2Gana++;
                    break;
                } else if (adivinarNumero > numero) {
                    System.out.println("El numero es mas bajo, te quedan " + intentos + " intentos");
                } else {

                    System.out.println("El numero es mas alto, te quedan " + intentos + " intentos");
                }

            } while (intentos > 0);
            if (intentos == 0) {
                System.out.println("Te quedaste sin intentos, el numero secreto es: " + numero);
                jugador1Gana++;
            }

            System.out.println("¿Desea seguir jugando? s/n");
            res = leer.next();
            if (!res.equalsIgnoreCase("s")) {
                break;
            }
        } while (res.equalsIgnoreCase("s"));

        System.out.println("Jugador 1 Ganó: " + jugador1Gana);
        System.out.println("Jugador 2 Ganó: " + jugador2Gana);

    }
}
