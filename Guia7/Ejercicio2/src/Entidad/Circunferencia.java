/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Ejercicio2;

import java.util.Scanner;


public class Circunferencia {
    
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // Resto de métodos de la clase Circunferencia

    public void crearCircunferencia() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el radio de la circunferencia: ");
    double r = sc.nextDouble();
    setRadio(r);
}
    public double area() {
    return Math.PI * Math.pow(radio, 2);
}
    public double perimetro() {
    return 2 * Math.PI * radio;
}
    }
    

