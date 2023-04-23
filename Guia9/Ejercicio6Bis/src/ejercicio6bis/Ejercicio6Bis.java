
package ejercicio6bis;

import Entidades.Curso;
import Servicio.CursoServicio;


public class Ejercicio6Bis {


    public static void main(String[] args) {
       Curso s = CursoServicio.crearCurso();
        System.out.println(CursoServicio.calcularGananciaSemanal(s));
        Curso s1 = CursoServicio.crearCurso();
        System.out.println(CursoServicio.calcularGananciaSemanal(s1));
    }
    
}
