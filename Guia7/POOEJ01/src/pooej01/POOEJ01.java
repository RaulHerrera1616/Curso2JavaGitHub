
package pooej01;

import Entidad.Persona;


public class POOEJ01 {

 
    public static void main(String[] args) {
        Persona p1 = new Persona("Jorge", 23, 12345678);
        
        p1.setNombre("Julio");//Settear
        
        System.out.println(p1);
        
        p1.pasear(100);
        
        //System.out.println(p1.getNombre());
        System.out.println(p1);
    }
    
}
