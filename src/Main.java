import Onp.*;

public class Main
{
	//Zamiana.ZamianaONP;
	public static void main(String[] args) 
	{
		String[] equations = {"2*(2+3)="};
		
		for (String equation: equations){
			String onp = Zamiana.ZamianaONP(equation);
			Kalkulator.KalkulatorONP(onp);
	    }
	}
}
