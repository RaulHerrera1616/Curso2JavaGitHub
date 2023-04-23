package extra2bis;

import Entidad.NIF;
import Service.NIFServicio;

public class Extra2Bis {

    public static void main(String[] args) {
        NIF nif1 = NIFServicio.creaNif();

        int miDni = 34574409 % 23;
        System.out.println(miDni);
        NIFServicio.mostrar();

    }

}
