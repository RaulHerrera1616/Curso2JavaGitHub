/*
En NIFService se dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez calculado, le asigna 
la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera: 
Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método 
debe buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para obtener la letra correspondiente.
La tabla de caracteres es la siguiente:

POSICIÓN
LETRA
0       T                  12       N
1       R                  13       J
2       W                 14        Z
3       A                  15       S 
4       G                  16       Q
5       M                 17        V
6       Y                   18      H
7       F                   19      L
8       P                   20      C
9       D                   21      K
10      X                  22       E
11      B
 */
package Service;

import Entidad.NIF;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class NIFServicio {

    Scanner leer = new Scanner(System.in);
    NIF nif = new NIF();

    public void crearNIF() {
        long dni = Long.parseLong(JOptionPane.showInputDialog(null,"Introduce el numero de DNI: "));
        nif.setDni(dni);

    }

    public void calcularLetra() {
        final int cantidad = 23;
        String codigo = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = (int) (nif.getDni() % 23);
        String[] letras = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            letras[i] = codigo.substring(i, i + 1);
            if (i == resto) {
                nif.setLetra(letras[i]);
                break;
            }
        }
        nif.setLetra(nif.getLetra());

    }
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "NIF: " + nif.getDni() + "-" + nif.getLetra());

    }
}
