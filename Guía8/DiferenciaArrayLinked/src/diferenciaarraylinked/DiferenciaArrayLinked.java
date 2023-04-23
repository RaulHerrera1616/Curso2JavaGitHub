/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diferenciaarraylinked;

import Entidad.Persona;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sistemas
 */
public class DiferenciaArrayLinked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1,"Juan",34));
        listaArray.add(new Persona(1,"Luisana",30));
        listaArray.add(new Persona(1,"Jorge",28));
        listaArray.add(new Persona(1,"Jimena",15));
        
        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1,"Juan",34));
        listaLinked.add(new Persona(1,"Luisana",30));
        listaLinked.add(new Persona(1,"Jorge",28));
        listaLinked.add(new Persona(1,"Jimena",15));
        
        //Remove en ArrayList
        listaArray.remove(1);
        
        //Remove en LinkedList
        String nombreBorrar = "Luisana";
        for (Persona persona2 : listaLinked) {
            if (persona2.getNombre().equals(nombreBorrar)) {
                listaLinked.remove(persona2);
                break;//corto que deje de recorrer
            }
        }
        System.out.println("------LUEGO DE ELIMINAR-------");
        //recorrido por foreach
        System.out.println("-------ARRAYLIST-------");
        for (Persona persona : listaArray) {
            System.out.println("prueba: " + persona.getNombre());
        }
        
        System.out.println("-------LINKEDLIST-------");
        for (Persona persona : listaLinked) {
            System.out.println("prueba: " + persona.getNombre());
        }
    }
    
}
