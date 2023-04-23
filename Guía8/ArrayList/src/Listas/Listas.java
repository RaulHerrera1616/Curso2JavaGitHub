
package Listas;

import java.util.ArrayList;
import java.util.List;
import Entidad.Persona;

public class Listas {

 
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1,"Juan",34));
        lista.add(new Persona(1,"Luisana",30));
        lista.add(new Persona(1,"Jorge",28));
        lista.add(new Persona(1,"Jimena",15));
        
        System.out.println("-------FOR-------");
        //recorrer por indice
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("prueba: " + lista.get(i).getNombre());
        }
        System.out.println("-------FOREACH-------");
        //recorrido foreach
        for (Persona perso : lista) {
            System.out.println("prueba: " + perso.getNombre());
        }
    }
    
}
