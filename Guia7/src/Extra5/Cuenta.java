/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero
del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 */
package Extra5;

import java.util.Scanner;

public class Cuenta {

    private float saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(float saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double retirarDinero() {
        Scanner leer = new Scanner(System.in);
        int opc;
        double retiro = 0;
        String res=null;
        System.out.println("Bienvenido:........." + this.titular + ".........\nIngrese la opcion que desea relizar: \n 1.Saldo de cunta\n2.Retirar Dinero");
        opc = leer.nextInt();
        do {
            switch (opc) {
                case 1:
                    System.out.println("Su saldo es: " + this.saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar");
                    retiro = leer.nextDouble();
                    if (saldo > retiro) {
                        System.out.println("Ud retiró: $" + retiro);
                        break;
                    } else {
                        System.out.println("Su saldo es insuficiente");
                        System.out.println("¿Necesita realizar otra operacion? s/n");
                        res = leer.next();
                        
                        break;
                    }
                case 3:
                    
                    break;
                
                   
            }
        } while (opc < 3 || (!(res.equalsIgnoreCase("s"))) );

        return 0;
    }
}
