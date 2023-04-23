/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import Entidades.Persona;
import Servicio.PersonaService;
import java.util.Date;

/**
 *
 * @author sistemas
 */
public class Ejercicio5 {


    public static void main(String[] args) {
        
        PersonaService p = new PersonaService();
        
        
        
        Persona persona= p.crearPersona();
        persona.toString();
        boolean dif = p.menorQue(persona, 18);
        System.out.println(dif);
        p.menorQue(persona, 18);
        p.mostrarPersona(persona);
    }
    
}
