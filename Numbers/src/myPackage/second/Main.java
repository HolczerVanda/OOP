package myPackage.second;

import java.util.Random;
import myPackage.first.Number;

public class Main {

	public static void main(String[] args) {
		
		final Number newNumber=new Number(0.14);
		generateNumbers(newNumber);

	}
	
	public static void generateNumbers(Number n)
	{
		Random rand=new Random();
		boolean ok=false;
		int cnt=0;
		
		while(!ok)
		{
			double same=rand.nextDouble();
			System.out.println(same);
			cnt++;
			
			if(n.difference(same))
			{
				ok=true;
			}
		}
		System.out.println("The number was the "+cnt+". generated number");
	}

}
