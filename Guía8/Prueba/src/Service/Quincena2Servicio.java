
package Service;

import Entidad.Quincena1;
import java.util.Scanner;


public class Quincena2Servicio {
//    Scanner leer = new Scanner(System.in);
//    
//    public void totalSueldo2(Quincena1 q, Quincena1Servicio qs){
//        qs.valorPorCategoria(q);
//        System.out.println("Si ud Cobra Titulo Digite el Numero 1 de lo contrario digite 0: ");
//        int T = leer.nextInt();
//        if (T == 1) {
//            q.setTIT(5925.280); 
//
//        }
//        q.setValorHora((float) q.getJornal() / 8);//Valor de la Hora
//        System.out.println("El valor de la hora es: " + q.getValorHora());
//
//        System.out.println("Ingrese sus dias trabajados: ");//dias trabajados
//        q.setJornalTrabajado(leer.nextInt());
//        q.setTotalBruto(q.getJornalTrabajado() * q.getJornal());//Remuneracion por el total de dias Trabajados
//        System.out.println("nEl total bruto de la quincena es: " + q.getTotalBruto());
//
//        System.out.println("Digite los dias feriados: ");
//        q.setDiasFer(leer.nextInt());
//        q.setTotalFeriado(q.getDiasFer() * q.getJornal());
//        System.out.println("El Total a cobrar por dias feriados es : " + q.getTotalFeriado());
//
//        System.out.println("Ingrese el total de horas extras simples: ");
//        q.setHoraExSim(leer.nextInt());
//        q.setHoraExSim((q.getValorHora() * 1.5) * q.getHoraExSim());//Remuneracion por horas extras al 50% 
//        System.out.println("nEl total a cobrar de horas extras simples es: " + q.getTotalHoraSim());
//        System.out.println("Ingrese el total de horas extras al cien: ");
//        q.setHoraExCien(leer.nextInt());
//        q.setTotalHoraExCien((q.getValorHora() * 2) * q.getHoraExCien());//Remuneracion por horas extras al 100%
//        System.out.println("El total a cobrar de horas extras al cien es: " + q.getTotalHoraExCien());
//
//        System.out.println("Digite sus años de escalafon: ");
//        q.setAntiguedad(leer.nextInt());
//        q.setAntigTotal(q.getAntiguedad() * q.getVant());
//        System.out.println("El total a cobrar por su antigüedad es: " + q.getAntigTotal());
//
//        System.out.println("Ingrese los dias trabajados en la primera quincena: ");
//        q.setPrimeQuincena(leer.nextDouble());
//        q.setTotalPriQuin(q.getPrimeQuincena() * q.getJornal());
//        System.out.println("El Total ganado en la primera quincena es: " + q.getTotalPriQuin());
//            
//        q.setPresentismo((q.getFaltas() == 0) ? (25 * q.getJornal() + q.getAntigTotal()) * 0.15 : (((25 * q.getJornal() + q.getAntigTotal()) * 0.15) / 2));
//        System.out.println("El Total ganado por presentismo es: " + q.getPresentismo());
//
//
//        q.setDescuento((q.getTotalBruto() + q.getTotalFeriado() + q.getAntigTotal() + q.getPresentismo() + q.getTotalHoraSim() + q.getHoraExCien()) * 0.18);
//        System.out.println("total de descuento es: " + q.getDescuento());
//
//        sueldoBruto = totalBruto + totalFeriado + antigTotal + presentismo + totalHoraSim + totalHoraExCien;
//        System.out.println("El total de su sueldo bruto es: " + sueldoBruto);
//
//        totalDescuento = sueldoBruto - descuento;
//        System.out.println("El sueldo total con descuento es: " + totalDescuento);
//
//        mes =  jornalTrabajado + primeQuincena;
//        System.out.println("Sus dias trabajados en el mes son: " + mes);
//        if (cat == 1) {
//            gratNoRemunerativa = (float) 1461.88 * mes;
//            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
//        } else if (cat == 2) {
//            gratNoRemunerativa = (float) 1529.11 * mes;
//            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
//        }
//        if (cat == 3) {
//            gratNoRemunerativa = (float) 1556.47 * mes;
//            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
//        } else if (cat == 4) {
//            gratNoRemunerativa = (float) 1613.9 * 25 * mes;
//            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
//        }
//        if (cat == 5) {
//            gratNoRemunerativa = (float) 1648.99 * mes;
//            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
//        } else if (cat == 6) {
//            gratNoRemunerativa = (float) 1707.47 * mes;
//            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
//        }
//        if (cat == 7) {
//            gratNoRemunerativa = (float) 1780.56 * mes;
//            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
//        } else if (cat == 8) {
//            gratNoRemunerativa = (float) 1830.26 * mes;
//            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
//        }
//        sueldoTotal = (float) totalDescuento + gratNoRemunerativa;
//        System.out.println("nEl sueldo total de la segunda quincena es: " + sueldoTotal);
//        float res = (float) (sueldoTotal + (totalPriQuin - (totalPriQuin * 0.18)));
//        System.out.println("Sueldo Total del mes: " + res);
//    }
//
//}
        
  
}
