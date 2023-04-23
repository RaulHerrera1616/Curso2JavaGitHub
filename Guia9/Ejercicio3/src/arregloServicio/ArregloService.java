///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package arregloServicio;

import java.util.Arrays;

    public class ArregloService {

        public void inicializarA(double[] arreglo) {
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = Math.random() * 10;
            }
            System.out.println("-----------------------------------");
        }

        public void mostrarArreglo(double[] arreglo) {
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("[" + arreglo[i] + "]");
            }
            System.out.println("-----------------------------------");
        }

        public void mostrarArregloMayorAMenor(double[] arreglo) {
            Arrays.sort(arreglo);
            for (int i = arreglo.length - 1; i > 0; i--) {
                System.out.println(arreglo[i]);
            }
            System.out.println("-----------------------------------");
        }

        public void inicializarB(double[] arregloA, double[] arregloB) {
            System.arraycopy(arregloA, 0, arregloB, 0, 10);
            for (int i = 10; i < 20; i++) {
                arregloB[i] = 0.5;
            }
        }
    }

