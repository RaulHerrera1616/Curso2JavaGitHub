package Sueldos;

import java.util.Scanner;
import javax.swing.JOptionPane;
import programa.de.sueldos.Quincena1;
import programa.de.sueldos.Quincena2;

public class Sueldos2022 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Quincena1 qui = new Quincena1();
        Quincena2 qui1 = new Quincena2();

        int opc;
        do {
            String menu = "Bienvenido al Programa Sueldos\n\n" +
                          "1. Primera Quincena 2022\n" +
                          "2. Segunda Quincena 2022\n" +
                          "3. Mensual 2022\n" +
                          "4. SAC\n" +
                          "5. Mostrando Boleta Quincena\n" +
                          "6. Mostrando Boleta Mensual\n" +
                          "7. Mostrando Boleta de SAC\n" +
                          "8. Salir\n\n" +
                          "Por favor, seleccione una opción:";
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
//            System.out.println("------------------------------");
//            System.out.println("**********MENU**********");
//            System.out.println("------------------------------");
//            System.out.println("1. Primera Quincena 2022");
//            System.out.println("2. Segunda Quincena 2022");
//            System.out.println("3. Mensual 2022");
//            System.out.println("4. SAC");
//            System.out.println("5. Mostrando Boleta Quincena");
//            System.out.println("6. Mostrando Boleta Mensual");
//            System.out.println("7. Mostrando Boleta de SAC");
//            System.out.println("8. Salir");
//            System.out.println("Opción");
//            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    float quincena = (float) qui.totalBasico();
                    System.out.println("Total de la quincena: $" + quincena);

                    break;
                case 2:
                    qui1.numeroLegajo();
                    qui1.totalSueldo();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;

            }

        } while (opc != 8);
    }

    public static void Mostrarlegajos() {

    }

}
/*
        int opcion = 0;
        do {
 String menu = "Bienvenido al Banco JRH\n\n" +
                          "1. Crear cuenta\n" +
                          "2. Ingresar dinero\n" +
                          "3. Retirar dinero\n" +
                          "4. Extracción rápida\n" +
                          "5. Consultar saldo\n" +
                          "6. Consultar datos\n" +
                          "7. Salir\n\n" +
                          "Por favor, seleccione una opción:";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
*/