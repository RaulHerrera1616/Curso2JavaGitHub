
package Servicio;

import Entidades.Curso;
import java.util.Scanner;


public class CursoServicio {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese alumno");
            alumnos[i] = leer.next();

        }
        return alumnos;
    }

    public static Curso crearCurso() {
        String[] alumnos = CursoServicio.cargarAlumnos();
        System.out.println("Ingrese el nombre del curso ");
        String nombre = leer.next();
        System.out.println("Ingrese la cantidad de horas por dia ");
        int horasPorDia = leer.nextInt();
        System.out.println("Ingrese dias por semana ");
        int diasPorSemana = leer.nextInt();
        System.out.println("Ingrese el turno  (Mañana o Tarde)");
        String turno = leer.next();
        System.out.println("Ingrese el precio por hora ");
        double precioPorHora = leer.nextDouble();
        return new Curso(nombre, horasPorDia, diasPorSemana, turno, precioPorHora, alumnos);
    }

    public static double calcularGananciaSemanal(Curso s) {

        return s.getCantidadHorasPorDia() * s.getPrecioPorHora() * s.getAlumnos().length * s.getCantidadDiasPorSemana();
    }
}
