package Service;

import Entidad.Raices;

public class RaicesServicio {

    private static int a;
    private static int b;
    private static int c;

    public static Raices llenar() {
        a = 1;
        b = -5;
        c = 6;

        return new Raices(a, b, c);
    }

    public static double getDiscriminate() {
        double discriminate;

        discriminate = (Math.pow(b, 2) - 4 * a * c);

        return discriminate;

    }

    public static boolean tieneRaices() {

        double discriminate = getDiscriminate();

        return discriminate >= 0; //Si se cumple me da verdadero, caso contrario me tira false
    }

    public static boolean tieneRaiz() {

        double discriminate = getDiscriminate();

        return discriminate == 0;
    }

    public static void obtenerRaices() {

        if (tieneRaices()) {
            double x = ((-b) + Math.sqrt(getDiscriminate()) / (2 * a));
            double x1 = ((-b) - Math.sqrt(getDiscriminate()) / (2 * a));

            System.out.println("Las raíces son: " + x + " " + x1);
        } else {
            System.out.println("No existe solución real");
        }
    }

    public static void obtenerRaiz() {

        if (tieneRaiz()) {
            double x = (-b) / (2 * a);
            System.out.println("La raiz es: " + x);
        } else {
            System.out.println("No existe solución real");
        }
    }

    public static void calcular() {

        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No existe solución real");
        }

    }
}
