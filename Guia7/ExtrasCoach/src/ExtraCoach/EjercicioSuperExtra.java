
package EjercicioProfeCaro;

import ExtraCoach.Producto;



public class EjercicioSuperExtra {


    public static void main(String[] args) {
        Producto prod1 = new Producto();
        Producto prod2 = new Producto("Yerba", "Y3r84", 21, 1200);
        Producto prod3 = new Producto("Cerveza", "C3Rv3z4", 45, 550);
        
        prod1.crearProducto();
        prod2.mostrarProducto();
        prod3.mostrarProducto();
        prod1.mostrarProducto();
        prod2.venderProducto(5);
        prod3.cambiarPrecio();
        prod1.venderProducto(7);
        
        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
        System.out.println(prod3.toString());
    }
    
}
