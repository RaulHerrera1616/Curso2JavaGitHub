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
package Servicio;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FechaService {
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese el día");
        int dia= leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        Date fechaNacimiento= new Date(anio-1900, mes-1, dia);
        System.out.println(fechaNacimiento.toString());
        return fechaNacimiento;
    }
    
    public Date fechaActual(){
        Date fechaActual = new Date();
        System.out.println(fechaActual.toString());
        return fechaActual;
    }
    
    public void diferencia(Date nacimiento, Date actual){
        
//        int edad=actual.getYear()-nacimiento.getYear();
        long edad = Math.abs(actual.getTime()-nacimiento.getTime());
        long diferencia = TimeUnit.DAYS.convert(edad, TimeUnit.MILLISECONDS);
        diferencia /=365;
        System.out.println("La diferencia en años es de: "+diferencia);
    }
}
