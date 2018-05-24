package Onp;

public class Kalkulator
{
	public static void KalkulatorONP(String str)
	{

		String help = "";
		double[] stack = new double[50];
		int stackPosition = -1;
		boolean lastCharWasOperator = false;

		for(int i = 0; i < str.length()-1; i++) {
			if(lastCharWasOperator)
				lastCharWasOperator = false;
			else if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '.')
				help += str.charAt(i);
			else if (str.charAt(i) == ' ' && help != "") {
					stack[++stackPosition] = Double.parseDouble(help);
					help = "";
			} else if (str.charAt(i)!=' '){
				lastCharWasOperator = true;
				switch (str.charAt(i)) {
					case '-': {
						stack[stackPosition - 1] = stack[stackPosition - 1] - stack[stackPosition];
						stackPosition--;
						break;
					}
					case '+': {
						stack[stackPosition - 1] = stack[stackPosition - 1] + stack[stackPosition];
						stackPosition--;
						break;
					}
					case '*': {
						stack[stackPosition - 1] = stack[stackPosition - 1] * stack[stackPosition];
						stackPosition--;
						break;
					}
					case '/': {
						stack[stackPosition - 1] = stack[stackPosition - 1] / stack[stackPosition];
						stackPosition--;
						break;
					}
					case '^': {
						stack[stackPosition - 1] = Math.pow(stack[stackPosition - 1], stack[stackPosition]);
						stackPosition--;
						break;
					}
					default: {
						System.out.println("BLAD");
						System.exit(-1);
					}
				}
			}


		}
		System.out.println( stack[0]);
		}
}
