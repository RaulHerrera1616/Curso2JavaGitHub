/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package pooejercicio2;

import Ejercicio2.Circunferencia;


public class POOEjercicio2 {


    public static void main(String[] args) {
        
        Circunferencia circ1 = new Circunferencia(3.5);
        System.out.println("El radio de la circunferencia es: "+circ1.getRadio());
        System.out.println("El radio de la circunferencia es: "+circ1.area());
        System.out.println("El radio de la circunferencia es: "+circ1.perimetro());
        
        circ1.setRadio(5.8);
        System.out.println(circ1.getRadio());
        System.out.println("El radio de la circunferencia es: "+circ1.area());
        System.out.println("El radio de la circunferencia es: "+circ1.perimetro());
    }
    
}
/*
System.out.println("El radio de mi circunferencia es: " + miCircunferencia.getRadio());
System.out.println("El área de mi circunferencia es: " + miCircunferencia.area());
System.out.println("El perímetro de mi circunferencia es: " + miCircunferencia.perimetro());

miCircunferencia
*/
