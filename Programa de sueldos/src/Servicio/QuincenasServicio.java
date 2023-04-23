package Servicio;

import java.util.Scanner;
import programa.de.sueldos.Quincena2;

public class QuincenasServicio {

    Scanner leer = new Scanner(System.in);

    public Quincena2 valorPorCategoria() {
        int[][] matriz = {{3605, 3686, 3687, 3759, 3854, 3871, 3912, 4013, 4018, 4033, 4038, 4063, 4094, 4096, 4101, 4104, 4106, 4114, 4116, 4125, 4126, 4128, 4231, 4140, 4141, 4142, 4143, 4145, 4149, 4150, 4156, 4157, 4158, 4177, 5910, 6222, 6224, 6834, 6838, 7318, 7319, 629},
        {3018, 3465, 3472, 3604, 3635, 3713, 3716, 3717, 3763, 3767, 3824, 3872, 3873, 3874, 3895, 3901, 3913, 3914, 3932, 3942, 3968, 4000, 4016, 4023, 4044, 4061, 4069, 4102, 4111, 4112, 4122, 4124, 4130, 4133, 4136, 4138, 4139, 4147, 4151, 7610, 0513},
        {3478, 3548, 3554, 3575, 3609, 3620, 3861, 3896, 3937, 3967, 4009, 4021, 4052, 4059},
        {3476, 3485, 3487, 3488, 3489, 3490, 3501, 3522, 3523, 3524, 3547, 3550, 3558, 3637, 3638, 3640, 3690, 3736, 3766, 3768, 3785, 3792, 3797, 3801, 3805, 3807, 3812, 3843, 3844, 3855, 3859, 3865, 3868, 3879, 3886, 3897, 3898, 3900, 3943, 3954, 3955, 3957, 3959, 3970, 3973, 3985, 3986, 4006, 4051, 4054, 4058, 4070, 4086, 4129, 4146, 4152, 4171, 5327, 5328, 5348, 5349, 5350, 6225},
        {3459, 3470, 3477, 3494, 3512, 3516, 3552, 3557, 3584, 3608, 3616, 3636, 3681, 3684, 3724, 3754, 3774, 3782, 3799, 3852, 3857, 3863, 3876, 3883, 3887, 3892, 3915, 3964, 3965, 3977, 4040, 4047, 4073, 4077, 4099, 4132, 4137, 5321},
        {3508, 3509, 3537, 3556, 3567, 3571, 3573, 3577, 3593, 3599, 3610, 3630, 3671, 3710, 3729, 3731, 3739, 3771, 3773, 3775, 3784, 3798, 3800, 3809, 3819, 3822, 3858, 3862, 3864, 3870, 3882, 3884, 3893, 3909, 3910, 3911, 3917, 3923, 3938, 3969, 3984, 3995, 4002, 4007, 4027, 4028, 4041, 4043, 4046, 4083, 41},
        {3467, 3539, 4589, 3611, 3618, 3629, 3694, 3772, 3795, 3823, 3845, 3856, 6848, 6862},
        {3699, 3760, 3780, 3916, 3936, 4025, 7907, 7909}};
        System.out.println("Ingrese su numero de legajo");
        int legajoBuscado = leer.nextInt();
        int cat = 0;
        double jornal;
        int faltas = 0;
        double vant;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == legajoBuscado) {
                    cat = i + 1;
                    break;
                }
            }
        }
        switch (cat) {
            case 1:
                cat = 1;
                jornal = 2853.02;
                System.out.println(jornal);
                if (faltas == 0) {
                    vant = 855.91;
                } else {
                    vant = 855.91 - (855.91 / (30 - faltas));
                }
                break;
            case 2:
                cat = 2;
                jornal = 2984.26;
                System.out.println(jornal);
                if (faltas == 0) {
                    vant = 820.67;
                } else {
                    vant = 820.67 - (820.67 / (30 - faltas));
                }
                break;
            case 3:
                cat = 3;
                jornal = 3038.47;
                System.out.println(jornal);
                if (faltas == 0) {
                    vant = 812.79;
                } else {
                    vant = 812.79 - (812.79 / (30 - faltas));
                }
                break;
            case 4:
                cat = 4;
                jornal = 3149.73;
                System.out.println(jornal);
                if (faltas == 0) {
                    vant = 944.92;
                } else {
                    vant = 944.92 - (944.92 / (30 - faltas));
                }
                break;
            case 5:
                cat = 5;
                jornal = 3218.21;
                System.out.println(jornal);
                if (faltas == 0) {
                    vant = 965.46;
                } else {
                    vant = 965.46 - (965.46 / (30 - faltas));
                }
                break;
            case 6:
                cat = 6;
                jornal = 3332.33;
                System.out.println(jornal);
                if (faltas == 0) {
                    vant = 999.70;
                } else {
                    vant = 999.70 - (999.70 / (30 - faltas));
                }
                break;
            case 7:
                cat = 7;
                jornal = 3474.98;
                System.out.println(jornal);
                if (faltas == 0) {
                    vant = 1042.49;
                } else {
                    vant = 1042.49 - (1042.49 / (30 - faltas));
                }
                break;
            case 8:
                cat = 8;
                jornal = 3571.98;
                if (faltas == 0) {
                    vant = 1071.59;
                    System.out.println(jornal);
                } else {
                    vant = 1071.59 - (1071.59 / (30 - faltas));
                }
                break;

        }

        return new Quincena2();
    }
}
