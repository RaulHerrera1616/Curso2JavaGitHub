/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

 */
package Extras7;


public class Rectangulo {
    private float lado1;
    private float lado2;

    public Rectangulo() {
        lado1=4;
        lado2=6;
    }

    public Rectangulo(float lado1, float lado2) {
//        this.lado1 = lado1;
//        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
    public float calcularArea(){
        
        return lado1*lado2;
    }
    
}
