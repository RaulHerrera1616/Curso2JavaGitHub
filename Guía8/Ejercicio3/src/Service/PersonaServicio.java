/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
***Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
***Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, 
comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
***Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa que la persona está
por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
***Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso
o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
***Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están
por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos 
crear unos métodos adicionales.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PersonaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    //Persona p1;
    public boolean esMayorDeEdad(Persona p1) {
        return p1.getEdad() >= 18;
    }

    public Persona crearPersona() {

        String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la edad"));
        String sexo = JOptionPane.showInputDialog(null, "Introduzca el sexo");

        while (!(sexo.equalsIgnoreCase("H")) && !(sexo.equalsIgnoreCase("M")) && !(sexo.equalsIgnoreCase("O"))) {
            sexo = JOptionPane.showInputDialog(null, "Introduzca otra vez el  sexo");

        }
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Introdzca el peso"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca la altura"));

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona p) {
        double r = p.getPeso() / (Math.pow(p.getAltura(), 2));
        if (r < 20) {
            return -1;
        } else if (r >= 20 && r <= 25) {
            return 0;
        }
        return 1;
    }

    public void porcentajeIMC(int[] imcs) {
        int cont = imcs.length;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        for (int imc : imcs) {
            switch (imc) {
                case -1:
                    cont1++;
                    break;
                case 0:
                    cont2++;
                    break;
                case 1:
                    cont3++;
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Porcetaje de personas con bajo peso: %" + (cont1 * 100 / cont));
        JOptionPane.showMessageDialog(null, "Porcetaje de personas con bajo peso: %" + (cont2 * 100 / cont));
        JOptionPane.showMessageDialog(null, "Porcetaje de personas con bajo peso: %" + (cont3 * 100 / cont));

    }

    public void porcentajesMayores(boolean[] mayor) {
        int may = 0, men = 0;
        int total = mayor.length;
        for (boolean b : mayor) {
            if (b) {
                may++;
            } else {
                men++;
            }
        }
        JOptionPane.showMessageDialog(null, "Porcentaje de mayores de edad: %" + (may * 100 / total));
        JOptionPane.showMessageDialog(null, "Porcentaje de mayores de edad: %" + (men * 100 / total));

    }

}
