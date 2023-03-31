/*
Crear una clase llamada Producto que contenga los siguientes atributos: nombre, código, stock y precio. A continuación crear los siguientes métodos:
- Método constructor vacio y constructor con todos los atributos pasados por parámetro
- Método get y set para cada atributo
- Método crearProducto(): pide los datos al usuario y lo guarda en los diferentes atributos
- Método venderProducto(): pide al usuario que ingrese una cantidad del producto y lo mismo se debe restar del atributo stock
- Método cambiarPrecio(): pide al usuario un nuevo precio y lo asigna al atributo
- Método mostrarProducto(): mostrar el nombre, código, stock y precio del producto
 */
package ExtraCoach;

import java.util.Scanner;


public class Producto {
    String nombre;
    String codigo;
    int stock;
    double precio;

    public Producto() {
    }

    public Producto(String nombre, String codigo, int stock, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    Scanner leer = new Scanner(System.in);
    public void crearProducto(){
    
        System.out.println("Nombre del producto");
        this.nombre = leer.nextLine();
        System.out.println("Codigo del producto");
        this.codigo = leer.nextLine();
        System.out.println("Stock del producto");
        this.stock = leer.nextInt();
        System.out.println("Precio del producto");
        this.precio = leer.nextDouble();
    }
    public void venderProducto(int vendidos){
        
        System.out.println("Ingrese la cantidad de ventas del producto");
        vendidos = leer.nextInt();
        if (this.stock>vendidos) {
            this.stock -= vendidos;
            System.out.println("El stock de: "+this.nombre+" es de: " +this.stock);
        }else{
            System.out.println("El stock del producto: " +this.nombre+ " es insuficiente");
        }
    }
    public void cambiarPrecio(){
        System.out.println("Ingrese el nuevo precio del producto: "+this.nombre);
        this.precio = leer.nextDouble();
        
        System.out.println("El nuevo precio del producto "+this.nombre+ " es: "+this.precio);
    }
    public void mostrarProducto(){
        
        System.out.println("Nombre: " +this.nombre+ "\nCodigo: " +this.codigo+ "\nStock: " +this.stock+ "\nPrecio: " +this.precio);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Producto{" + "\nnombre=" + this.nombre + ", \ncodigo=" + this.codigo + ", \nstock=" + this.stock + ", \nprecio=" + this.precio + "\nleer=" + leer + '}';
    }
    
}
