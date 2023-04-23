/*








 */
package Servicio;

import Entidades.Cadena;

public class CadenaServicio {
    
    //    //a)- Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.

    public void mostrarVocales(Cadena c) {
        String frase = c.getFrase();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            String letra = frase.substring(i, i + 1);
            if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U"))  {
                cont++;
            }
        }
        System.out.println("La cantidad de vocales es: " + cont);
    }
    
    /*
    b)- Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    */
    public void invertirFrase(Cadena c){
        String frase = c.getFrase();
        StringBuilder revertir = new StringBuilder(frase);
        
        System.out.println("La frase invertida es: " + revertir.reverse());
    }
    
    /*
    c)- Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar 
    cuántas veces se repite el carácter en la frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    */
    public void vecesRepetida(String letra, Cadena c){
        String frase = c.getFrase();
        int cont =0;
        for (int i = 0; i < frase.length(); i++) {
            char car = frase.charAt(i);
            if (String.valueOf(car).equals(letra)) {
                cont++;
            }
        }
        System.out.println("La letra: " + letra + " se repite " + cont + " veces");
    }
    
    /*
    d)- Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase
    con otra nueva frase ingresada por el usuario.
    */
    public void compararLongitud(String frase2, Cadena c){
        int long1=c.getFrase().length();
        int long2=frase2.length();
        if (long1>long2) {
            System.out.println("La frase Original es mayor a la frase a la nueva frase ingresada");
        }else if (long1<long2) {
            System.out.println("La frase Original es menor a la nueva frase ingresada");
        }else{
            System.out.println("La frase Original y la nueva frase ingresada son iguales");
        }
    }
    
    /*
    e)- Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva 
    frase ingresada por el usuario y mostrar la frase resultante.
    */
    public void unirFraes(String frase2, Cadena c){
        String frase = c.getFrase();
        String fraseunida=frase.concat( frase2);
        System.out.println("La frase unida es: "+fraseunida);
    }
    
    /*
    f)- Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
    por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    */
    
    public void remplazar(String letra, Cadena c){
        String frase = c.getFrase();
//        letra="a";
        for (int i = 0; i < frase.length(); i++) {
            char car = frase.charAt(i);
            if (String.valueOf(car).equalsIgnoreCase(letra)) {
                car='%';
            }
            System.out.print(car);
        }
        System.out.println("");
        
    }
    
    /*
    g)- Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario 
    y devuelve verdadero si la contiene y falso si no.
    */
    public boolean contiene(String letra, Cadena c){
        String frase = c.getFrase();
        return frase.contains(letra);
    }
    
//    public void mostrarVocales(Cadena cadena) {
//        String frase = cadena.getFrase();
//        int contador = 0;
//        for (int i = 0; i < frase.length(); i++) {
//            char letra = frase.charAt(i);
//            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
//                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
//                contador++;
//            }
//        }
//        System.out.println("La frase tiene " + contador + " vocales.");
//    }
//
//    
//    public void invertirFrase(Cadena cadena) {
//        String frase = cadena.getFrase();
//        StringBuilder builder = new StringBuilder(frase);
//        builder.reverse();
//        System.out.println("La frase invertida es: " + builder.toString());
//    }
//
//    
//    public void vecesRepetido(Cadena cadena, char letra) {
//        String frase = cadena.getFrase();
//        int contador = 0;
//        for (int i = 0; i < frase.length(); i++) {
//            char c = frase.charAt(i);
//            if (c == letra) {
//                contador++;
//            }
//        }
//        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
//    }
//
//    
//    public void compararLongitud(Cadena cadena, String otraFrase) {
//        int longitud1 = cadena.getLongitud();
//        int longitud2 = otraFrase.length();
//        if (longitud1 > longitud2) {
//            System.out.println("La frase original es más larga.");
//        } else if (longitud1 < longitud2) {
//            System.out.println("La frase ingresada es más larga.");
//        } else {
//            System.out.println("Las frases tienen la misma longitud.");
//        }
//    }
//
//    
//    public void unirFrases(Cadena cadena, String otraFrase) {
//        String frase = cadena.getFrase();
//        String fraseUnida = frase + " " + otraFrase;
//        System.out.println("Las frases unidas son: " + fraseUnida);
//    }
//
//    
//    public void reemplazar(Cadena cadena, char letra, char reemplazo) {
//        String frase = cadena.getFrase();
//        String nuevaFrase = frase.replace(letra, reemplazo);
//        System.out.println("La nueva frase es: " + nuevaFrase);
//    }
//    
//    public boolean contiene(Cadena cadena, char letra) {
//        String frase = cadena.getFrase();
//        return frase.indexOf(letra) != -1;
//    }
}
