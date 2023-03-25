/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosSubprogramas;

/**
 *
 * @author sistemas
 */
public class Ejercicio3ConvertirDolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
/*
  a  Todos
public class Ejercicio03 {

    /*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
    estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
    que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
    i.* 0.86 libras es un 1 € 
    ii. * 1.28611 $ es un 1 €
    iii. * 129.852 yenes es un 1 €
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad en euros");
        double euros = read.nextDouble();
        System.out.println("Seleccione a que moneda desea convertir\nA- Dólares\nB- Yenes\nC- Libras\n");
        String sel = read.next();
        
        cambio(euros,sel);
        
    }
    
    
    
    public static void cambio(double euros, String moneda){
        
        switch (moneda){
            case "A":
                double dolar = euros * 1.28611;
                System.out.println(euros + " equivalen a $ " + dolar + " Dólares.");
                break;
            case "B":
                double yen = euros * 129.852;
                System.out.println(euros + " equivalen a Y " + yen + " Yenes.");
                break;
            case "C":
                double libra = euros * 0.86;
                System.out.println(libra + " equivalen a L " + libra + " Libras");
                break;
        }
    }
    
}
public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int sel;
        
        do {
            System.out.println("Elija una opción");
            System.out.println("\n1 - Sumar\n2 - Restar\n3 - Dividir\n4 - Multiplicar\n5 - Salir");
            sel = read.nextInt();
            
            switch (sel){
            case 1:
                int suma = sumar(num1,num2);
                System.out.println("El resultado de la suma es: "+ suma);
                break;
            case 2:
                int resta = restar(num1,num2);
                System.out.println("El resultado de la resta es: "+ resta);
                break;
            case 3:
                double div = dividir(num1,num2);
                System.out.println("El resultado de la división es: "+ div);
                break;
            case 4:
                int mult = multip(num1,num2);
                System.out.println("El resultado de la multiplicación es: "+ mult);
                break;
            case 5:
                System.out.println("Eligió salir");
            }
        } while(sel != 5);
        
    }
    
    
    public static int sumar(int x,int y){
        return x+y;
    }
    
    
    public static int restar(int x,int y){
        return x-y;
    }
    
    
    public static double dividir(double x,double y){
        return x/y;
    }
    
    
    public static int multip(int x,int y){
        return x*y;
    }
    
    
}
*/