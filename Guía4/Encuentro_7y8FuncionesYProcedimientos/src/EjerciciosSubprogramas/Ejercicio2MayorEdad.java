/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package EjerciciosSubprogramas;

import java.util.Scanner;


public class Ejercicio2MayorEdad {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas");
        int cant = leer.nextInt();
        
        
    }
    
}
/*
public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
       
       /* System.out.println("Ingrese la cantidad de personas");
        int cant = read.nextInt();
        
        String nombre;
        int edad;
        String sel;
        do {
            System.out.println("Ingrese el nombre de la persona");
            nombre = read.next();
            
            System.out.println("Ingrese la edad");
            edad = read.nextInt();
            
            mostrar(nombre, edad);
            
            System.out.println("Quiere ingresar más datos?Y/N");
            sel = read.next();
            
        } while (sel.equalsIgnoreCase("Y"));
        

    }
    
    public static void mostrar(String nombre, int edad){
        if (edad >= 18){
            System.out.println(nombre + " es mayor de edad");
        }else{
            System.out.println(nombre + " es menor de edad");
        }
    }
*/