
package ejercicio3;

import arregloServicio.ArregloService;


public class Ejercicio3 {

    public static void main(String[] args) {
         ArregloService arrS = new ArregloService();
         
        double[] A = new double[50];
        double[] B = new double[20];

        arrS.inicializarA(A);
        arrS.mostrarArreglo(A);
        arrS.mostrarArregloMayorAMenor(A);
        arrS.inicializarB(A, B);
        arrS.mostrarArreglo(A);
        arrS.mostrarArreglo(B);
    }
}
    
    

