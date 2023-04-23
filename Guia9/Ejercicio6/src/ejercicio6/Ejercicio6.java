
package ejercicio6;

import Entidades.Curso;


public class Ejercicio6 {


    public static void main(String[] args) {
                // Crear un objeto curso1 con el constructor por defecto
        Curso curso1 = new Curso();

        // Crear un objeto curso2 con el constructor que recibe todos los atributos como parámetro
        String[] alumnos = {"Juan", "María", "Pedro", "Ana", "Luis"};
        Curso curso2 = new Curso("Matemáticas", 2, 3, "mañana", 100, alumnos);

        // Utilizar los setters para asignar valores a los atributos del objeto curso1
        System.out.println("Crear Curso 1");
        curso1.setNombreCurso("Programación");
        curso1.setCantidadHorasPorDia(3);
        curso1.setCantidadDiasPorSemana(5);
        curso1.setTurno("tarde");
        curso1.setPrecioPorHora(150);
        curso1.cargarAlumnos(); // Llenar el arreglo alumnos del objeto curso1 con los nombres de los alumnos

        // Utilizar el método crearCurso para llenar el objeto curso1 con los datos ingresados por el usuario
        System.out.println("Crear Curso 3");
        Curso curso3= new Curso();
        curso3.crearCurso();

        // Imprimir los valores de los atributos de los objetos curso1 y curso2
        System.out.println("Datos del curso 1:");
        System.out.println("Nombre del curso: " + curso1.getNombreCurso());
        System.out.println("Cantidad de horas por día: " + curso1.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana: " + curso1.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso1.getTurno());
        System.out.println("Precio por hora: " + curso1.getPrecioPorHora());
        System.out.println("Alumnos:");
        for (String alumno : curso1.getAlumnos()) {
            System.out.println(alumno);
        }

        System.out.println("\nDatos del curso 2:");
        System.out.println("Nombre del curso: " + curso2.getNombreCurso());
        System.out.println("Cantidad de horas por día: " + curso2.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana: " + curso2.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso2.getTurno());
        System.out.println("Precio por hora: " + curso2.getPrecioPorHora());
        System.out.println("Alumnos:");
        for (String alumno : curso2.getAlumnos()) {
            System.out.println(alumno);
        }
        System.out.println("\nDatos del curso 3:");
        System.out.println("Nombre del curso: " + curso3.getNombreCurso());
        System.out.println("Cantidad de horas por día: " + curso3.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana: " + curso3.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso3.getTurno());
        System.out.println("Precio por hora: " + curso3.getPrecioPorHora());
        System.out.println("Alumnos:");
        for (String alumno : curso3.getAlumnos()) {
            System.out.println(alumno);
        }

        // Calcular la ganancia semanal de los cursos
        double gananciaSemanalCurso1 = curso1.calcularGananciaSemanal();
        double gananciaSemanalCurso2 = curso2.calcularGananciaSemanal();
        double gananciaSemanalCurso3 = curso3.calcularGananciaSemanal();

        System.out.println("\nLa ganancia semanal del curso 1 es: " + gananciaSemanalCurso1);
        System.out.println("La ganancia semanal del curso 2 es: " + gananciaSemanalCurso2);
        System.out.println("La ganancia semanal del curso 3 es: " + gananciaSemanalCurso2);
    }
    
}
