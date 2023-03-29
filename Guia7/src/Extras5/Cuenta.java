/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero
del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 */
package Extras5;

import java.util.Scanner;

public class Cuenta {

    private float saldo;
    private String titular;
    private float retirar;

    public Cuenta() {
    }

    public Cuenta(float saldo, String titular, float retirar) {
        this.saldo = saldo;
        this.titular = titular;
        this.retirar = retirar;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public float getRetirar() {
        return retirar;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setRetirar(float retirar) {
        this.retirar = retirar;
    }

    public void retirarDinero() {
        Scanner leer = new Scanner(System.in);
        /**
         *
         * @param cantidad
         */
    public void retirarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Error: no hay suficiente saldo");
        } else {
            double nuevoSaldo = saldo - cantidad;
            if (nuevoSaldo < 0) {
                System.out.println("Error: no se puede dejar el saldo negativo");
            } else {
                saldo = (float) nuevoSaldo;
            }
        }
    }
}







 
/*
int opc;
        double retiro = 0;
        String res = null;
        
        do {
            System.out.println("Bienvenido:........." + this.titular + ".........\nIngrese la opcion que desea relizar: \n 1.Saldo de cunta\n2.Retirar Dinero");
        opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Su saldo es: " + this.saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar");
                    retiro = leer.nextDouble();
                    if (this.saldo > retiro) {
                        System.out.println("Ud retiró: $" + retiro);
                        break;
                    } else {
                        System.out.println("Su saldo es insuficiente");

                        break;
                    }
                case 3:

                    break;

            }
        } while (!res.equalsIgnoreCase("s"));
*/
