/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sistemas
 */
public class Prueba {

    public static void main(String[] args) {
        int n = 12;
        int d = 18;
        for (int i = 2; i < 10; i++) {
            if (n%i==0 && d%i==0) {
                n=n/i;
                d=d/i;
            }
            
        }
        
    }
    

}
