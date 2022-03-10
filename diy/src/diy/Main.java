package diy;

import java.util.Scanner;

public class Main {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("How many records do you want?");
		int number=readInt();
		
		Record[] records=arrayFiller(number);
		
		System.out.println("The longest record is: "+records[longestRecord(records)].toString());
		
		System.out.println("Give a singer: ");
		String newSinger=readString();
		
		singersRecord(records, newSinger);
	}
	
	public static void singersRecord(Record[] array, String newSinger)
	{
		int cnt=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i].sameSinger(newSinger))
			{
				System.out.println(array[i].toString());
				cnt++;
			}
		}
		if(cnt==0)
		{
			System.out.println("There is no record from this singer.");
		}
	}
	
	public static int longestRecord(Record[] array)
	{
		int max=0;
		int index=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i].isLonger(max)==1)
			{
				max=array[i].getPlayTime();
				index=i;
			}
		}
		return index;
	}
	
	
	public static Record[] arrayFiller(int number)
	{
		Record[] array=new Record[number];
		for(int i=0;i<number;i++)
		{
			System.out.println("Type in the singer, the title and the playtime: ");
			array[i]=new Record(readString(),readString(),readInt());
		}
		return array;
	}
	
	public static int readInt()
	{
		while(true)
	    {
	    	if(!input.hasNextInt())
	    	{
	    		System.out.println("Please give a number!");
	    		input.nextLine();
	    	}
	    	else
	    	{
	    		int n=input.nextInt();
	    		input.nextLine();
	    		return n;
	    	}
	    }
	}
	
	public static String readString()
	{
		return input.nextLine();
	}

}
