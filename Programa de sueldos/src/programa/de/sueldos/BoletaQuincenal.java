package programa.de.sueldos;

public class BoletaQuincenal {
    
    
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

    public BoletaQuincenal() {
    }

    public BoletaQuincenal(double sind, double os, double vant, int cat, int legajo, double jornal, double TIT, double valorHora, double jornalTrabajado, double totalBruto, int diasFer, double totalFeriado, double horaExSim, double totalHoraSim, double horaExCien, double totalHoraExCien, int antiguedad, double antigTotal, double primeQuincena, double totalPriQuin, double presentismo, double descuento, double sueldoBruto, double totalDescuento, double mes, double gratNoRemunerativa, double sueldoTotal) {
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
    
    
    
    public void mostrarBoleta(){
        if (antiguedad==0) {
            System.out.println("|------------------------------------------------------------------------------------------------|");
            System.out.println("JORNALES:		   		 "+jornalTrabajado+"	 "+jornal+"	  "+totalBruto);
            if (diasFer>0) {
                System.out.println("");   
            }
        }
    }

}
/*
                                                                                                                                                     if(ANT == 0){
							cout<<"|------------------------------------------------------------------------------------------------|"<<endl;
							cout<<"Jornales:		   		"<<JT<<"	"<<JO<<"	 "<<TB<<endl;
							if(FE > 0){
							cout<<"Feriado:				"<<FE<<"	"<<JO<<"	 "<<FERIADO<<endl;	
							}
							if(HEC > 0)
							cout<<"Horas Extras 100%:			"<<HEC<<"	"<<VH*2<<"	 "<<HECT<<endl;
							if(HES > 0)
							cout<<"Horas Extras 50%:			"<<HES<<"	"<<VH*1.5<<"	 "<<HEST<<endl;
							cout<<"Jubilacion 11%: 			"<<"1"<<"	"<<SUELDO_BRUTO*0.11<<"			 "<<SUELDO_BRUTO*0.11<<endl;
							cout<<"Ley 19.032  3%:				"<<"1"<<"	"<<SUELDO_BRUTO*0.03<<"			 "<<SUELDO_BRUTO*0.03<<endl;
							if(OS==1){
							cout<<"O.Social O.S.P.A.T 3%:			"<<"1"<<"	"<<SUELDO_BRUTO*0.03<<"			 "<<SUELDO_BRUTO*0.03<<endl;
							}else{
							cout<<"O.Social O.S.P.I.A 3%:			"<<"1"<<"	"<<SUELDO_BRUTO*0.03<<"			 "<<SUELDO_BRUTO*0.03<<endl;
							}
							if(SIND==1){
							cout<<"Cuota Sindical F.O.T.I.A 2%:		"<<"1"<<"	"<<SUELDO_BRUTO*0.02<<"			 "<<SUELDO_BRUTO*0.01<<endl;
							}else{
							cout<<"Cuota Sindical F.E.I.A 1%:		"<<"1"<<"	"<<SUELDO_BRUTO*0.01<<"			 "<<SUELDO_BRUTO*0.01<<endl;
							}
							cout<<"\n\n\n\nTotal a cobrar sin descuentos:				"<<"		 "<<SUELDO_BRUTO<<endl;
							cout<<"Total a cobrar con descuentos:					"<<"			 "<<TDES<<endl;
							cout<<"|------------------------------------------------------------------------------------------------|"<<endl;
				}
							else{
							cout<<"|------------------------------------------------------------------------------------------------|"<<endl;
							cout<<"Jornales:		   		"<<JT<<"	"<<JO<<"	 "<<TB<<endl;
							if(FE > 0){
							cout<<"Feriado:				"<<FE<<"	"<<JO<<"	 "<<FERIADO<<endl;	
							}
							if(FALTAS == 0){
							cout<<"Presentismo:				"<<"1"<<"	"<<PRE<<"	"<<PRE<<endl;	
							}
							else if(FALTAS == 1){
							cout<<"Presentismo:				"<<"0.50"<<"	"<<((25*JO+ANTT)*0.15)<<"	"<<((25*JO+ANTT)*0.15)/2<<endl;	
							}
							if(HEC > 0)
							cout<<"Horas Extras 100%:			"<<HEC<<"	"<<VH*2<<"	 "<<HECT<<endl;
							if(HES > 0)
							cout<<"Horas Extras 50%:			"<<HES<<"	"<<VH*1.5<<"	 "<<HEST<<endl;
							cout<<"Adicional Antiguedad:			"<<ANT<<"	"<<VANT<<"	"<<ANTT<<endl;
							if(T == 1){
							cout<<"Adicional por Titulo:			"<<T<<"	"<<TIT<<"	 "<<TIT<<endl;
							}
							cout<<"Gratificacion No Remunerativa:		"<<"1"<<"	"<<GNR<<endl;
							cout<<"Jubilacion 11%: 			"<<"1"<<"	"<<SUELDO_BRUTO*0.11<<"			 "<<SUELDO_BRUTO*0.11<<endl;
							cout<<"Ley 19.032  3%:				"<<"1"<<"	"<<SUELDO_BRUTO*0.03<<"			 "<<SUELDO_BRUTO*0.03<<endl;
							if(OS==1){
							cout<<"O.Social O.S.P.A.T 3%:			"<<"1"<<"	"<<SUELDO_BRUTO*0.03<<"			 "<<SUELDO_BRUTO*0.03<<endl;
							}else{
							cout<<"O.Social O.S.P.I.A 3%:			"<<"1"<<"	"<<SUELDO_BRUTO*0.03<<"			 "<<SUELDO_BRUTO*0.03<<endl;
							}
							if(SIND==1){
							cout<<"Cuota Sindical F.O.T.I.A 2%:		"<<"1"<<"	"<<SUELDO_BRUTO*0.02<<"			 "<<SUELDO_BRUTO*0.01<<endl;
							}else{
							cout<<"Cuota Sindical F.E.I.A 1%:		"<<"1"<<"	"<<SUELDO_BRUTO*0.01<<"			 "<<SUELDO_BRUTO*0.01<<endl;
							}
							cout<<"\n\n\n\nTotal a cobrar sin descuentos:				"<<"		 "<<SUELDO_BRUTO<<endl;
							cout<<"Total a cobrar con descuentos:					"<<"			 "<<TDES+GNR<<endl;
							cout<<"SUELDO TOTAL:						"<<"			 "<<"::: "<<SUELDO_TOTAL<<" $:::"<<endl;
							
							cout<<"SUELDO DEL MES:		"<<""""<<(SUELDO_TOTAL+(TPQ-(TPQ*0.18)))<<""""<<endl;
							cout<<"SUELDO BRUTO DEL MES:		"<<""""<<SUELDO_BRUTO+TPQ+GNR<<""""<<endl;
							cout<<"|------------------------------------------------------------------------------------------------|"<<endl;
				}
 */
