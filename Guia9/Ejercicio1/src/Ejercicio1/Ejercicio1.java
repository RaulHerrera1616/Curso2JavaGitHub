/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import Entidades.Cadena;
import Servicio.CadenaServicio;



/**
 *
 * @author sistemas
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadena c = new Cadena("El mundo de la programacion");
        CadenaServicio ser = new CadenaServicio();
        
        System.out.println("La frase es: " + c.getFrase());
        
        ser.mostrarVocales(c);
        ser.invertirFrase(c);
        ser.vecesRepetida("a", c);
        ser.compararLongitud("La fama y el exito son el placer de la vida", c);
        ser.unirFraes(" esta al alcance de tus manos", c);
        ser.remplazar("a", c);
        boolean res = ser.contiene("x", c);
        System.out.println(res);
    }
}
