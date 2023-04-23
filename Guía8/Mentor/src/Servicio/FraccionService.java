/*
Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. 
 */
package Servicio;

import Entidades.Fraccion;
import java.util.Scanner;

public class FraccionService {

    static Scanner leer = new Scanner(System.in);

    public static Fraccion crearFraccion() {
//        int numerador=0;
//        int denominador=0;
        System.out.println("ingrese el numerador de la primera fracción");
        int numerador1 = leer.nextInt();
        System.out.println("ingrese el denominador de la primera fracción");
        int denominador1 = leer.nextInt();
        System.out.println("ingrese el numeradorde la segunda fracción");
        int numerador2 = leer.nextInt();
        System.out.println("ingrese el denominador de la segunda fracción");
        int denominador2 = leer.nextInt();
        System.out.println("Fraccion 1: " + numerador1 + "/" + denominador1);
        System.out.println("Fraccion 1: " + numerador2 + "/" + denominador2);
        return new Fraccion(numerador1, denominador1, numerador2, denominador2);
    }

    public static void sumarFraccion(Fraccion f) {
        int numerador;
        int denominador;
        if (f.getDenominador1() == f.getDenominador2()) {
            numerador = f.getNumerador1() + f.getNumerador2();
            denominador = f.getDenominador1();
        } else {
            denominador = f.getDenominador1() * f.getDenominador2();
            numerador = f.getNumerador1() * f.getDenominador2() + f.getNumerador2() * f.getDenominador1();
        }

        if (numerador == 0 || denominador == 0) {
            System.out.println("Resultado: " + numerador);
        } else if (numerador == denominador) {
            System.out.println("Resultado: " + numerador / +denominador);
        } else {
            System.out.println("Resultado: " + numerador + "/" + denominador);
            int[] resSimp = simplificar(numerador, denominador);
            if (numerador == 0 || denominador == 0) {
                System.out.println("Resultado: " + numerador);
            } else if (numerador == denominador) {
                System.out.println("Resultado: " + numerador / +denominador);
            } else {
                System.out.println("Resultado simplificado: " + resSimp[0] + "/" + resSimp[1]);
            }
        }

    }

    public static void restarFraccion(Fraccion f) {
        int numerador;
        int denominador;
        if (f.getDenominador1() == f.getDenominador2()) {
            numerador = f.getNumerador1() - f.getNumerador2();
            denominador = f.getDenominador1();
        } else {
            denominador = f.getDenominador1() * f.getDenominador2();
            numerador = f.getNumerador1() * f.getDenominador2() + f.getNumerador2() * f.getDenominador1();
        }

        if (numerador == 0 || denominador == 0) {
            System.out.println("Resultado: " + numerador);
        } else if (numerador == denominador) {
            System.out.println("Resultado: " + numerador / +denominador);
        } else {
            System.out.println("Resultado: " + numerador + "/" + denominador);
            int[] resSimp = simplificar(numerador, denominador);
            if (numerador == 0 || denominador == 0) {
                System.out.println("Resultado: " + numerador);
            } else if (numerador == denominador) {
                System.out.println("Resultado: " + numerador / +denominador);
            } else {
                System.out.println("Resultado simplificado: " + resSimp[0] + "/" + resSimp[1]);
            }
        }
    }

    public static void dividirFraccion(Fraccion f) {
        int numerador = f.getNumerador1() * f.getDenominador2();
        int denominador = f.getDenominador1() * f.getNumerador2();

        if (numerador == 0 || denominador == 0) {
            System.out.println("Resultado: " + numerador);
        } else if (numerador == denominador) {
            System.out.println("Resultado: " + numerador / +denominador);
        } else {
            System.out.println("Resultado: " + numerador + "/" + denominador);
            int[] resSimp = simplificar(numerador, denominador);
            if (numerador == 0 || denominador == 0) {
                System.out.println("Resultado: " + numerador);
            } else if (numerador == denominador) {
                System.out.println("Resultado: " + numerador / +denominador);
            } else {
                System.out.println("Resultado simplificado: " + resSimp[0] + "/" + resSimp[1]);
            }
        }
    }

    public static void multiplicarFraccion(Fraccion f) {
        int numerador = f.getNumerador1() * f.getNumerador2();
        int denominador = f.getDenominador1() * f.getDenominador2();

        if (numerador == 0 || denominador == 0) {
            System.out.println("Resultado: " + numerador);
        } else if (numerador == denominador) {
            System.out.println("Resultado: " + numerador / +denominador);
        } else {
            System.out.println("Resultado: " + numerador + "/" + denominador);
            int[] resSimp = simplificar(numerador, denominador);
            if (resSimp[0] == 0 || resSimp[1] == 0 || resSimp[1]==1) {
                System.out.println("Resultado: " + numerador);
            } else if (resSimp[0] == resSimp[1]) {
                System.out.println("Resultado: " + numerador / +denominador);
            } else {
                System.out.println("Resultado simplificado: " + resSimp[0] + "/" + resSimp[1]);
            }
        }

    }

    public static int[] simplificar(int numerador, int denominador) {
        System.out.println(numerador + " - " + denominador);
        for (int i = 2; i < 10; i++) {
            if (numerador == 0 || denominador == 0) {
                break;
            }
            if (numerador % i == 0 && denominador % i == 0) {
                numerador /= i;
                denominador /= i;
                i--;
            }
        }
        int[] resultado = {numerador, denominador};
        return resultado;

    }

}

/*
private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }
    
    private Fraccion simplificar(Fraccion f) {
        int divisorComun = mcd(f.getNumerador(), f.getDenominador());
        int nuevoNumerador = f.getNumerador() / divisorComun;
        int nuevoDenominador = f.getDenominador() / divisorComun;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }
 */
