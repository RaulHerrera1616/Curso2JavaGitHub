/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package Service;

import Entidad.Raices;

public class RaicesServicio {


    public double getDiscriminante(Raices r) {
        return Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
    }

    public boolean tieneRaices(Raices r) {
        return getDiscriminante(r) >= 0;
    }

    public boolean tieneRaiz(Raices r) {
        return getDiscriminante(r) == 0;
    }

    public void ObtenerRaices(Raices r) {
        if (tieneRaices(r)) {
            double x1 = (-r.getB() + Math.sqrt(getDiscriminante(r)) / (2 * r.getA()));
            double x2 = (-r.getB() - Math.sqrt(getDiscriminante(r)) / (2 * r.getA()));
            System.out.println("Las raices son: " + x1+ " y " + x2);
        }else{
            System.out.println("No existen soluciones reales");
        }
        
    }
    public void obtenerRaiz(Raices r){
            if (tieneRaiz(r)) {
                double x = -r.getB() / (2*r.getA());
                System.out.println("La solucion es: " + x);
            }else{
                System.out.println("No existe una unica solución");
            }
        }
    public void calcular(Raices r){
            if (tieneRaices(r)) {
                ObtenerRaices(r);
            }else if (tieneRaiz(r)) {
                obtenerRaiz(r);
            }else{
                System.out.println("No existen soluciones reales");
            }
    }
}
