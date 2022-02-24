package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] inputArray=readInput();
		int a = Integer.parseInt(inputArray[0]);
		char op = inputArray[1].charAt(0);
		int b = Integer.parseInt(inputArray[2]);
		
		System.out.println(""+a+op+b);
		
		if(b==0 && op=='/')
		{
			System.out.println("You can't divide by 0");
			return;
		}
		
		double result=0;
		switch(op)
		{
			case '+':
				result=a+b;
				break;
			case '-':
				result=a-b;
				break;
			case '*':
				result=a*b;
				break;
			case '/':
				result=a/b;
				break;
		}
		
		
		System.out.println("Result: "+ result);

	}
	
	public static String[] readInput()
	{
		Scanner input=new Scanner(System.in);
		boolean ok= false;
		
		String[] strArray;
		
		do
		{
			System.out.print("Please give an equation: ");
			String inString = input.nextLine();
			strArray=inString.split(" ");
			try
			{
				int a = Integer.parseInt(strArray[0]);
				char op = strArray[1].charAt(0);
				int b = Integer.parseInt(strArray[2]);
				ok=true;
			}
			catch(Exception e)
			{
				System.out.println("Don't be silly :)");
			}
		}while(!ok);
		
		
		return strArray;
	}

}
