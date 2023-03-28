package programa.de.sueldos;

import java.util.Scanner;

public class Quincena1 {

    public int sind;
    public int os;
    public double jornal;
    public int legajo;
    public int cat;
    public double valorHora;
    public int jornalTrabajado;
    public double totalBruto;
    public int diasFer;
    public double totalFeriado;
    public int horaExSim;
    public double totalHoraSim;
    public int horaExCien;
    public double totalHoraExCien;
    public int antiguedad;
    public double descuento;
    public double sueldoBruto;
    public double totalDescuento;

    public Quincena1() {
    }

    public Quincena1(int sind, int os, double jornal, int legajo, int cat, double valorHora, int jornalTrabajado, double totalBruto, int diasFer, double totalFeriado, int horaExSim, double totalHoraSim, int horaExCien, double totalHoraExCien, int antiguedad, double descuento, double sueldoBruto, double totalDescuento) {
        this.sind = sind;
        this.os = os;
        this.jornal = jornal;
        this.legajo = legajo;
        this.cat = cat;
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
        this.descuento = descuento;
        this.sueldoBruto = sueldoBruto;
        this.totalDescuento = totalDescuento;
    }

    public int getSind() {
        return sind;
    }

    public int getOs() {
        return os;
    }

    public double getJornal() {
        return jornal;
    }

    public int getLegajo() {
        return legajo;
    }

    public int getCat() {
        return cat;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getJornalTrabajado() {
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

    public int getHoraExSim() {
        return horaExSim;
    }

    public double getTotalHoraSim() {
        return totalHoraSim;
    }

    public int getHoraExCien() {
        return horaExCien;
    }

    public double getTotalHoraExCien() {
        return totalHoraExCien;
    }

    public int getAntiguedad() {
        return antiguedad;
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

    public void setSind(int sind) {
        this.sind = sind;
    }

    public void setOs(int os) {
        this.os = os;
    }

    public void setJornal(double jornal) {
        this.jornal = jornal;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setJornalTrabajado(int jornalTrabajado) {
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

    public void setHoraExSim(int horaExSim) {
        this.horaExSim = horaExSim;
    }

    public void setTotalHoraSim(double totalHoraSim) {
        this.totalHoraSim = totalHoraSim;
    }

    public void setHoraExCien(int horaExCien) {
        this.horaExCien = horaExCien;
    }

    public void setTotalHoraExCien(double totalHoraExCien) {
        this.totalHoraExCien = totalHoraExCien;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
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

    Scanner leer = new Scanner(System.in);

    public double numeroLegajo() {
        System.out.println("Digite su numero de legajo: ");
        legajo = leer.nextInt();
        if (legajo == 3605 || legajo == 3686 || legajo == 3687 || legajo == 3759 || legajo == 3854 || legajo == 3871 || legajo == 3912 || legajo == 4013 || legajo == 4018 || legajo == 4033 || legajo == 4038 || legajo == 4063 || legajo == 4094 || legajo == 4096 || legajo == 4101 || legajo == 4104 || legajo == 4106 || legajo == 4114 || legajo == 4116 || legajo == 4125 || legajo == 4126 || legajo == 4128 || legajo == 4231 || legajo == 4140 || legajo == 4141 || legajo == 4142 || legajo == 4143 || legajo == 4145 || legajo == 4149 || legajo == 4150 || legajo == 4156 || legajo == 4157 || legajo == 4158 || legajo == 4177 || legajo == 5910 || legajo == 6222 || legajo == 6224 || legajo == 6834 || legajo == 6838 || legajo == 7318 || legajo == 7319 || legajo == 629) {

            cat = 1;
            jornal = 2853.02;
            System.out.println(jornal);
        } else if (legajo == 3018 || legajo == 3465 || legajo == 3472 || legajo == 3604 || legajo == 3635 || legajo == 3713 || legajo == 3716 || legajo == 3717 || legajo == 3763 || legajo == 3767 || legajo == 3824 || legajo == 3872 || legajo == 3873 || legajo == 3874 || legajo == 3895 || legajo == 3901 || legajo == 3913 || legajo == 3914 || legajo == 3932 || legajo == 3942 || legajo == 3968 || legajo == 4000 || legajo == 4016 || legajo == 4023 || legajo == 4044 || legajo == 4061 || legajo == 4069 || legajo == 4102 || legajo == 4111 || legajo == 4112 || legajo == 4122 || legajo == 4124 || legajo == 4130 || legajo == 4133 || legajo == 4136 || legajo == 4138 || legajo == 4139 || legajo == 4147 || legajo == 4151 || legajo == 7610 || legajo == 0513) {

            cat = 2;
            jornal = 2984.26;
            System.out.println(jornal);
        }
        if (legajo == 3478 || legajo == 3548 || legajo == 3554 || legajo == 3575 || legajo == 3609 || legajo == 3620 || legajo == 3861 || legajo == 3896 || legajo == 3937 || legajo == 3967 || legajo == 4009 || legajo == 4021 || legajo == 4052 || legajo == 4059) {

            cat = 3;
            jornal = 3038.47;
            System.out.println(jornal);
        } else if (legajo == 3476 || legajo == 3485 || legajo == 3487 || legajo == 3488 || legajo == 3489 || legajo == 3490 || legajo == 3501 || legajo == 3522 || legajo == 3523 || legajo == 3524 || legajo == 3547 || legajo == 3550 || legajo == 3558 || legajo == 3637 || legajo == 3638 || legajo == 3640 || legajo == 3690 || legajo == 3736 || legajo == 3766 || legajo == 3768 || legajo == 3785 || legajo == 3792 || legajo == 3797 || legajo == 3801 || legajo == 3805 || legajo == 3807 || legajo == 3812 || legajo == 3843 || legajo == 3844 || legajo == 3855 || legajo == 3859 || legajo == 3865 || legajo == 3868 || legajo == 3879 || legajo == 3886 || legajo == 3897 || legajo == 3898 || legajo == 3900 || legajo == 3943 || legajo == 3954 || legajo == 3955 || legajo == 3957 || legajo == 3959 || legajo == 3970 || legajo == 3973 || legajo == 3985 || legajo == 3986 || legajo == 4006 || legajo == 4051 || legajo == 4054 || legajo == 4058 || legajo == 4070 || legajo == 4086 || legajo == 4129 || legajo == 4146 || legajo == 4152 || legajo == 4171 || legajo == 5327 || legajo == 5328 || legajo == 5348 || legajo == 5349 || legajo == 5350 || legajo == 6225) {

            cat = 4;
            jornal = 3149.73;
            System.out.println(jornal);
        }
        if (legajo == 3459 || legajo == 3470 || legajo == 3477 || legajo == 3494 || legajo == 3512 || legajo == 3516 || legajo == 3552 || legajo == 3557 || legajo == 3584 || legajo == 3608 || legajo == 3616 || legajo == 3636 || legajo == 3681 || legajo == 3684 || legajo == 3724 || legajo == 3754 || legajo == 3774 || legajo == 3782 || legajo == 3799 || legajo == 3852 || legajo == 3857 || legajo == 3863 || legajo == 3876 || legajo == 3883 || legajo == 3887 || legajo == 3892 || legajo == 3915 || legajo == 3964 || legajo == 3965 || legajo == 3977 || legajo == 4040 || legajo == 4047 || legajo == 4073 || legajo == 4077 || legajo == 4099 || legajo == 4132 || legajo == 4137 || legajo == 5321) {

            cat = 5;
            jornal = 3218.21;
            System.out.println(jornal);
        } else if (legajo == 3508 || legajo == 3509 || legajo == 3537 || legajo == 3556 || legajo == 3567 || legajo == 3571 || legajo == 3573 || legajo == 3577 || legajo == 3593 || legajo == 3599 || legajo == 3610 || legajo == 3630 || legajo == 3671 || legajo == 3710 || legajo == 3729 || legajo == 3731 || legajo == 3739 || legajo == 3771 || legajo == 3773 || legajo == 3775 || legajo == 3784 || legajo == 3798 || legajo == 3800 || legajo == 3809 || legajo == 3819 || legajo == 3822 || legajo == 3858 || legajo == 3862 || legajo == 3864 || legajo == 3870 || legajo == 3882 || legajo == 3884 || legajo == 3893 || legajo == 3909 || legajo == 3910 || legajo == 3911 || legajo == 3917 || legajo == 3923 || legajo == 3938 || legajo == 3969 || legajo == 3984 || legajo == 3995 || legajo == 4002 || legajo == 4007 || legajo == 4027 || legajo == 4028 || legajo == 4041 || legajo == 4043 || legajo == 4046 || legajo == 4083 || legajo == 41) {

            cat = 6;
            jornal = 3332.33;
            System.out.println(jornal);
        }
        if (legajo == 3467 || legajo == 3539 || legajo == 4589 || legajo == 3611 || legajo == 3618 || legajo == 3629 || legajo == 3694 || legajo == 3772 || legajo == 3795 || legajo == 3823 || legajo == 3845 || legajo == 3856 || legajo == 6848 || legajo == 6862) {

            cat = 7;
            jornal = 3474.98;
            System.out.println(jornal);
        } else if (legajo == 3699 || legajo == 3760 || legajo == 3780 || legajo == 3916 || legajo == 3936 || legajo == 4025 || legajo == 7907 || legajo == 7909) {

            cat = 8;
            jornal = 3571.98;
            System.out.println(jornal);
        }
        return jornal;
    }

    public double totalBasico() {

        double res = numeroLegajo();

        valorHora = res / 8;//Valor de la Hora        

        System.out.println("Ingrese sus dias trabajados: ");//dias trabajados
        jornalTrabajado = leer.nextInt();
        totalBruto = jornalTrabajado * res;//Remuneracion por el total de dias Trabajados

        System.out.println("Digite los dias feriados: ");//dias Feriados
        diasFer = leer.nextInt();
        totalFeriado = diasFer * res;

        System.out.println("Ingrese el total de horas extras simples: ");//dias Feriados
        horaExSim = leer.nextInt();
        totalHoraSim = (valorHora * 1.5) * horaExSim;//Remuneracion por horas extras al 50%

        System.out.println("Ingrese el total de horas extras al cien: ");//dias Feriados
        horaExCien = leer.nextInt();
        totalHoraExCien = (valorHora * 2) * horaExCien;//Remuneracion por horas extras al 100%

        System.out.println("Digite sus años de escalafon: ");//dias Feriados
        antiguedad = leer.nextInt();

        sueldoBruto = totalBruto + totalFeriado + totalHoraSim + totalHoraExCien;//Bruto total
        System.out.println("Sueldo Bruto: " + sueldoBruto);

        descuento = (totalBruto + totalFeriado + totalHoraSim + totalHoraExCien) * 0.18;//Descuentos
        System.out.println("Descuentos: " + descuento);

        totalDescuento = sueldoBruto - descuento;//Sueldo con descuento

        return totalDescuento;

    }

}

/*
valorHora = JO/8;//Valor de la Hora
					
					
					totalBruto = jornalTrabajado*JO;//Remuneracion por el total de dias Trabajados
					
					totalFeriado = diasFer * JO;
					cout<<"\nEl Total a cobrar por dias feriados es : "<<FERIADO<<endl;
					
					totalHoraSim = (valorHora*1.5)*horaExSim;//Remuneracion por horas extras al 50% 
					;
					totalHoraExCien = (valorHora*2)*horaExCien;//Remuneracion por horas extras al 100%
					
					descuento = (totalBruto+totalFeriado+totalHoraSim+totalHoraExCien)*0.18;
					cout<<"\nEl total de descuento es: "<<DES<<endl;
					sueldoBruto = totalBruto+totalFeriado+totalHoraSim+totalHoraExCien;
					cout<<"\nEl total de su sueldo bruto es: "<<SUELDO_BRUTO<<endl;
					totalDescuento = sueldoBruto-descuento;
					cout<<"\nEl sueldo total con descuento es: "<<TDES<<endl;
					cout<<"\n";
					system("pause");
					break;
 */
