package third2;

import java.util.Scanner;

public class Main2 {

	static Scanner input= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a=0, b=0, c=0;
		boolean ok;
		do {
			System.out.print("Az egyenlet konstansai vesszõvel elválasztva: ");
			String inString = input.nextLine();
			String[] strArray = inString.split(",");
			ok = true;
			try {
				a = Integer.parseInt(strArray[0]);
				b = Integer.parseInt(strArray[1]);
				c = Integer.parseInt(strArray[2]);
			}
			catch (NumberFormatException ex) {
				ok = false;
			}
		} while (!ok);
		
		System.out.println("a: "+a+"b: "+b+"c: "+c);
		
		double d =calcDiscriminant(a,b,c);
		System.out.println("Discriminant: "+d); 
		
		if(d<0)
		{
			System.out.println("No real result");
		}
		else if(d==0)
		{
			double result=(-1.0*b)/(2.0*a);
			System.out.println("One result: "+result);
		}
		else
		{
			double result1=(-1.0*b)-Math.sqrt(d);
			result1/=2.0*a;
			double result2=(-1.0*b)+Math.sqrt(d);
			result1/=2.0*a;
			System.out.println("1. result: "+result1+"2. result: "+ result2);
		}
	}
	
	public static double calcDiscriminant(int a, int b, int c)
	{
		return Math.pow(b, 2)-(4*a*c);
	}

}
