/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package EjerciciosSubprogramas;

import java.util.Scanner;


public class Ejercicio1OperacionesMatematicas {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese dos numeros");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("Ingrese (1,2,3 o 4) para realizar la operacion que ud quiere realizar");
        int opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                int retornoSum=suma(n1, n2);
                System.out.println(retornoSum);
                break;
            case 2:
                int retornoRes=resta(n1, n2);
                System.out.println(retornoRes);
                break;
            case 3:
                int retornoMult=multiplicacion(n1, n2);
                System.out.println(retornoMult);
                break;
            case 4:
                double retornoDiv=division(n1, n2);
                System.out.println(retornoDiv);
                break;
                
        }
    }
    public static int suma(int n1, int n2){
        int result = n1+n2;
        return result;
    }
    public static int resta(int n1, int n2){
        int result = n1-n2;
        return result;
    }
    public static int multiplicacion(int n1, int n2){
        int result = n1*n2;
        return result;
    }
    public static double division(int n1, int n2){
        double result = n1/n2;
        return result;
    }
}
