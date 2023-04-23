package Listas;

import Entidad.Persona;
import java.util.LinkedList;
import java.util.List;

public class ListasEnlazadas {

    public static void main(String[] args) {

        List<Persona> lista = new LinkedList<Persona>();

        //agregar persona al Final de la Lissta
        lista.add(new Persona(1, "Juan", 34));
        lista.add(new Persona(1, "Luisana", 30));
        lista.add(new Persona(1, "Jorge", 28));
        lista.add(new Persona(1, "Jimena", 15));
        
        //agregar al principio
        lista.add(0, new Persona(5, "Jirafa", 98));
        
        System.out.println("-------FOREACH-------");
        //recorrido foreach
        for (Persona perso : lista) {
            System.out.println("prueba: " + perso.getNombre());
        }
    }

}
