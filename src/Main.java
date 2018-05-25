import Onp.*;

public class Main
{
	//Zamiana.ZamianaONP;
	public static void main(String[] args) 
	{
		String[] equations = {"2*(2+3)=","2+3+23+3=","43-2-3=","6*3*2=","4*2/(3+7)="};


		for (String equation: equations){
			String onp = Zamiana.ZamianaONP(equation);
			if(!onp.equals("no input data"))
			Kalkulator.KalkulatorONP(onp);
	    }

	}
}
