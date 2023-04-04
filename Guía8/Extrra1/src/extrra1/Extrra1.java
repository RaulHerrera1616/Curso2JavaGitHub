package extrra1;

import Entidad.Raices;
import Service.RaicesServicio;

public class Extrra1 {

    public static void main(String[] args) {

        Raices r = new Raices(6, 4, 8);
        Raices r1 = new Raices(1, -5, 6);
        RaicesServicio servicio = new RaicesServicio();
        
        
        System.out.println(servicio.getDiscriminante(r));
        System.out.println(servicio.tieneRaices(r));
        System.out.println(servicio.tieneRaiz(r));
        servicio.ObtenerRaices(r);
        servicio.obtenerRaiz(r);
        servicio.calcular(r);
        System.out.println(servicio.getDiscriminante(r1));
        System.out.println(servicio.tieneRaices(r1));
        System.out.println(servicio.tieneRaiz(r1));
        servicio.ObtenerRaices(r1);
        servicio.obtenerRaiz(r1);
        servicio.calcular(r1);
    }

}
