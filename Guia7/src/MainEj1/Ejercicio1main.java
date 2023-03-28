
package MainEj1;

import Ejercicio1.Libro;


public class Ejercicio1main {


    public static void main(String[] args) {
       Libro libro1 = new Libro();
       
       //Cargar Datos con metodo
       libro1.CargarDatos();
       
       //Mostrar informacion con metodo
       libro1.InformarLibro();
       
       //Mostrar informacion usando toString
        //System.out.println(libro1.toString());
    }
    
}
