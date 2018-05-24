package Onp;

public class Zamiana
{
	public static String ZamianaONP(String str)
	{
		Stack stack = new Stack(20);
		String onp="";

		if(str.endsWith("="))
		{

			for(int i = 0; i < str.length()-1; i++)
			{

				if((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '.')
				{
					onp+=str.charAt(i);
				}
				else
				{
					onp += " ";

					switch(str.charAt(i))
					{

						case '-':
						{
							while(!stack.isEmpty() && !stack.top().equals("("))
								onp += stack.pop();
							stack.push(str.charAt(i) + " ");
							break;
						}

						case '+':
						{
							while(!stack.isEmpty() && !stack.top().equals("( "))
								onp += stack.pop();
							stack.push(str.charAt(i) + " ");
							break;
						}

						case '*':
						{
							while(!stack.isEmpty() && !(stack.top().equals("( ") || stack.top().equals("+ ") || stack.top().equals("- ")))
								onp += stack.pop();
							stack.push(str.charAt(i) + " ");
							break;
						}

						case '/':
						{
							while(!stack.isEmpty() && !(stack.top().equals("( ") || stack.top().equals("+ ")|| stack.top().equals("- ")))
								onp += stack.pop();
							stack.push(str.charAt(i) + " ");
							break;
						}

						case '^':
						{
							while(!stack.isEmpty() && !(stack.top().equals("( ") || stack.top().equals("+ ")|| stack.top().equals("- ")|| stack.top().equals("* ")|| stack.top().equals("/ ")))
								onp += stack.pop();
							stack.push(str.charAt(i) + " ");
							break;
						}

						case '(':
						{
							stack.push(str.charAt(i) + " ");
							break;
						}

						case ')':
						{
							while(!stack.isEmpty() && !(stack.top().equals("( ")))
								onp += stack.pop();
							break;
						}

						default:
						{
							System.out.println("BLAD");
							System.exit(-1);
						}

					}
				}
			}

			while(!stack.isEmpty())
			{
				if(!(stack.top().equals("(") || stack.top().equals(" (") || stack.top().equals("  (") || stack.top().equals("( ")))
					onp += " " + stack.pop();
				else
					stack.pop();
			}

			System.out.println("ONP : " + onp);
		}
		return onp;

	}
}
