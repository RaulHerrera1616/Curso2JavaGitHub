/*
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar
los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor 
número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de 
calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package Servicio;

import Entidades.ParDeNumeros;

/**
 *
 * @author sistemas
 */
public class ParDeNumerosServicio {
    
//    Método mostrarValores que muestra cuáles son los dos números guardados.
    public void mostrarValores(ParDeNumeros p){
        
        System.out.println(p.getNum1()+ " "+p.getNum2());
    }
    //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor(ParDeNumeros p){
        if (p.getNum1()>p.getNum2()) {
            System.out.println("El primer numero ingresado es el mayor");
        }else{
            System.out.println("El segundo numero ingresado es el mayor");
        }
    }
    //Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor 
    //número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(ParDeNumeros p){
        double numero1 = Math.round(p.getNum1());
        double numero2 = Math.round(p.getNum2());
        if (p.getNum1()>p.getNum2()) {
            System.out.println(Math.pow(p.getNum1(), p.getNum2()));
        }else{
            System.out.println(Math.pow(p.getNum2(), p.getNum1()));
        }
    }
    //Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de 
    //calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public void calculaRaiz(ParDeNumeros p){
        double numero1=Math.abs(p.getNum1());
        double numero2=Math.abs(p.getNum2());
        if (p.getNum1()<p.getNum2()) {
            System.out.println(Math.sqrt(p.getNum1()));
        }else{
            System.out.println(Math.sqrt(p.getNum2()));
        }
    }
}
