/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como 
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la 
cantidad jugadas máximas que puede realizar el usuario.
 */
package Entidades;


public class Ahorcado {
    public String[] palabraBuscar;
    public int cantidadLetras;
    public int cantidadJugada;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscar, int cantidadLetras, int cantidadJugada) {
        this.palabraBuscar = palabraBuscar;
        this.cantidadLetras = cantidadLetras;
        this.cantidadJugada = cantidadJugada;
    }
   
    
}
