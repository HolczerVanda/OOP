package second;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int number=0;
		int countEqual=0;
		
		do
		{
			System.out.print("Please give a number between 1 and 10: ");
			while(!input.hasNextInt())
			{
				System.out.println("Incorrect input");
				input.next();
			}
			number=input.nextInt();
			input.nextLine();
		}while(number<1 || number>10);
		
		/*for(int i=11;i<11+2*number;i+=2)
		{
			System.out.println(i+"-"+(i+1));
		}*/
		
		String array[]=new String[number];
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print((i+1)+". name: ");
			array[i]=input.nextLine();
		}
		
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i].equals(array[i+1]))
			{
				countEqual++;
			}
		}
		
		System.out.println(countEqual+" equal name.");
		
	}
}
