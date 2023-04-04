/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo 
posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Servicie;

import java.util.Scanner;
import Entidad.CuentaBancaria;
import javax.swing.JOptionPane;

public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);
    CuentaBancaria c1 = new CuentaBancaria();

    public void crearCuenta() {
        int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de cuenta:"));
        long dniCliente = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese el DNI del cliente:"));
        double saldoActual = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el saldo de la cuenta:"));

        c1.setNumeroCuenta(numeroCuenta);
        c1.setDniCliente(dniCliente);
        c1.setSaldoActual(saldoActual);

        JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente.");

    }

    public void ingresar() {
        double ing = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero a ingresar a su cuenta"));
        c1.saldoActual += ing;
        JOptionPane.showMessageDialog(null, "Se ha depositado $" + ing + " en la cuenta " + c1.getNumeroCuenta());

    }

    public void retirar() {
        double ret = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a retirar:"));

        if (ret > c1.saldoActual) {
            ret = c1.saldoActual;
            c1.saldoActual = ret - c1.saldoActual;
            JOptionPane.showMessageDialog(null, "No tiene suficiente saldo para realizar el retiro. Se ha retirado $" + ret + " de la cuenta " + c1.getNumeroCuenta());
        } else {
            c1.saldoActual -= ret;
            JOptionPane.showMessageDialog(null, "Se ha retirado $" + ret + " de la cuenta " + c1.getNumeroCuenta());
        }

    }

    public void extraccionRapida(double ret) {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Retirar el 20% de su saldo?", "Extracción Rápida", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            ret = c1.saldoActual * 0.20;
            c1.saldoActual -= ret;
            JOptionPane.showMessageDialog(null, "Se ha retirado $" + ret + " de la cuenta " + c1.getNumeroCuenta());
        }

    }

    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo: " + c1.getSaldoActual());

    }

    public void consultarDatos() {
        JOptionPane.showMessageDialog(null, "Numero de cuenta: " + c1.getNumeroCuenta());
        JOptionPane.showMessageDialog(null, "DNI: " + c1.getDniCliente());
        JOptionPane.showMessageDialog(null, "Saldo Actual de la cueta: $" + c1.getSaldoActual());

    }
}
