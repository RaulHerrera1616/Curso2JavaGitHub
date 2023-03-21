/*
2. Implementar una función que permita obtener el valor absoluto de un número positivo y otra que obtenga la raíz cuadrada. 
Para ello utilice los métodos abs() y sqrt() de la clase Math.
 */
package EjerciciosSubprogramas;

import java.util.Scanner;


public class PruebaMentor2 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int result=mostrarAbsoluto(num);
        System.out.println(result);
        double result1=mostrarRaiz(num);
        System.out.println(result1);
    }
    public static int mostrarAbsoluto(int num){
        
        return (int) Math.abs(num);
    }
    public static double mostrarRaiz(double num){
        
        return (double) Math.sqrt(num);
    }
}
