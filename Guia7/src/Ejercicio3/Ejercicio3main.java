
package Ejercicio3;

import Ejercicio3.Operacion;

public class Ejercicio3main {


    public static void main(String[] args) {
        Operacion oper1 = new Operacion();
        oper1.crearOperacion();
        System.out.println("La suma de los dos numeros es: "+oper1.sumar());
        System.out.println("La resta de los dos numeros es: "+oper1.restar());
        System.out.println("La mltiplicacion de los dos numeros es: "+oper1.multiplicar());
        System.out.println("La division de los dos numeros es: "+oper1.dividir());
    }
    
}