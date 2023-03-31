/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento" que calcule el aumento salarial de 
un empleado en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Extras6;

import java.util.Scanner;


public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularAumento(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        this.nombre = leer.nextLine();
        System.out.println("Ingrese la edad del empleado");
        this.edad = leer.nextInt();
        System.out.println("Ingrese el salario del empleado");
        this.salario = leer.nextDouble();
        if (edad>30) {
            System.out.println("El aumento salarial es de: "+salario*1.10);
        }else if (edad<30) {
            System.out.println("El aumento salarial es de: "+salario*1.05);
        }
    }
}
