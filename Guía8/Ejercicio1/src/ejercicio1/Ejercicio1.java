package ejercicio1;

import Servicie.CuentaBancariaServicio;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        CuentaBancariaServicio cuenta = new CuentaBancariaServicio();
        Scanner leer = new Scanner(System.in);
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

            switch (opcion) {
                case 1:
                    cuenta.crearCuenta();                    
                    break;
                case 2:
                    cuenta.ingresar();                   
                    break;
                case 3:
                    cuenta.retirar();                    
                    break;
                case 4:
                    cuenta.extraccionRapida(0);                    
                    break;
                case 5:
                    cuenta.consultarSaldo();                    
                    break;
                case 6:
                    cuenta.consultarDatos();
                    break;
                case 7:

                    break;

            }
        } while (opcion != 7);

    }

}
