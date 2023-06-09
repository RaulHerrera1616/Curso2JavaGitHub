/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
    estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
    que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
    i.* 0.86 libras es un 1 € 
    ii. * 1.28611 $ es un 1 €
    iii. * 129.852 yenes es un 1 €
 */
package EjerciciosSubprogramas;

import java.util.Scanner;


public class Ejercicio3ConvertirDolares {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese la cantidad de EUROS");
        double euros = leer.nextDouble();
        System.out.println("Seleccione la moneda que decea convertir\nA- Dólares\nB- Yenes\nC- Libras\n");
        String sel = leer.next();
        
        tipoCambio(euros,sel);
    }
    public static void tipoCambio(double euros, String moneda){
        switch (moneda.toUpperCase()){
            case "A":
                double dolar = euros * 1.28611;
                System.out.println(euros + " equivalen a $ " + dolar + " Dólares.");
                break;
            case "B":
                double yen = euros * 129.852;
                System.out.println(euros + " equivalen a Y " + yen + " Yenes.");
                break;
            case "C":
                double libra = euros * 0.86;
                System.out.println(libra + " equivalen a L " + libra + " Libras");
                break;
        }
    }
    
}
