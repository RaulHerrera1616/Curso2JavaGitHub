
package programa.de.sueldos;

import java.util.Scanner;


public class ProgramaDeSueldos {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        do {   
            System.out.println("------------------------------");
            System.out.println("**********MENU**********");
            System.out.println("------------------------------");
            System.out.println("1. Primera Quincena 2022");
            System.out.println("2. Segunda Quincena 2022");
            System.out.println("3. Mensual 2022");
            System.out.println("4. SAC");
            System.out.println("5. Mostrando Boleta Quincena");
            System.out.println("6. Mostrando Boleta Mensual");
            System.out.println("7. Mostrando Boleta de SAC");
            System.out.println("8. Salir");
            System.out.println("Opción");
            opc = leer.nextInt();
           
            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                    
                  
            }
            
        } while (opc != 8);
    }
    public static void Mostrarlegajos(){
        
    }
    
}
/*
cout<<"Digite su numero de legajo: ";cin>>legajo;
					if(legajo==3605||legajo==3686||legajo==3687||legajo==3759||legajo==3854||legajo==3871||legajo==3912||legajo==4013||legajo==4018||legajo==4033||legajo==4038||legajo==4063||legajo==4094||legajo==4096||legajo==4101||legajo==4104||legajo==4106||legajo==4114||legajo==4116||legajo==4125||legajo==4126||legajo==4128||legajo==4231||legajo==4140||legajo==4141||legajo==4142||legajo==4143||legajo==4145||legajo==4149||legajo==4150||legajo==4156||legajo==4157||legajo==4158||legajo==4177||legajo==5910||legajo==6222||legajo==6224||legajo==6834||legajo==6838||legajo==7318||legajo==7319||legajo==629){
					if(legajo==3605){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GUARDIA HECTOR RENE..."<<endl;
					}
					else if(legajo==3686){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...VERGARA PATRICIO ADRIAN..."<<endl;
					}
					if(legajo==3687){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MONTEROS NICOLAS OSCAR ANTONIO..."<<endl;
					}
					else if(legajo==3759){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GIMENEZ, JOSE ANTONIO..."<<endl;
					}
					if(legajo==3854){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PINILLA CARLOS RAFAEL..."<<endl;
					}
					else if(legajo==3871){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RUIZ ENRIQUE MARCELO..."<<endl;
					}
					if(legajo==3912){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BARROS JESUS ANTONIO..."<<endl;
					}
					else if(legajo==4013){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PALACIO LEANDRO EMANUEL..."<<endl;
					}
					if(legajo==4018){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...FLORES LUIS EDUARDO..."<<endl;
					}
					else if(legajo==4033){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ZURITA DANIEL ALBERTO..."<<endl;
					}
					if(legajo==4038){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BORDON JOSE CRUZ..."<<endl;
					}
					else if(legajo==4063){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PALACIO NELSON JAVIER..."<<endl;
					}
					if(legajo==4094){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ROMERO EDGARDO ARNALDO..."<<endl;
					}
					else if(legajo==4096){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...AYALA JULIO FRANCISCO..."<<endl;
					}
					if(legajo==4101){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...QUIROGA ADAN VICTOR..."<<endl;
					}
					else if(legajo==4104){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA NESTOR ENRIQUE..."<<endl;
					}
					if(legajo==4106){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, MARTIN EMILIANO..."<<endl;
					}
					else if(legajo==4114){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GONZALEZ, SAMUEL DARIO ALBERTO..."<<endl;
					}
					if(legajo==4116){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CORBALAN, OSCAR EDUARDO..."<<endl;
					}
					else if(legajo==4125){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...COSTA YAÑEZ, FRANCO SEBASTIAN..."<<endl;
					}
					if(legajo==4126){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RODRIGUEZ, CESAR AUGUSTO..."<<endl;
					}
					else if(legajo==4128){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PINILLA, FRANCISCO NAZARENO..."<<endl;
					}
					if(legajo==4131){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...FLORES MARTIN LUIS FROILAN..."<<endl;
					}
					else if(legajo==4140){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MORENO, JOSE EVARISTO..."<<endl;
					}
					if(legajo==4141){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RODRIGUEZ, PABLO JEREMIAS..."<<endl;
					}
					else if(legajo==4142){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SANCHEZ, ARIEL ESTEBAN..."<<endl;
					}
					if(legajo==4143){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...FARIAS, JONATHAN EMANUEL..."<<endl;
					}
					else if(legajo==4145){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, JOSE ROBERTO..."<<endl;
					}
					if(legajo==4149){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ARANDA, FRANCISCO JAVIER..."<<endl;
					}
					else if(legajo==4150){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PERALTA RODRIG FRANCO ANTONIO..."<<endl;
					}
					if(legajo==4156){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RAMIREZ, WALTER OSMAR..."<<endl;
					}
					else if(legajo==4157){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARABAJAL, MIGUEL ANGEL..."<<endl;
					}
					if(legajo==4158){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ZURITA, JUAN PEDRO..."<<endl;
					}
					else if(legajo==4177){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...TEJERINA, BRAHIAN RAMON..."<<endl;
					}
					if(legajo==5910){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CASIVA, VICTOR NICOLAS..."<<endl;
					}
					else if(legajo==6222){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARABAJAL, JOSE FRANCISCO..."<<endl;
					}
					if(legajo==6224){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ROMERO, JOSE VALENTIN..."<<endl;
					}
					else if(legajo==6834){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MUÑOZ, PABLO VICENTE..."<<endl;
					}
					if(legajo==6838){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PEREYRA, SEGUNDO RICARDO..."<<endl;
					}
					else if(legajo==7318){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CAMPOS, JUAN PEDRO..."<<endl;
					}
					if(legajo==7319){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CAMPOS, RAMON ANTONIO..."<<endl;
					}
					else if(legajo==629){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MEDINA, OSCAR EDUARDO..."<<endl;
					}					
					CAT = 1;
					cout<<"Su Categoria es: "<<CAT<<endl;
					JO = 2853.02;
					cout<<"Su jornal es: "<<JO<<endl;
					}
					else if(legajo == 3018||legajo==3465||legajo==3472||legajo==3604||legajo==3635||legajo==3713||legajo==3716||legajo==3717||legajo==3763||legajo==3767||legajo==3824||legajo==3872||legajo==3873||legajo==3874||legajo==3895||legajo==3901||legajo==3913||legajo==3914||legajo==3932||legajo==3942||legajo==3968||legajo==4000||legajo==4016||legajo==4023||legajo==4044||legajo==4061||legajo==4069||legajo==4102||legajo==4111||legajo==4112||legajo==4122||legajo==4124||legajo==4130||legajo==4133||legajo==4136||legajo==4138||legajo==4139||legajo==4147||legajo==4151||legajo==7610||legajo==0513){
					if (legajo==3018){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CORIA, JOSE ALFREDO..."<<endl;
					}				
					else if (legajo==3465){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...AMADOR, EDUARDO ENRIQUE..."<<endl;
					}
					if (legajo==3472){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, ANDRES ERNESTO..."<<endl;
					}				
					else if (legajo==3604){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LESCANO, ALBERTO ENRIQUE..."<<endl;
					}				
					if (legajo==3635){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, JUAN ANTONIO..."<<endl;
					}			
					else if (legajo==3713){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...QUIROGA, LORETO ANTONIO..."<<endl;
					}			
					if (legajo==3716){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PINILLA, JUAN FRANCISCO..."<<endl;
					}				
					else if (legajo==3717){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MOLINA, SILVIO CESAR..."<<endl;
					}				
					if (legajo==3763){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CASIVA, JUAN MARCELO..."<<endl;
					}
					else if (legajo==3767){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MORALES, CONRADO SEBASTIAN..."<<endl;
					}				
					if (legajo==3824){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CRUZ, MARIO GABRIEL..."<<endl;
					}		
					else if (legajo==3872){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARRIZO, ROQUE PATRICIO..."<<endl;
					}					
					if (legajo==3873){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PALACIO, LUCAS EDUARDO..."<<endl;
					}
					else if (legajo==3874){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ALBORNOZ, FRANCO ANDRES..."<<endl;
					}
					if (legajo==3895){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RACHID, RUBEN EDUARDO..."<<endl;
					}
					else if (legajo==3901){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ALARCON, RAMON GERARDO..."<<endl;
					}
					if (legajo==3913){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...AVILA, EDUARDO MARCELO..."<<endl;
					}
					else if (legajo==3914){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MARQUES SIMOES, GABRIEL OMAR..."<<endl;
					}
					if (legajo==3932){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...HERRERA, MARCELO ARIEL..."<<endl;
					}
					else if (legajo==3942){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GRANEROS, RAUL DARIO..."<<endl;
					}
					if (legajo==3968){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SANCHEZ, ROBERTO ADRIAN..."<<endl;
					}
					else if (legajo==4000){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...FARIAS, MAXIMILIANO PEDRO..."<<endl;
					}
					if (legajo==4016){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, NESTOR FABIAN..."<<endl;
					}
					else if (legajo==4023){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...COSTAS, RAMON ADRIAN..."<<endl;
					}
					if (legajo==4044){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BAZAN, GERMAN EXEQUIEL..."<<endl;
					}
					else if (legajo==4061){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SANCHEZ, OSCAR MARTIN..."<<endl;
					}
					if (legajo==4069){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MORALES, CARLOS JAVIER..."<<endl;
					}
					else if (legajo==4102){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CAMPOS, FABIAN PEDRO AGUSTIN..."<<endl;
					}
					if (legajo==4111){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...OVEJERO, CARLOS SEGUNDO..."<<endl;
					}
					else if (legajo==4112){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GALLEGOS LOPEZ, ROMULO RICARDO..."<<endl;
					}
					if (legajo==4122){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PINILLA, MARIANO FRANCISCO..."<<endl;
					}
					else if (legajo==4124){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LESCANO, GONZALO DAVID..."<<endl;
					}
					if (legajo==4130){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...OLIVERA, RUBEN ALEJANDRO..."<<endl;
					}
					else if (legajo==4133){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MORENO, PABLO ALEJANDRO..."<<endl;
					}
					if (legajo==4136){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RUIZ, IVAN CARLOS ANTONIO..."<<endl;
					}
					else if (legajo==4138){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CASIVA, GERARDO MARTIN..."<<endl;
					}
					if (legajo==4139){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ACOSTA, SILENIO..."<<endl;
					}
					else if (legajo==4147){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SALAS, BRAHIAN ALVARO DAVID..."<<endl;
					}
					if (legajo==4151){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CORDOBA, MAXIMILIANO EXEQUIEL..."<<endl;
					}
					else if (legajo==7610){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CAMPOS, OSCAR ANTONIO..."<<endl;
					}
					if (legajo==0513){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PEREYRA, LUIS ANTONIO..."<<endl;
					}
					CAT = 2;
					cout<<"Su Categoria es: "<<CAT<<endl;
					JO = 2984.26;
					cout<<"Su jornal es: "<<JO<<endl;
					}
					if(legajo == 3478||legajo==3548||legajo==3554||legajo==3575||legajo==3609||legajo==3620||legajo==3861||legajo==3896||legajo==3937||legajo==3967||legajo==4009||legajo==4021||legajo==4052||legajo==4059){
					if (legajo==3478){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MONTEROS, ANTONIO OSCAR..."<<endl;
					}				
					else if (legajo==3548){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, JOSE MANUEL..."<<endl;
					}
					if (legajo==3554){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PIGUALA, JULIO CESAR..."<<endl;
					}				
					else if (legajo==3575){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PACHECO, MANUEL ALBERTO..."<<endl;
					}
					if (legajo==3609){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MORAN, BELISARIO ANTONIO..."<<endl;
					}				
					else if (legajo==3620){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LAZARTE, EFRAIN WALTER..."<<endl;
					}
					if (legajo==3861){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARRIZO, WALTER DANIEL..."<<endl;
					}				
					else if (legajo==3896){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, JUAN JOSE..."<<endl;
					}
					if (legajo==393234){
						SIND = 2;
						OS = 2;
						SIND = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...HERRERA, JOSE RAUL..."<<endl;
					}				
					else if (legajo==3937){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GOMEZ, MIGUEL ALFREDO..."<<endl;
					}
					if (legajo==3967){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...FLORES, JUAN CARLOS..."<<endl;
					}				
					else if (legajo==4009){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LEGUIZAMON, PABLO GASTON..."<<endl;
					}
					if (legajo==4021){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PEREYRA, CLAUDIO JOSE RICARDO..."<<endl;
					}				
					else if (legajo==4052){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ZELARAYAN, JORGE LUIS MATIAS..."<<endl;
					}
					if (legajo==4059){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ARROYO, GERARDO DAVID..."<<endl;
					}
					CAT = 3;
					cout<<"Su Categoria es: "<<CAT<<endl;
					JO = 3038.47;
					cout<<"Su jornal es: "<<JO<<endl;
					}
					else if(legajo == legajo==3476||legajo==3485||legajo==3487||legajo==3488||legajo==3489||legajo==3490||legajo==3501||legajo==3522||legajo==3523||legajo==3524||legajo==3547||legajo==3550||legajo==3558||legajo==3637||legajo==3638||legajo==3640||legajo==3690||legajo==3736||legajo==3766||legajo==3768||legajo==3785||legajo==3792||legajo==3797||legajo==3801||legajo==3805||legajo==3807||legajo==3812||legajo==3843||legajo==3844||legajo==3855||legajo==3859||legajo==3865||legajo==3868||legajo==3879||legajo==3886||legajo==3897||legajo==3898||legajo==3900||legajo==3943||legajo==3954||legajo==3955||legajo==3957||legajo==3959||legajo==3970||legajo==3973||legajo==3985||legajo==3986||legajo==4006||legajo==4051||legajo==4054||legajo==4058||legajo==4070||legajo==4086||legajo==4129||legajo==4146||legajo==4152||legajo==4171||legajo==5327||legajo==5328||legajo==5348||legajo==5349||legajo==5350||legajo==6225){
					if (legajo==3476){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, JESUS ALBERTO..."<<endl;
					}				
					else if (legajo==3485){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MOLINA, OSVALDO ORLANDO..."<<endl;
					}
					if (legajo==3487){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...VERGARA, RAMON ANTONIO..."<<endl;
					}				
					else if (legajo==3488){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SANCHEZ, ROBERTO HILARIO..."<<endl;
					}
					if (legajo==3489){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...OLIVA, JOSE LUIS..."<<endl;
					}				
					else if (legajo==3490){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BORDON, JOSE CRUZ..."<<endl;
					}
					if (legajo==3501){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARABAJAL, FRANCISCO PABLO..."<<endl;
					}				
					else if (legajo==3522){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BARROS, NESTOR OSCAR..."<<endl;
					}
					if (legajo==3523){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GEREZ, RAMON OSBALDO..."<<endl;
					}				
					else if (legajo==3524){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...COLLANTES, MANUEL ALBERTO..."<<endl;
					}
					if (legajo==3547){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARRIZO, OSVALDO CESAR..."<<endl;
					}				
					else if (legajo==3550){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CASIVA, DOMINGO HECTOR..."<<endl;
					}
					if (legajo==3558){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MORALES, CARLOS JOSE..."<<endl;
					}				
					else if (legajo==3637){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARABAJAL, JOSE ANTONIO..."<<endl;
					}
					if (legajo==3638){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PAJON, ANGEL EMILIO..."<<endl;
					}				
					else if (legajo==3640){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CASIVA, DANIEL EDGARDO..."<<endl;
					}
					if (legajo==3690){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARABAJAL, PABLO ALBERTO..."<<endl;
					}				
					else if (legajo==3736){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...NIEVA, ROBERTO ANTONIO..."<<endl;
					}
					if (legajo==3766){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...AMADOR, MARTIN FELIPE..."<<endl;
					}				
					else if (legajo==3768){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ROMERO, ROBERTO JOSE..."<<endl;
					}
					if (legajo==3785){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, ARIEL FRANCO..."<<endl;
					}				
					else if (legajo==3792){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RUIZ, JOSE LUIS..."<<endl;
					}
					if (legajo==3797){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ROLDAN, NELSON ALBERTO..."<<endl;
					}				
					else if (legajo==3801){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ALARCON MAXIMILIANO DIEGO..."<<endl;
					}
					if (legajo==3805){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BULACIO, CARLOS ALEJANDRO..."<<endl;
					}				
					else if (legajo==3807){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RODRIGUEZ, DARIO HECTOR..."<<endl;
					}
					if (legajo==3812){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ROCHA, MIGUEL ESTEBAN..."<<endl;
					}				
					else if (legajo==3843){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RUIZ, SERGIO OMAR..."<<endl;
					}
					if (legajo==3844){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...VALDEZ, OSCAR HUGO..."<<endl;
					}				
					else if (legajo==3855){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...FIGUERES, NELSON JOSE DANIEL..."<<endl;
					}
					if (legajo==3859){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SANCHEZ, FRANCO JOSE LUIS..."<<endl;
					}				
					else if (legajo==3865){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, JORGE HERNAN..."<<endl;
					}
					if (legajo==3868){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LEGUIZAMON, CRISTIAN HERNAN..."<<endl;
					}				
					else if (legajo==3879){
						SIND = 2;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...VALLEJO, LUIS ALFREDO..."<<endl;
					}
					if (legajo==3886){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CASTRO, MIGUEL ANTONIO..."<<endl;
					}				
					else if (legajo==3897){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...AGUERO, LUIS MIGUEL..."<<endl;
					}
					if (legajo==3898){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...FARIAS, FRANCISCO ENRIQUE..."<<endl;
					}				
					else if (legajo==3900){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARABAJAL, RICARDO LORENZO..."<<endl;
					}
					if (legajo==3943){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PLAZA, VICTOR EDUARDO..."<<endl;
					}				
					else if (legajo==3954){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, SEBASTIAN RICARDO..."<<endl;
					}
					if (legajo==3955){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LEYVA, CHRISTIAN ORLANDO..."<<endl;
					}				
					else if (legajo==3957){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GUZMAN, SERGIO ARIEL..."<<endl;
					}
					if (legajo==3959){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RAMIREZ, FERNANDO RAMON..."<<endl;
					}				
					else if (legajo==3970){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARABAJAL, MARTIN GERARDO..."<<endl;
					}
					if (legajo==3973){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CORREA, JOSE GUILLERMO..."<<endl;
					}				
					else if (legajo==3985){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, ANDRES JESUS..."<<endl;
					}
					if (legajo==3986){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RUIZ, RODRIGO CLAUDIO SEBASTIAN..."<<endl;
					}				
					else if (legajo==4006){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GEREZ, TOMAS ANTONIO..."<<endl;
					}
					if (legajo==4051){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ZURITA, MAURICIO EXEQUIEL..."<<endl;
					}				
					else if (legajo==4054){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RODRIGUEZ, DARDO RUBEN..."<<endl;
					}
					if (legajo==4058){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SALINAS, CLAUDIO SEBASTIAN..."<<endl;
					}				
					else if (legajo==4070){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LUNA, HUGO OSCAR..."<<endl;
					}
					if (legajo==4086){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CORDOBA PALACIO, MARTIN ANTONIO..."<<endl;
					}				
					else if (legajo==4129){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MORENO, ANGEL ORLANDO..."<<endl;
					}
					if (legajo==4146){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SARASPE, MIGUEL ANGEL..."<<endl;
					}				
					else if (legajo==4152){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BERETTA LEONARDO GABRIEL..."<<endl;
					}
					if (legajo==4171){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BELLIDO, MARCELO ALEJANDRO..."<<endl;
					}				
					else if (legajo==5327){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LUNA, HUGO OSCAR..."<<endl;
					}
					if (legajo==5328){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GONZALEZ, HUGO RICARDO..."<<endl;
					}				
					else if (legajo==5348){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CAMPOS, MANUEL ALEJANDRO..."<<endl;
					}
					if (legajo==5349){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...VARELA, HECTOR MANUEL..."<<endl;
					}				
					else if (legajo==5350){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...IÑIGO, SEBASTIAN ROQUE ANDRES..."<<endl;
					}
					if (legajo==6225){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GAMBARTE, DIEGO LEANDRO..."<<endl;
					}
					CAT = 4;
					cout<<"Su Categoria es: "<<CAT<<endl;
					JO = 3149.73;
					cout<<"Su jornal es: "<<JO<<endl;
					}
					if(legajo == 3459||legajo==3470||legajo==3477||legajo==3494||legajo==3512||legajo==3516||legajo==3552||legajo==3557||legajo==3584||legajo==3608||legajo==3616||legajo==3636||legajo==3681||legajo==3684||legajo==3724||legajo==3754||legajo==3774||legajo==3782||legajo==3799||legajo==3852||legajo==3857||legajo==3863||legajo==3876||legajo==3883||legajo==3887||legajo==3892||legajo==3915||legajo==3964||legajo==3965||legajo==3977||legajo==4040||legajo==4047||legajo==4073||legajo==4077||legajo==4099||legajo==4132||legajo==4137||legajo==5321){
					if (legajo==3459){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SANCHEZ, OSCAR ALFREDO..."<<endl;
					}				
					else if (legajo==3470){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GORDILLO, NICOLAS ALBERTO..."<<endl;
					}
					if (legajo==3477){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, ARTURO PASCUAL..."<<endl;
					}				
					else if (legajo==3494){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GEREZ, PEDRO JUAN..."<<endl;
					}
					if (legajo==3512){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GEREZ, RUBEN EMILIO..."<<endl;
					}				
					else if (legajo==3516){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, LUIS ARMANDO..."<<endl;
					}
					if (legajo==3552){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...FARIAS, PEDRO VALENTIN..."<<endl;
					}				
					else if (legajo==3557){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ARREGUEZ, HUMBERTO ARGENTINO..."<<endl;
					}
					if (legajo==3584){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PINILLA, OSCAR IGNACIO..."<<endl;
					}				
					else if (legajo==3608){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GEREZ, MIGUEL LEANDRO..."<<endl;
					}
					if (legajo==3616){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SALINAS, VICTOR HUGO..."<<endl;
					}				
					else if (legajo==3636){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PINILLA, MARIO ANTONIO..."<<endl;
					}
					if (legajo==3681){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LEIVA, NORBERTO DE JESUS..."<<endl;
					}				
					else if (legajo==3684){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LEIVA, ENRIQUE FABIAN..."<<endl;
					}
					if (legajo==3724){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, SERGIO DANIEL..."<<endl;
					}				
					else if (legajo==3754){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARRION, MARCOS ANTONIO..."<<endl;
					}
					if (legajo==3774){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ARREGUEZ, CARLOS DANTE..."<<endl;
					}				
					else if (legajo==3782){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GONZALEZ, ANGEL EDGARDO..."<<endl;
					}
					if (legajo==3799){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, ENZO PAOLO..."<<endl;
					}				
					else if (legajo==3852){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GONZALEZ, NELSON ANDRES	..."<<endl;
					}
					if (legajo==3857){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...FIGUEROA, RUBEN ANTONIO..."<<endl;
					}				
					else if (legajo==3863){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SALINAS, DANIEL ARMANDO..."<<endl;
					}
					if (legajo==3876){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GUZMAN, WALTER IGNACIO..."<<endl;
					}				
					else if (legajo==3883){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BARROSO, VICTOR HUGO	..."<<endl;
					}
					if (legajo==3887){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CORONEL, RAUL RENE..."<<endl;
					}				
					else if (legajo==3892){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MENDOZA, PABLO FERNANDO..."<<endl;
					}
					if (legajo==3915){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GRAMAJO, SERGIO DAMIAN..."<<endl;
					}				
					else if (legajo==3964){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ROMERO, OSCAR ORLANDO	..."<<endl;
					}
					if (legajo==3965){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PINILLA, FABIAN ANGEL..."<<endl;
					}				
					else if (legajo==3977){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...VERTIN, JORGE ANTONIO..."<<endl;
					}
					if (legajo==4040){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PAZ, JUAN RICARDO..."<<endl;
					}				
					else if (legajo==4047){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ARCE, ARIEL EDGARDO..."<<endl;
					}
					if (legajo==4073){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LEIVA, CRISTIAN DANIEL..."<<endl;
					}				
					else if (legajo==4077){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MARQUEZ, LEONARDO IVAN..."<<endl;
					}
					if (legajo==4099){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GRAVOVICHI, NAHUEL ESTEBAN..."<<endl;
					}				
					else if (legajo==4132){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SOSA, ANGEL FELICIANO..."<<endl;
					}
					if (legajo==4137){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LESCANO FLAVIO EDUARDO EZEQUIEL..."<<endl;
					}				
					else if (legajo==5321){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...PONCE, JOSE LUIS..."<<endl;
					}
					CAT = 5;
					cout<<"Su Categoria es: "<<CAT<<endl;
					JO = 3218.21;
					cout<<"Su jornal es: "<<JO<<endl;
					}
					else if(legajo == 3508||legajo==3509||legajo==3537||legajo==3556||legajo==3567||legajo==3571||legajo==3573||legajo==3577||legajo==3593||legajo==3599||legajo==3610||legajo==3630||legajo==3671||legajo==3710||legajo==3729||legajo==3731||legajo==3739||legajo==3771||legajo==3773||legajo==3775||legajo==3784||legajo==3798||legajo==3800||legajo==3809||legajo==3819||legajo==3822||legajo==3858||legajo==3862||legajo==3864||legajo==3870||legajo==3882||legajo==3884||legajo==3893||legajo==3909||legajo==3910||legajo==3911||legajo==3917||legajo==3923||legajo==3938||legajo==3969||legajo==3984||legajo==3995||legajo==4002||legajo==4007||legajo==4027||legajo==4028||legajo==4041||legajo==4043||legajo==4046||legajo==4083||legajo==41){
					if (legajo==3508){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARRIZO, RAMON DEL CARMEN..."<<endl;
					}				
					else if (legajo==3509){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ALMIRON, LEOPOLDO ANTONIO..."<<endl;
					}
					if (legajo==3537){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LEGUIZAMON, JOSE JACINTO..."<<endl;
					}				
					else if (legajo==3556){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ROMERO, JOSE JULIO..."<<endl;
					}
					if (legajo==3567){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SANDOVAL, HECTOR RODOLFO..."<<endl;
					}				
					else if (legajo==3571){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LOBO, JUAN ANTONIO..."<<endl;
					}
					if (legajo==3573){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...OLIVERA, CARLOS HECTOR..."<<endl;
					}				
					else if (legajo==3577){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...AREBALO, FERNANDO HORACIO..."<<endl;
					}
					if (legajo==3593){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...VELIZ, ROBERTO ANTONIO..."<<endl;
					}				
					else if (legajo==3599){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GODOY, MIGUEL OSCAR..."<<endl;
					}
					if (legajo==3610){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SORIA, JUAN RAMON..."<<endl;
					}				
					else if (legajo==3630){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GEREZ, JUAN GERARDO..."<<endl;
					}
					if (legajo==3671){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CASIVA, JOSE LUIS..."<<endl;
					}				
					else if (legajo==3710){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ALDERETE, MIGUEL ANGEL..."<<endl;
					}
					if (legajo==3729){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SANDOVAL, SERGIO ARIEL..."<<endl;
					}				
					else if (legajo==3731){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...AGUIRRE, RAFAEL ERNESTO..."<<endl;
					}
					if (legajo==3739){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SANDOVAL, MARCELO DANIEL..."<<endl;
					}				
					else if (legajo==3771){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GALVAN, ELIO GABRIEL..."<<endl;
					}
					if (legajo==3773){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ROMERO, WALTER JOSE..."<<endl;
					}				
					else if (legajo==3775){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, RAMON ROQUE..."<<endl;
					}
					if (legajo==3784){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SALINAS, LUCIANO JAVIER..."<<endl;
					}				
					else if (legajo==3798){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GUARDIA, ROQUE EDUARDO..."<<endl;
					}
					if (legajo==3800){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ZAMORANO, MAXIMO JUAN ANTONIO..."<<endl;
					}				
					else if (legajo==3809){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...AREVALO, SERGIO FABIAN..."<<endl;
					}
					if (legajo==3819){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...COSTILLA, LUIS ALBERTO ANTONIO..."<<endl;
					}				
					else if (legajo==3822){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SALVATIERRA, ROBERTO ISAIAS..."<<endl;
					}
					if (legajo==3858){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GRANEROS, ARIEL ALEJANDRO..."<<endl;
					}				
					else if (legajo==3862){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, RAUL EDUARDO..."<<endl;
					}
					if (legajo==3864){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GEREZ, JORGE EMILIO..."<<endl;
					}				
					else if (legajo==3870){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, RODRIGO ANGEL FERNANDO..."<<endl;
					}
					if (legajo==3882){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LEIVA, MIGUEL ARIEL..."<<endl;
					}				
					else if (legajo==3884){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SERRANO, ERNESTO JESUS ISMAEL..."<<endl;
					}
					if (legajo==3893){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...VALDEZ, ALEJANDRO EXEQUIEL..."<<endl;
					}				
					else if (legajo==3909){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SOBERON, NAHUEL HERALDO..."<<endl;
					}
					if (legajo==3910){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BUSTAMANTE, DANIEL ALBERTO..."<<endl;
					}				
					else if (legajo==3911){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BARRANQUERO, FRANCO NORBERTO..."<<endl;
					}
					if (legajo==3917){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MOLINA, CRISTIAN LEONARDO..."<<endl;
					}				
					else if (legajo==3923){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GUZMAN, LUCIO ARIEL..."<<endl;
					}
					if (legajo==3938){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GOMEZ, CARLOS ALBERTO..."<<endl;
					}				
					else if (legajo==3969){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARABAJAL, JUAN FERNANDO..."<<endl;
					}
					if (legajo==3984){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, MARIO ARIEL..."<<endl;
					}				
					else if (legajo==3995){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RODRIGUEZ, CLAUDIO ORLANDO..."<<endl;
					}
					if (legajo==4002){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, RICARDO ESTEBAN..."<<endl;
					}				
					else if (legajo==4007){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LESCANO, FERNANDO GUSTAVO..."<<endl;
					}
					if (legajo==4027){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, CRISTIAN ALEJANDRO..."<<endl;
					}				
					else if (legajo==4028){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, JOSE  LUIS..."<<endl;
					}
					if (legajo==4041){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ALFARO, ANTONIO SILVANO..."<<endl;
					}				
					else if (legajo==4043){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ZELARAYAN, DARIO RAMON SILENIO..."<<endl;
					}
					if (legajo==4046){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GONZALEZ, RONAN WILSON ANTONIO..."<<endl;
					}				
					else if (legajo==4083){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARABAJAL, JORGE DALINDO..."<<endl;
					}
					if (legajo==4170){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...ALIO, GONZALO AGUSTIN..."<<endl;
					}
					CAT = 6;
					cout<<"Su Categoria es: "<<CAT<<endl;
					JO = 3332.33;
					cout<<"Su jornal es: "<<JO<<endl;
					}
					if(legajo == 3467||legajo==3539||legajo==4589||legajo==3611||legajo==3618||legajo==3629||legajo==3694||legajo==3772||legajo==3795||legajo==3823||legajo==3845||legajo==3856||legajo==6848||legajo==6862){
					if (legajo==3467){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...CARRIZO, RAMON ROQUE..."<<endl;
					}
					else if (legajo==3539){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...BARRIONUEVO, JOSE ORLANDO..."<<endl;
					}
					if (legajo==3589){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, JORGE LUIS..."<<endl;
					}				
					else if (legajo==3611){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SOSA, ALEJANDRO MANUEL..."<<endl;
					}
					if (legajo==3618){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...RUIZ, ORLANDO EDUARDO..."<<endl;
					}				
					else if (legajo==3629){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...TEJERINA, JUAN ANTONIO..."<<endl;
					}
					if (legajo==3694){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...IÑIGO, VICTOR ALBERTO..."<<endl;
					}				
					else if (legajo==3772){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...TEJEDA, MARIO LUIS..."<<endl;
					}
					if (legajo==3795){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MENDEZ, CARLOS VICTOR..."<<endl;
					}				
					else if (legajo==3823){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, ALEJANDRO HUMBERTO..."<<endl;
					}
					if (legajo==3845){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GRANEROS, MARCELO ARMANDO..."<<endl;
					}				
					else if (legajo==3856){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, CRISTIAN ANTONIO..."<<endl;
					}
					if (legajo==6848){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...TARTALO, JUAN RAMON..."<<endl;
					}				
					else if (legajo==6862){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...GRAMAJO, JULIO SERGIO..."<<endl;
					}
					CAT = 7;
					cout<<"Su Categoria es: "<<CAT<<endl;
					JO = 3474.98;
					cout<<"Su jornal es: "<<JO<<endl;
					}
					else if(legajo == 3699||legajo==3760||legajo==3780||legajo==3916||legajo==3936||legajo==4025||legajo==7907||legajo==7909){
					if (legajo==3699){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...LOPEZ, ADRIAN ENRIQUE..."<<endl;
					}				
					else if (legajo==3760){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, CLAUDIO GASTON..."<<endl;
					}
					if (legajo==3780){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...HERRERA, JUAN JOSE..."<<endl;
					}				
					else if (legajo==3916){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...MORENO, OSCAR ANTONIO..."<<endl;
					}
					if (legajo==3936){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...AGUIRRE, PATRICIO RUBEN..."<<endl;
					}				
					else if (legajo==4025){
						SIND = 1;
						OS = 2;
						cout<<"Bienbenido a sistema de sueldos:"<< "...DIAZ, CARLOS ALBERTO..."<<endl;
					}
					if (legajo==7907){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...SALAS, CARLOS ALBERTO..."<<endl;
					}				
					else if (legajo==7909){
						SIND = 1;
						OS = 1;
						cout<<"Bienbenido a sistema de sueldos:"<< "...OLAS, DOMINGO ANTONIO ARMAND..."<<endl;
					}
					CAT = 8;
					cout<<"Su Categoria es: "<<CAT<<endl;
					JO = 3571.98;
					cout<<"Su jornal es: "<<JO<<endl;
					}
					VH = JO/8;//Valor de la Hora
					cout<<"\nEl valor de la hora es: "<<VH<<endl;
					cout<<"Ingrese sus dias trabajados: ";//dias trabajados
					cin>>JT;
					TB = JT*JO;//Remuneracion por el total de dias Trabajados
					cout<<"\nEl total bruto de la quincena es: "<<TB<<endl;
					cout<<"Digite los dias feriados: ";
					cin>>FE;
					FERIADO = FE * JO;
					cout<<"\nEl Total a cobrar por dias feriados es : "<<FERIADO<<endl;
					cout<<"Ingrese el total de horas extras simples: ";
					cin>>HES;
					HEST = (VH*1.5)*HES;//Remuneracion por horas extras al 50% 
					cout<<"\nEl total a cobrar de horas extras simples es: "<<HEST<<endl;
					cout<<"Ingrese el total de horas extras al cien: ";
					cin>>HEC;
					HECT = (VH*2)*HEC;//Remuneracion por horas extras al 100%
					cout<<"\nEl total a cobrar de horas extras al cien es: "<<HECT<<endl;
					cout<<"Digite sus años de escalafon: ";
					cin>>ANT;
					DES = (TB+FERIADO+HEST+HECT)*0.18;
					cout<<"\nEl total de descuento es: "<<DES<<endl;
					SUELDO_BRUTO = TB+FERIADO+HEST+HECT;
					cout<<"\nEl total de su sueldo bruto es: "<<SUELDO_BRUTO<<endl;
					TDES = SUELDO_BRUTO-DES;
					cout<<"\nEl sueldo total con descuento es: "<<TDES<<endl;
					cout<<"\n";
					system("pause");
					break;
*/
