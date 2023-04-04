/*
A continuación, en la clase main hacer lo siguiente:
***Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en
su peso ideal, tiene sobrepeso
o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están
por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos 
crear unos métodos adicionales.
 */
package Ejercicio3;

import Entidad.Persona;
import Service.PersonaServicio;

public class Ejercicio3 {

    public static void main(String[] args) {
        final int cantidad=4;
        PersonaServicio ps = new PersonaServicio();
        Persona [] personas = new Persona[cantidad];
        
        int [] imc = new int[cantidad];
        boolean [] mayor = new boolean[cantidad];
        
        for (int i = 0; i < personas.length; i++) {
            personas[i]=ps.crearPersona();
            imc[i]=ps.calcularIMC(personas[i]);
            mayor[i]=ps.esMayorDeEdad(personas[i]);
        }
        ps.porcentajeIMC(imc);
        ps.porcentajesMayores(mayor);
        
    }
    
} 

