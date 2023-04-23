
package Sueldos;

import Entidad.Quincena1;
import Service.Quincena1Servicio;


public class SueldosMain {

 
    public static void main(String[] args) {
        Quincena1 q = new Quincena1();
        Quincena1Servicio q1 = new Quincena1Servicio();
        
        q1.valorPorCategoria(q);
        q1.totalSueldo(q);
    }
    
}
