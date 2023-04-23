
package Service;

import Entidad.NIF;
import java.util.Scanner;

public class NIFServicio {

    private static long dni;
    private static String letra;
    private static Scanner sc = new Scanner(System.in);

    public static NIF creaNif() {
        System.out.println("Ingrese su DNI");
        dni = sc.nextLong();
        calcularLetra(dni);
        return new NIF(dni, letra);
    }

    public static void calcularLetra(long dni) {
        long resultado = dni % 23;
        String[] nombreLetras = new String[23];
        String codigo = "TRWAGMYFPDXBNJZSQVHLCKE";
        for (int i = 0; i < 23; i++) {
            nombreLetras[i] = codigo.substring(i, i + 1);
            if (i == resultado) {
                letra = nombreLetras[i];
                break;
            }
        }

    }

    public static void mostrar() {
        System.out.println(dni + "-" + letra);
    }

}


