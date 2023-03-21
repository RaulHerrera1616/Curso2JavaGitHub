/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package EjerciciosSubprogramas;

import java.util.Scanner;


public class Ejercicio2MayorEdad {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
              
        String nombre, sel;
        int edad;
        
        do {
            System.out.println("Ingrese el nombre de la persona");
            nombre = leer.next();
            
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
            
            mostrar(nombre,edad);
            
            System.out.println("Quiere seguir ingresando mas datos? SI/NO");
            sel = leer.next();
            
        } while (sel.equalsIgnoreCase("SI"));
        
    }
    public static void mostrar(String nombre, int edad){
        if (edad >= 18){
            System.out.println(nombre + " es mayor de edad");
        }else{
            System.out.println(nombre + " es menor de edad");
        }
    }
    
}
