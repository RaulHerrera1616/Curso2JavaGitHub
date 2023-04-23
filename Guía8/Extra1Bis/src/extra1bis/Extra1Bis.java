package extra1bis;

import Entidad.Raices;
import Service.RaicesServicio;

public class Extra1Bis {

    public static void main(String[] args) {
        
        Raices r1 = RaicesServicio.llenar();

        System.out.println(r1);

        System.out.println(RaicesServicio.getDiscriminate());

        RaicesServicio.obtenerRaices();
        RaicesServicio.obtenerRaiz();
        RaicesServicio.calcular();

    }
}


