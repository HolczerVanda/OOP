package test;

import java.util.Scanner;

import myPersons.Person;
import myPersons.Adult;
import myPersons.Child;


public class PersonTest {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Person p1=readPerson();
		Person p2=readPerson();
		
		if((p1 instanceof Adult))
		{
			System.out.println("The first person is an adult");
		}
		else
		{
			System.out.println("The first person is a child");
		}
		
		if((p2 instanceof Adult))
		{
			System.out.println("The first person is an adult.");
		}
		else
		{
			System.out.println("The second person is a child.");
		}
		
		System.out.println();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}
	
	public static Person readPerson()
	{
		System.out.println("Please give the age:");
		int newAge=readInt();
		if(newAge<18)
		{
			System.out.println("Please give the name and the school: ");
			return new Child(readString(), newAge, readString());
		}
		else
		{
			System.out.println("Please give the name and the workplace: ");
			return new Adult(readString(), newAge, readString());
		}
	}
	
	public static String readString()
	{
		return input.nextLine();
	}
	public static int readInt()
	{
		int inputInt=input.nextInt();
		input.nextLine();
		return inputInt;
	}

}
