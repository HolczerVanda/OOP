package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Book[] bookArray=generateBooks();
		longestBook(bookArray);
		System.out.println("Even");
		longestEven(bookArray);
		
	}
	
	public static void sameAuthor(Book[] array)
	{
		int j=0;
		while(j<array.length)
		{
			for(int i=0;i<array.length;i++)
			{
				
			}
			j++;
		}
	}
	
	public static void longestEven(Book[] array)
	{

		ArrayList<Book> evenArray=new ArrayList<>();
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i].isEven())
			{
				evenArray.add(array[i]);
			}
		}
		longestBook(evenArray);
		/*for(Book book : evenArray)
		{
			System.out.println(book);
		}*/
	}
	
	public static void longestBook(ArrayList<Book> array)
	{
		Book max=new Book(null, null, 0);
		int index=0;
		for(int i=0;i<array.size();i++)
		{
			if(Book.longerBook(max,array.get(i))==array.get(i))
			{
				max=array.get(i);
				index=i;
			}
		}
		System.out.println("The longest book: ");
		System.out.println(array.get(index));
	}
	
	public static void longestBook(Book[] array)
	{
		Book max=new Book(null, null, 0);
		int index=0;
		for(int i=0;i<array.length;i++)
		{
			if(Book.longerBook(max,array[i])==array[i])
			{
				max=array[i];
				index=i;
			}
		}
		System.out.println("The longest book: ");
		System.out.println(array[index]);
	}
	
	public static String readString()
	{
		String inputString=input.nextLine();
		return inputString;
	}
	
	public static int readInt()
	{
		int inputInt=input.nextInt();
		input.nextLine();
		return inputInt;
	}
	
	public static Book[] generateBooks()
	{
		System.out.println("How many books do you want?");
		
		int number=readInt();
		Book[] bookArray=new Book[number];
		
		
		for(int i=0;i<number;i++)
		{
			System.out.println("Please give the details of the book: ");
			bookArray[i]=new Book(readString(), readString(), readInt());
		}
		
		return bookArray;
	}

}
