/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro
y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
*/
package Ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;




public class Libro {
 public String isbn;
 public String titulo;
 public String autor;
 public Integer numpag;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, Integer numpag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
    }
    public void CargarDatos(){
        Scanner leer = new Scanner(System.in);
        JOptionPane.showInputDialog("ISBN: ");
        isbn = leer.nextLine();
        System.out.println("Titulo: ");
        titulo = leer.nextLine();
        System.out.println("Autor: ");
        autor = leer.nextLine();
        System.out.println("Numero de Paginas: ");
        numpag = leer.nextInt();
        
        
           }
    
    
    public void InformarLibro(){
        System.out.println("ISBN: "+isbn);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Numero de Paginas: "+numpag);
   }

//    @Override
//    public String toString() {
//        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numpag=" + numpag + '}';
//    }
  
}
/*
public void CargarDatos()
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de ISBN:");
        this.ISBN = leer.nextLine();
        System.out.println("Ingrese el título del libro:");
        this.Titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro:");
        this.Autor = leer.nextLine();
        System.out.println("Ingrese el número de páginas del libro:");
        this.numP = leer.nextInt();
        
        
        
    }
    public void InformarLibro(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("Titulo: "+Titulo);
        System.out.println("Autor: "+Autor);
        System.out.println("Numero de Paginas: "+numP);
    }
*/