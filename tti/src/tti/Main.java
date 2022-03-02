package tti;

import java.util.Scanner;

public class Main {
	
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		
		Person myPerson=readInput();
		
		System.out.println(myPerson.concat());
		
		//System.out.println(readInput().concat());

	}
	
	public static Person readInput()
	{
		Person person=new Person();
		
		System.out.println("Please give the properties: "); 
		
		String inputString=input.nextLine();
		String[] stringArray=inputString.split(", ");
		
		person.setName(stringArray[0]);
		person.setWeight(Integer.parseInt(stringArray[1]));
		person.setHeight(Double.parseDouble(stringArray[2]));
		
		return person;
		
	}

}
