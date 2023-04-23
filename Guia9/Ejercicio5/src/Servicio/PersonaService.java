/*
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a 
crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha
de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class PersonaService {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        
        Persona persona = new Persona();
        System.out.println("Ingrese su nombre");
        persona.setNombre(leer.nextLine()); 
        System.out.println("Ingrese el dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();
//System.out.println("Ingrese año, mes y dia de nacimiento");
        Date fechanacimiento = new Date(anio-1900,mes-1,dia);
        persona.setFechaNacimiento(fechanacimiento);
        return persona;
    }
    /*
    Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
    persona es menor que la edad consultada o false en caso contrario.
    */
    public boolean menorQue(Persona p, long edad){
        //long edad = Math.abs(actual.getTime()-nacimiento.getTime());
        
        Date fechaActual = new Date();
       
//        Date fechaNacimiento = new Date(p.getFechaNacimiento());
        
        long edadPersona = Math.abs(fechaActual.getTime()-p.getFechaNacimiento().getTime());
       
        long diferencia = TimeUnit.DAYS.convert(edad, TimeUnit.MILLISECONDS)/365;
       
        
        return diferencia<edad;
        
    }
    public void mostrarPersona(Persona p){
        System.out.println(p.toString());
    }
}
/*
SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        // Formatear la fecha
        String fechaFormateada = formato.format(p.getFechNac());
        // Mostrar la fecha formateada
        System.out.println("Fecha formateada: " + fechaFormateada);
*/