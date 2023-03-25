/*
1. Implementar una función que permita obtener un número entero aleatorio comprendido entre dos límites que introduciremos por teclado. 
El número obtenido se debe mostrar por pantalla.





4. Crea un programa que pida el nombre al usuario y lo escriba al revés (de la última letra a la primera).

5. Crea un programa que pida el nombre al usuario y lo escriba alternando mayúsculas y minúsculas
*/
package EjerciciosSubprogramas;

import java.util.Scanner;


public class PruebaMentor1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=0;
        int retorno=mostrarNumero(num);
        System.out.println(retorno);
        
    }
    public static int mostrarNumero(int num){
        num = (int) (Math.random()*5+1);
        return num;
    }
    
}
