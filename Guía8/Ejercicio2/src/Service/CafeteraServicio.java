/*
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad 
actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Service;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Cafetera c1 = new Cafetera();
    Scanner leer = new Scanner(System.in);

    public void llenarCafetera() {
        c1.setCapacidadActual(c1.getCapacidadMaxima());
        System.out.println(c1.getCapacidadActual());
    }

    public void servirTaza(int tazaVacia) {
        tazaVacia = 250;
        if (c1.getCapacidadActual() >= tazaVacia) {
            c1.setCapacidadActual(c1.getCapacidadActual() - tazaVacia);
            System.out.println("Se lleno la taza");
        } else {
            int restante = (c1.getCapacidadActual() * 100) / tazaVacia;
            c1.setCapacidadActual(0);
            System.out.println("La taza contiene el " + restante + "% de su capacidad");
        }

    }

    public void vaciarCafetera() {
        c1.setCapacidadActual(0);
    }
    public void agregarCafe(int cafe){
        System.out.println("Vierta café en la cafetera");
        cafe = leer.nextInt();
        if (cafe<=c1.getCapacidadMaxima()) {
            c1.setCapacidadActual(cafe);
        }else{
            c1.setCapacidadActual(c1.getCapacidadMaxima());
            System.out.println("Se a llenado la cafetera y se a desperdiciado: " +(cafe-c1.getCapacidadMaxima())+ " ml de café");
        }
    }
}
