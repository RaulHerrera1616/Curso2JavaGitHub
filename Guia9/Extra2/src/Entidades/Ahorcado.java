/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como 
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la 
cantidad jugadas máximas que puede realizar el usuario.
 */
package Entidades;

public class Ahorcado {

    private String[] palabraBuscar;
    private String palabra;
    private int cantidadEncontradas;
    private int cantidadMaximaJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscar, String palabra, int cantidadEncontradas, int cantidadMaximaJugadas) {
        this.palabraBuscar = palabraBuscar;
        this.palabra = palabra;
        this.cantidadEncontradas = cantidadEncontradas;
        this.cantidadMaximaJugadas = cantidadMaximaJugadas;
    }

    public String[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getCantidadEncontradas() {
        return cantidadEncontradas;
    }

    public void setCantidadEncontradas(int cantidadEncontradas) {
        this.cantidadEncontradas = cantidadEncontradas;
    }

    public int getCantidadMaximaJugadas() {
        return cantidadMaximaJugadas;
    }

    public void setCantidadMaximaJugadas(int cantidadMaximaJugadas) {
        this.cantidadMaximaJugadas = cantidadMaximaJugadas;
    }

    
    
    
}
