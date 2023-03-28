/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.de.sueldos;

import java.util.Scanner;

public class Quincena2 {

    public double faltas;
    public double sind;
    public double os;
    public double vant;
    public int cat;
    public int legajo;
    public double jornal;
    public double TIT;
    public double valorHora;
    public double jornalTrabajado;
    public double totalBruto;
    public int diasFer;
    public double totalFeriado;
    public double horaExSim;
    public double totalHoraSim;
    public double horaExCien;
    public double totalHoraExCien;
    public int antiguedad;
    public double antigTotal;
    public double primeQuincena;
    public double totalPriQuin;
    public double presentismo;
    public double descuento;
    public double sueldoBruto;
    public double totalDescuento;
    public double mes;
    public double gratNoRemunerativa;
    public double sueldoTotal;

    Scanner leer = new Scanner(System.in);

    public Quincena2() {
    }

    public Quincena2(double faltas, double sind, double os, double vant, int cat, int legajo, double jornal, double TIT, double valorHora, double jornalTrabajado, double totalBruto, int diasFer, double totalFeriado, double horaExSim, double totalHoraSim, double horaExCien, double totalHoraExCien, int antiguedad, double antigTotal, double primeQuincena, double totalPriQuin, double presentismo, double descuento, double sueldoBruto, double totalDescuento, double mes, double gratNoRemunerativa, double sueldoTotal) {
        this.faltas = faltas;
        this.sind = sind;
        this.os = os;
        this.vant = vant;
        this.cat = cat;
        this.legajo = legajo;
        this.jornal = jornal;
        this.TIT = TIT;
        this.valorHora = valorHora;
        this.jornalTrabajado = jornalTrabajado;
        this.totalBruto = totalBruto;
        this.diasFer = diasFer;
        this.totalFeriado = totalFeriado;
        this.horaExSim = horaExSim;
        this.totalHoraSim = totalHoraSim;
        this.horaExCien = horaExCien;
        this.totalHoraExCien = totalHoraExCien;
        this.antiguedad = antiguedad;
        this.antigTotal = antigTotal;
        this.primeQuincena = primeQuincena;
        this.totalPriQuin = totalPriQuin;
        this.presentismo = presentismo;
        this.descuento = descuento;
        this.sueldoBruto = sueldoBruto;
        this.totalDescuento = totalDescuento;
        this.mes = mes;
        this.gratNoRemunerativa = gratNoRemunerativa;
        this.sueldoTotal = sueldoTotal;
    }

    public double getFaltas() {
        return faltas;
    }

    public double getSind() {
        return sind;
    }

    public double getOs() {
        return os;
    }

    public double getVant() {
        return vant;
    }

    public int getCat() {
        return cat;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getJornal() {
        return jornal;
    }

    public double getTIT() {
        return TIT;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getJornalTrabajado() {
        return jornalTrabajado;
    }

    public double getTotalBruto() {
        return totalBruto;
    }

    public int getDiasFer() {
        return diasFer;
    }

    public double getTotalFeriado() {
        return totalFeriado;
    }

    public double getHoraExSim() {
        return horaExSim;
    }

    public double getTotalHoraSim() {
        return totalHoraSim;
    }

    public double getHoraExCien() {
        return horaExCien;
    }

    public double getTotalHoraExCien() {
        return totalHoraExCien;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public double getAntigTotal() {
        return antigTotal;
    }

    public double getPrimeQuincena() {
        return primeQuincena;
    }

    public double getTotalPriQuin() {
        return totalPriQuin;
    }

    public double getPresentismo() {
        return presentismo;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public double getTotalDescuento() {
        return totalDescuento;
    }

    public double getMes() {
        return mes;
    }

    public double getGratNoRemunerativa() {
        return gratNoRemunerativa;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setFaltas(double faltas) {
        this.faltas = faltas;
    }

    public void setSind(double sind) {
        this.sind = sind;
    }

    public void setOs(double os) {
        this.os = os;
    }

    public void setVant(double vant) {
        this.vant = vant;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setJornal(double jornal) {
        this.jornal = jornal;
    }

    public void setTIT(double TIT) {
        this.TIT = TIT;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setJornalTrabajado(double jornalTrabajado) {
        this.jornalTrabajado = jornalTrabajado;
    }

    public void setTotalBruto(double totalBruto) {
        this.totalBruto = totalBruto;
    }

    public void setDiasFer(int diasFer) {
        this.diasFer = diasFer;
    }

    public void setTotalFeriado(double totalFeriado) {
        this.totalFeriado = totalFeriado;
    }

    public void setHoraExSim(double horaExSim) {
        this.horaExSim = horaExSim;
    }

    public void setTotalHoraSim(double totalHoraSim) {
        this.totalHoraSim = totalHoraSim;
    }

    public void setHoraExCien(double horaExCien) {
        this.horaExCien = horaExCien;
    }

    public void setTotalHoraExCien(double totalHoraExCien) {
        this.totalHoraExCien = totalHoraExCien;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setAntigTotal(double antigTotal) {
        this.antigTotal = antigTotal;
    }

    public void setPrimeQuincena(double primeQuincena) {
        this.primeQuincena = primeQuincena;
    }

    public void setTotalPriQuin(double totalPriQuin) {
        this.totalPriQuin = totalPriQuin;
    }

    public void setPresentismo(double presentismo) {
        this.presentismo = presentismo;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void setTotalDescuento(double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public void setMes(double mes) {
        this.mes = mes;
    }

    public void setGratNoRemunerativa(double gratNoRemunerativa) {
        this.gratNoRemunerativa = gratNoRemunerativa;
    }

    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void numeroLegajo() {
        System.out.println("Digite su numero de legajo: ");
        legajo = leer.nextInt();
        System.out.println("Ingrese los dias Ausentes: ");
        faltas = leer.nextInt();

        if (legajo == 3605 || legajo == 3686 || legajo == 3687 || legajo == 3759 || legajo == 3854 || legajo == 3871 || legajo == 3912 || legajo == 4013 || legajo == 4018 || legajo == 4033 || legajo == 4038 || legajo == 4063 || legajo == 4094 || legajo == 4096 || legajo == 4101 || legajo == 4104 || legajo == 4106 || legajo == 4114 || legajo == 4116 || legajo == 4125 || legajo == 4126 || legajo == 4128 || legajo == 4231 || legajo == 4140 || legajo == 4141 || legajo == 4142 || legajo == 4143 || legajo == 4145 || legajo == 4149 || legajo == 4150 || legajo == 4156 || legajo == 4157 || legajo == 4158 || legajo == 4177 || legajo == 5910 || legajo == 6222 || legajo == 6224 || legajo == 6834 || legajo == 6838 || legajo == 7318 || legajo == 7319 || legajo == 629) {

            cat = 1;
            jornal = 2853.02;
            System.out.println(jornal);
            if (faltas == 0) {
                vant = 855.91;

            } else {
                vant = 855.91 - (855.91 / (30 - faltas));

            }
        } else if (legajo == 3018 || legajo == 3465 || legajo == 3472 || legajo == 3604 || legajo == 3635 || legajo == 3713 || legajo == 3716 || legajo == 3717 || legajo == 3763 || legajo == 3767 || legajo == 3824 || legajo == 3872 || legajo == 3873 || legajo == 3874 || legajo == 3895 || legajo == 3901 || legajo == 3913 || legajo == 3914 || legajo == 3932 || legajo == 3942 || legajo == 3968 || legajo == 4000 || legajo == 4016 || legajo == 4023 || legajo == 4044 || legajo == 4061 || legajo == 4069 || legajo == 4102 || legajo == 4111 || legajo == 4112 || legajo == 4122 || legajo == 4124 || legajo == 4130 || legajo == 4133 || legajo == 4136 || legajo == 4138 || legajo == 4139 || legajo == 4147 || legajo == 4151 || legajo == 7610 || legajo == 0513) {

            cat = 2;
            jornal = 2984.26;
            System.out.println(jornal);
            if (faltas == 0) {
                vant = 820.67;

            } else {
                vant = 820.67 - (820.67 / (30 - faltas));
            }

        }
        if (legajo == 3478 || legajo == 3548 || legajo == 3554 || legajo == 3575 || legajo == 3609 || legajo == 3620 || legajo == 3861 || legajo == 3896 || legajo == 3937 || legajo == 3967 || legajo == 4009 || legajo == 4021 || legajo == 4052 || legajo == 4059) {

            cat = 3;
            jornal = 3038.47;
            System.out.println(jornal);
            if (faltas == 0) {
                vant = 812.79;

            } else {
                vant = 812.79 - (812.79 / (30 - faltas));

            }
        } else if (legajo == 3476 || legajo == 3485 || legajo == 3487 || legajo == 3488 || legajo == 3489 || legajo == 3490 || legajo == 3501 || legajo == 3522 || legajo == 3523 || legajo == 3524 || legajo == 3547 || legajo == 3550 || legajo == 3558 || legajo == 3637 || legajo == 3638 || legajo == 3640 || legajo == 3690 || legajo == 3736 || legajo == 3766 || legajo == 3768 || legajo == 3785 || legajo == 3792 || legajo == 3797 || legajo == 3801 || legajo == 3805 || legajo == 3807 || legajo == 3812 || legajo == 3843 || legajo == 3844 || legajo == 3855 || legajo == 3859 || legajo == 3865 || legajo == 3868 || legajo == 3879 || legajo == 3886 || legajo == 3897 || legajo == 3898 || legajo == 3900 || legajo == 3943 || legajo == 3954 || legajo == 3955 || legajo == 3957 || legajo == 3959 || legajo == 3970 || legajo == 3973 || legajo == 3985 || legajo == 3986 || legajo == 4006 || legajo == 4051 || legajo == 4054 || legajo == 4058 || legajo == 4070 || legajo == 4086 || legajo == 4129 || legajo == 4146 || legajo == 4152 || legajo == 4171 || legajo == 5327 || legajo == 5328 || legajo == 5348 || legajo == 5349 || legajo == 5350 || legajo == 6225) {

            cat = 4;
            jornal = 3149.73;
            System.out.println(jornal);
            if (faltas == 0) {
                vant = 944.92;

            } else {
                vant = 944.92 - (944.92 / (30 - faltas));

            }
        }
        if (legajo == 3459 || legajo == 3470 || legajo == 3477 || legajo == 3494 || legajo == 3512 || legajo == 3516 || legajo == 3552 || legajo == 3557 || legajo == 3584 || legajo == 3608 || legajo == 3616 || legajo == 3636 || legajo == 3681 || legajo == 3684 || legajo == 3724 || legajo == 3754 || legajo == 3774 || legajo == 3782 || legajo == 3799 || legajo == 3852 || legajo == 3857 || legajo == 3863 || legajo == 3876 || legajo == 3883 || legajo == 3887 || legajo == 3892 || legajo == 3915 || legajo == 3964 || legajo == 3965 || legajo == 3977 || legajo == 4040 || legajo == 4047 || legajo == 4073 || legajo == 4077 || legajo == 4099 || legajo == 4132 || legajo == 4137 || legajo == 5321) {

            cat = 5;
            jornal = 3218.21;
            System.out.println(jornal);
            if (faltas == 0) {
                vant = 965.46;

            } else {
                vant = 965.46 - (965.46 / (30 - faltas));

            }
        } else if (legajo == 3508 || legajo == 3509 || legajo == 3537 || legajo == 3556 || legajo == 3567 || legajo == 3571 || legajo == 3573 || legajo == 3577 || legajo == 3593 || legajo == 3599 || legajo == 3610 || legajo == 3630 || legajo == 3671 || legajo == 3710 || legajo == 3729 || legajo == 3731 || legajo == 3739 || legajo == 3771 || legajo == 3773 || legajo == 3775 || legajo == 3784 || legajo == 3798 || legajo == 3800 || legajo == 3809 || legajo == 3819 || legajo == 3822 || legajo == 3858 || legajo == 3862 || legajo == 3864 || legajo == 3870 || legajo == 3882 || legajo == 3884 || legajo == 3893 || legajo == 3909 || legajo == 3910 || legajo == 3911 || legajo == 3917 || legajo == 3923 || legajo == 3938 || legajo == 3969 || legajo == 3984 || legajo == 3995 || legajo == 4002 || legajo == 4007 || legajo == 4027 || legajo == 4028 || legajo == 4041 || legajo == 4043 || legajo == 4046 || legajo == 4083 || legajo == 41) {

            cat = 6;
            jornal = 3332.33;
            System.out.println(jornal);
            if (faltas == 0) {
                vant = 999.70;

            } else {
                vant = 999.70 - (999.70 / (30 - faltas));

            }
        }
        if (legajo == 3467 || legajo == 3539 || legajo == 4589 || legajo == 3611 || legajo == 3618 || legajo == 3629 || legajo == 3694 || legajo == 3772 || legajo == 3795 || legajo == 3823 || legajo == 3845 || legajo == 3856 || legajo == 6848 || legajo == 6862) {

            cat = 7;
            jornal = 3474.98;
            System.out.println(jornal);
            if (faltas == 0) {
                vant = 1042.49;

            } else {
                vant = 1042.49 - (1042.49 / (30 - faltas));

            }
        } else if (legajo == 3699 || legajo == 3760 || legajo == 3780 || legajo == 3916 || legajo == 3936 || legajo == 4025 || legajo == 7907 || legajo == 7909) {

            cat = 8;
            jornal = 3571.98;

            if (faltas == 0) {
                vant = 1071.59;
                System.out.println(jornal);
            } else {
                vant = 1071.59 - (1071.59 / (30 - faltas));

            }

        }

    }

    public void totalSueldo() {

        System.out.println("Si ud Cobra Titulo Digite el Numero 1 de lo contrario digite 0: ");;
        int T = leer.nextInt();
        if (T == 1) {
            TIT = 5925.280;

        }
        valorHora = (float) jornal / 8;//Valor de la Hora
        System.out.println("El valor de la hora es: " + valorHora);

        System.out.println("Ingrese sus dias trabajados: ");;//dias trabajados
        jornalTrabajado = leer.nextInt();
        totalBruto =  jornalTrabajado * jornal;//Remuneracion por el total de dias Trabajados
        System.out.println("nEl total bruto de la quincena es: " + totalBruto);;

        System.out.println("Digite los dias feriados: ");;
        diasFer = leer.nextInt();
        totalFeriado =  diasFer * jornal;
        System.out.println("El Total a cobrar por dias feriados es : " + totalFeriado);;

        System.out.println("Ingrese el total de horas extras simples: ");;
        horaExSim = leer.nextInt();
        totalHoraSim =  (valorHora * 1.5) * horaExSim;//Remuneracion por horas extras al 50% 
        System.out.println("nEl total a cobrar de horas extras simples es: " + totalHoraSim);;
        System.out.println("Ingrese el total de horas extras al cien: ");;
        horaExCien = leer.nextInt();
        totalHoraExCien =  (valorHora * 2) * horaExCien;//Remuneracion por horas extras al 100%
        System.out.println("El total a cobrar de horas extras al cien es: " + totalHoraExCien);

        System.out.println("Digite sus años de escalafon: ");;
        antiguedad = leer.nextInt();
        antigTotal =  antiguedad * vant;
        System.out.println("El total a cobrar por su antigüedad es: " + antigTotal);

        System.out.println("Ingrese los dias trabajados en la primera quincena: ");;
        primeQuincena = leer.nextDouble();
        totalPriQuin =  primeQuincena * jornal;
        System.out.println("El Total ganado en la primera quincena es: " + totalPriQuin);;

        if (faltas == 0) {
            presentismo =  (25 * jornal + antigTotal) * 0.15;
            System.out.println("El Total ganado por presentismo es: " + presentismo);
        } else if (faltas == 1) {
            presentismo = (((25 * jornal + antigTotal) * 0.15) / 2);
            System.out.println("El Total ganado por presentismo es: " + presentismo);
        }
        descuento = (totalBruto + totalFeriado + antigTotal + presentismo + totalHoraSim + totalHoraExCien) * 0.18;
        System.out.println("total de descuento es: " + descuento);;

        sueldoBruto = totalBruto + totalFeriado + antigTotal + presentismo + totalHoraSim + totalHoraExCien;
        System.out.println("El total de su sueldo bruto es: " + sueldoBruto);;

        totalDescuento = sueldoBruto - descuento;
        System.out.println("El sueldo total con descuento es: " + totalDescuento);;

        mes =  jornalTrabajado + primeQuincena;
        System.out.println("Sus dias trabajados en el mes son: " + mes);;
        if (cat == 1) {
            gratNoRemunerativa = (float) 1461.88 * mes;
            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
        } else if (cat == 2) {
            gratNoRemunerativa = (float) 1529.11 * mes;
            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
        }
        if (cat == 3) {
            gratNoRemunerativa = (float) 1556.47 * mes;
            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
        } else if (cat == 4) {
            gratNoRemunerativa = (float) 1613.9 * 25 * mes;
            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
        }
        if (cat == 5) {
            gratNoRemunerativa = (float) 1648.99 * mes;
            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
        } else if (cat == 6) {
            gratNoRemunerativa = (float) 1707.47 * mes;
            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
        }
        if (cat == 7) {
            gratNoRemunerativa = (float) 1780.56 * mes;
            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
        } else if (cat == 8) {
            gratNoRemunerativa = (float) 1830.26 * mes;
            System.out.println("Su gratificacion no remunerativa es: " + gratNoRemunerativa);
        }
        sueldoTotal = (float) totalDescuento + gratNoRemunerativa;
        System.out.println("nEl sueldo total de la segunda quincena es: " + sueldoTotal);;
        float res = (float) (sueldoTotal + (totalPriQuin - (totalPriQuin * 0.18)));
        System.out.println("Sueldo Total del mes: " + res);
    }

}

/*
cout<<"Digite su numero de legajo: ";cin>>legajo;
					cout<<"Ingrese los dias Ausentes: ";
					cin>>FA;
					faltas = FA;
					cout<<"\nFaltas: "<<FALTAS<<endl;
					if(legajo==3605||legajo==3686||legajo==3687||legajo==3759||legajo==3854||legajo==3871||legajo==3912||legajo==4013||legajo==4018||legajo==4033||legajo==4038||legajo==4063||legajo==4094||legajo==4096||legajo==4101||legajo==4104||legajo==4106||legajo==4114||legajo==4116||legajo==4125||legajo==4126||legajo==4128||legajo==4231||legajo==4140||legajo==4141||legajo==4142||legajo==4143||legajo==4145||legajo==4149||legajo==4150||legajo==4156||legajo==4157||legajo==4158||legajo==4177||legajo==5910||legajo==6222||legajo==6224||legajo==6834||legajo==6838||legajo==7318||legajo==7319||legajo==629){
					
					CAT = 1;
					cout<<"Su Categoria es: "<<CAT<<endl;
					jornal = 2853.02;
						cout<<"Su jornal es: "<<JO<<endl;
						if(faltas==0){
					VANT = 855.91;
					cout<<"Su pago por escalafon es: "<<VANT<<endl;					
					}
					else{
					VANT = 855.91-(855.91/(30-faltas));
					cout<<"Su pago por escalafon es: "<<VANT<<endl;					
					}
					}
					else if(legajo == 3018||legajo==3465||legajo==3472||legajo==3604||legajo==3635||legajo==3713||legajo==3716||legajo==3717||legajo==3763||legajo==3767||legajo==3824||legajo==3872||legajo==3873||legajo==3874||legajo==3895||legajo==3901||legajo==3913||legajo==3914||legajo==3932||legajo==3942||legajo==3968||legajo==4000||legajo==4016||legajo==4023||legajo==4044||legajo==4061||legajo==4069||legajo==4102||legajo==4111||legajo==4112||legajo==4122||legajo==4124||legajo==4130||legajo==4133||legajo==4136||legajo==4138||legajo==4139||legajo==4147||legajo==4151||legajo==7610||legajo==0513){
					
					CAT = 2;
					cout<<"Su Categoria es: "<<CAT<<endl;
					jornal = 2984.26;
						cout<<"Su jornal es: "<<JO<<endl;
						if(faltas==0){
						VANT = 820.67;
						cout<<"Su pago por escalafon es: "<<VANT<<endl;
					}
					else{
					VANT = 820.67-(820.67/(30-faltas));
					cout<<"Su pago por escalafon es: "<<VANT<<endl;
					
					}
					}
					if(legajo == 3478||legajo==3548||legajo==3554||legajo==3575||legajo==3609||legajo==3620||legajo==3724||legajo==3773||legajo==3843||legajo==3861||legajo==3867||legajo==3870||legajo==3896||legajo==3911||legajo==3937||legajo==3955||legajo==3956||legajo==4009||legajo==4099||legajo==6827){
					
					CAT = 3;
					cout<<"Su Categoria es: "<<CAT<<endl;
					jornal = 3038.47;
						cout<<"Su jornal es: "<<JO<<endl;
						if(faltas==0){
						VANT = 812.79;
						cout<<"Su pago por escalafon es: "<<VANT<<endl;					
					}
					else{
					VANT = 812.79-(812.79/(30-faltas));
					cout<<"Su pago por escalafon es: "<<VANT<<endl;					
					}
					}
					else if(legajo == legajo==3476||legajo==3485||legajo==3487||legajo==3488||legajo==3489||legajo==3490||legajo==3501||legajo==3522||legajo==3523||legajo==3524||legajo==3547||legajo==3550||legajo==3558||legajo==3637||legajo==3638||legajo==3640||legajo==3690||legajo==3736||legajo==3766||legajo==3768||legajo==3785||legajo==3792||legajo==3797||legajo==3801||legajo==3805||legajo==3807||legajo==3812||legajo==3843||legajo==3844||legajo==3855||legajo==3859||legajo==3865||legajo==3868||legajo==3879||legajo==3886||legajo==3897||legajo==3898||legajo==3900||legajo==3943||legajo==3954||legajo==3955||legajo==3957||legajo==3959||legajo==3970||legajo==3973||legajo==3985||legajo==3986||legajo==4006||legajo==4051||legajo==4054||legajo==4058||legajo==4070||legajo==4086||legajo==4129||legajo==4146||legajo==4152||legajo==4171||legajo==5327||legajo==5328||legajo==5348||legajo==5349||legajo==5350||legajo==6225){
					
					CAT = 4;
					cout<<"Su Categoria es: "<<CAT<<endl;
					jornal = 3149.73;
						cout<<"Su jornal es: "<<JO<<endl;
						if(faltas==0){
						VANT = 944.92;
						cout<<"Su pago por escalafon es: "<<VANT<<endl;					
					}
					else{
					VANT = 944.92-(944.92/(30-faltas));
					cout<<"Su pago por escalafon es: "<<VANT<<endl;
					}
					}
					if(legajo == 3459||legajo==3470||legajo==3477||legajo==3494||legajo==3512||legajo==3516||legajo==3552||legajo==3557||legajo==3584||legajo==3608||legajo==3616||legajo==3636||legajo==3681||legajo==3684||legajo==3724||legajo==3754||legajo==3774||legajo==3782||legajo==3799||legajo==3852||legajo==3857||legajo==3863||legajo==3876||legajo==3883||legajo==3887||legajo==3892||legajo==3915||legajo==3964||legajo==3965||legajo==3977||legajo==4040||legajo==4047||legajo==4073||legajo==4077||legajo==4099||legajo==4132||legajo==4137||legajo==5321){
					
					CAT = 5;
					cout<<"Su Categoria es: "<<CAT<<endl;
					jornal = 3218.21;
						cout<<"Su jornal es: "<<JO<<endl;
						if(faltas==0){
					VANT = 965.46;
					cout<<"Su pago por escalafon es: "<<VANT<<endl;
					}
					else{
					VANT = 965.46-(965.46/(30-faltas));
					cout<<"Su pago por escalafon es: "<<VANT<<endl;
					}
					}
					else if(legajo == 3508||legajo==3509||legajo==3537||legajo==3556||legajo==3567||legajo==3571||legajo==3573||legajo==3577||legajo==3593||legajo==3599||legajo==3610||legajo==3630||legajo==3671||legajo==3710||legajo==3729||legajo==3731||legajo==3739||legajo==3771||legajo==3773||legajo==3775||legajo==3784||legajo==3798||legajo==3800||legajo==3809||legajo==3819||legajo==3822||legajo==3858||legajo==3862||legajo==3864||legajo==3870||legajo==3882||legajo==3884||legajo==3893||legajo==3909||legajo==3910||legajo==3911||legajo==3917||legajo==3923||legajo==3938||legajo==3969||legajo==3984||legajo==3995||legajo==4002||legajo==4007||legajo==4027||legajo==4028||legajo==4041||legajo==4043||legajo==4046||legajo==4083||legajo==41){
					
					CAT = 6;
					cout<<"Su Categoria es: "<<CAT<<endl;
					jornal = 3332.33;
						cout<<"Su jornal es: "<<JO<<endl;
						if((CAT==6)&&(faltas==0)){
						VANT = 999.70;
						cout<<"Su pago por escalafon es: "<<VANT<<endl;
					}
					else{
					VANT = 999.70-(999.70/(30-faltas));
					cout<<"Su pago por escalafon es: "<<VANT<<endl;
					}
					}
					if(legajo == 3467||legajo==3539||legajo==4589||legajo==3611||legajo==3618||legajo==3629||legajo==3694||legajo==3772||legajo==3795||legajo==3823||legajo==3845||legajo==3856||legajo==6848||legajo==6862){
					
					CAT = 7;
					cout<<"Su Categoria es: "<<CAT<<endl;
					jornal = 3474.98;
						cout<<"Su jornal es: "<<JO<<endl;
							if(faltas==0){
					VANT = 1042.49;
					cout<<"Su pago por escalafon es: "<<VANT<<endl;
					}
					else{
					VANT = 1042.49-(1042.49/(30-faltas));
					cout<<"Su pago por escalafon es: "<<VANT<<endl;
					}
					}
					else if(legajo == 3699||legajo==3760||legajo==3780||legajo==3916||legajo==3936||legajo==4025||legajo==7907||legajo==7909){
					
					CAT = 8;
					cout<<"Su Categoria es: "<<CAT<<endl;
					jornal = 3571.98;
						cout<<"Su jornal es: "<<JO<<endl;
                                                                                                        if(faltas==0){
						VANT = 1071.59;
						cout<<"Su pago por escalafon es: "<<VANT<<endl;
					}
					else{
					VANT = 1071.59-(1071.59/(30-faltas));
					cout<<"Su pago por escalafon es: "<<VANT<<endl;
					}
					}
					cout<<"Si ud Cobra Titulo Digite el Numero 1 de lo contrario digite 0: ";
						cin>>T;
						if(T == 1){
							TIT = 5925.280;
							cout<<"Su adicional por el tiulo es: "<<TIT<<endl;
						}
					VH = jornal/8;//Valor de la Hora
					cout<<"\nEl valor de la hora es: "<<VH<<endl;
					cout<<"Ingrese sus dias trabajados: ";//dias trabajados
					cin>>JT;
					TB = JT*jornal;//Remuneracion por el total de dias Trabajados
					cout<<"\nEl total bruto de la quincena es: "<<TB<<endl;
					cout<<"Digite los dias feriados: ";
					cin>>FE;
					FERIADO = FE * jornal;
					cout<<"\nEl Total a cobrar por dias feriados es : "<<FERIADO<<endl;
					cout<<"Ingrese el total de horas extras simples: ";
					cin>>HES;
					HEST = (VH*1.5)*HES;//Remuneracion por horas extras al 50% 
					cout<<"\nEl total a cobrar de horas extras simples es: "<<HEST<<endl;
					cout<<"Ingrese el total de horas extras al cien: ";
					cin>>HEC;
					HECT = (VH*2)*HEC;//Remuneracion por horas extras al 100%
					cout<<"Digite sus años de escalafon: ";
					cin>>ANT;
					ANTT = ANT*VANT;
					cout<<"El total a cobrar por su antigüedad es: "<<ANTT<<endl;
					cout<<"\nEl total a cobrar de horas extras al cien es: "<<HECT<<endl;
					cout<<"\nIngrese los dias trabajados en la primera quincena: ";
					cin>>PQ;
						TPQ = PQ*jornal;
						cout<<"El Total ganado en la primera quincena es: "<<TPQ<<endl;
						if(faltas == 0){
							PRE = (25*jornal+ANTT)*0.15;
							cout<<"\nEl Total ganado por presentismo es: "<<PRE<<endl;	
						}
						else if(faltas == 1){
							PRE = (((25*jornal+ANTT)*0.15)/2);
							cout<<"\nEl Total ganado por presentismo es: "<<PRE<<endl;
						}
						DES = (TB+FERIADO+ANTT+PRE+HEST+HECT)*0.18;
						cout<<"\nEl total de descuento es: "<<DES<<endl;
						SUELDO_BRUTO = TB+FERIADO+ANTT+PRE+HEST+HECT;
						cout<<"\nEl total de su sueldo bruto es: "<<SUELDO_BRUTO<<endl;
						TDES = SUELDO_BRUTO-DES;
						cout<<"\nEl sueldo total con descuento es: "<<TDES<<endl;
						MES = JT+PQ;
						cout<<"\nSus dias trabajados en el mes son: "<<MES<<endl;
							if(CAT==1){
							GNR = 1461.88*MES;
							cout<<"\nSu gratificacion no remunerativa es: "<<GNR<<endl;
						}
						else if(CAT==2){
							GNR = 1529.11*MES;
							cout<<"\nSu gratificacion no remunerativa es: "<<GNR<<endl;
						}
						if(CAT==3){
							GNR = 1556.47*MES;
							cout<<"\nSu gratificacion no remunerativa es: "<<GNR<<endl;
						}
						else if(CAT==4){
							GNR = 1613.9*25*MES;
							cout<<"\nSu gratificacion no remunerativa es: "<<GNR<<endl;
						}		
						if(CAT==5){
							GNR =  1648.99*MES;
							cout<<"\nSu gratificacion no remunerativa es: "<<GNR<<endl;
						}
						else if(CAT==6){
							GNR = 1707.47*MES;
							cout<<"\nSu gratificacion no remunerativa es: "<<GNR<<endl;
						}
						if(CAT==7){
							GNR = 1780.56*MES;
							cout<<"\nSu gratificacion no remunerativa es: "<<GNR<<endl;
						}
						else if(CAT==8){
							GNR = 1830.26*MES;
							cout<<"\nSu gratificacion no remunerativa es: "<<GNR<<endl;
						}
						SUELDO_TOTAL = TDES+GNR;
						cout<<"\nEl sueldo total de la segunda quincena es: "<<SUELDO_TOTAL<<endl;
						cout<<"Sueldo Total del mes: "<<""""""<<(SUELDO_TOTAL+(TPQ-(TPQ*0.18)))<<""""""<<endl;
 */
