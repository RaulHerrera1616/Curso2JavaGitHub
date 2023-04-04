/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Entidad.Cafetera;
import Service.CafeteraServicio;

/**
 *
 * @author sistemas
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio cafe = new CafeteraServicio();
        CafeteraServicio cafe2 = new CafeteraServicio();
        cafe.vaciarCafetera();
        cafe.llenarCafetera();
        cafe.servirTaza(0);
        cafe.vaciarCafetera();
        cafe.agregarCafe(150);
        cafe2.servirTaza(500);
//        cafe.servirTaza(0);
    }
    
}
