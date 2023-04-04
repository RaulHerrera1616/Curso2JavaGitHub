
package extra2;

import Service.NIFServicio;


public class Extra2 {


    public static void main(String[] args) {
        NIFServicio servicio = new NIFServicio();
        
        servicio.crearNIF();
        servicio.calcularLetra();
        servicio.mostrar();
    }
    
}
