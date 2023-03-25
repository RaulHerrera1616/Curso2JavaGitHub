
package Entidad;


public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    
    private int energia;

    public Persona(){//Constructor
        this.energia = 1000;
    
    }
    
    public Persona(String nombre, int edad, int dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.energia = 1000;
        
    }

    public void setNombre(String nombre){//Setter
        this.nombre = nombre;        
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public int pasear(int energiaRestar){
        
        energia -= energiaRestar;
        
        return energia;
    
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", energia=" + energia + '}';
    }
    

    
    
}

