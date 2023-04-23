/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import Entidades.ParDeNumeros;
import Servicio.ParDeNumerosServicio;


public class Ejercicio2 {


    public static void main(String[] args) {
        
        ParDeNumerosServicio ser = new ParDeNumerosServicio();
        
        
        ParDeNumeros p = new ParDeNumeros();
        
        
        ser.mostrarValores(p);
        ser.devolverMayor(p);
        ser.calcularPotencia(p);
        ser.calculaRaiz(p);
    }
    
}
