/*
Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los 
pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo
fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor 
vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre
una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle

 */
package ejercicio4;

import Servicio.FechaService;
import java.util.Date;

/**
 *
 * @author sistemas
 */
public class Ejercicio4 {


    public static void main(String[] args) {
        FechaService fecha = new FechaService();
        Date nacimiento = fecha.fechaNacimiento();
        Date actual = fecha.fechaActual();
        
        
        fecha.diferencia(nacimiento, actual);
    }
    
}
