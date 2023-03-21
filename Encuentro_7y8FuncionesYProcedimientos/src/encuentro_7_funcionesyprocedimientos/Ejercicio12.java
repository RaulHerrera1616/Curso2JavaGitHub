/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package encuentro_7_funcionesyprocedimientos;

import java.util.Scanner;


public class Ejercicio12 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese dos numeros");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        
        EsMultiplo(n1, n2);
    }
    public static void EsMultiplo(int n1, int n2){
        int multip=n1%n2;
        if (multip==0) {
            System.out.println("El primer numero es multiplo del segundo");
        }else{
            System.out.println("El primer numero no es multiplo del segundo");
        }
    }
}
