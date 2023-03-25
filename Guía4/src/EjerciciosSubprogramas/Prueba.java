
package EjerciciosSubprogramas;

import java.util.Scanner;


public class Prueba {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Num;
        System.out.println("Ingrese un numero para saber si es primo");
        Num = leer.nextInt();
        boolean retorno=primoNumero(Num);
        if (retorno) {
            System.out.println("El numero ingresado es primo");
        }else{
            System.out.println("El numero ingresado no es primo");
        }
        
    }
    public static boolean primoNumero(int Num){
        int cont=0;
        
        for (int i = 1; i < 10; i++) {
            if (Num%i==0) {
                cont++;
            }
            if (Num==1) {
                return false;
            }
        }
        if (cont==2) {
            return true;
        }
        return false;
        
    }
}
