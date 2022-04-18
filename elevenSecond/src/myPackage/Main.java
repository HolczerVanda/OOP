package myPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Albert");
		nameList.add("Domonkos");
		nameList.add("Szabolcs");
		nameList.add("Lili");
		nameList.add("Bella");
		nameList.add("Kamilla");
		
		File file = new File("names.txt");
		writeInFile(file, nameList);
		
		nameList= readWithScanner(file);
		
		Collections.sort(nameList);
		System.out.println(nameList);
		
		
	}
	
	private static void writeInFile(File file, ArrayList<String> arrayList)
	{
		try(FileWriter fileWriter=new FileWriter(file))
		{
			for(String name:arrayList)
			{
				fileWriter.write(name+"\n");
			}
			fileWriter.flush();
		}
		catch(IOException e)
		{
			System.out.println("An error occured while writing the file...");
		}
	}
	
	private static ArrayList<String> readFromFile(File file)
	{
		ArrayList<String> nameList=new ArrayList<String>();
		String line;
		try(FileReader fileReader=new FileReader(file);
			BufferedReader reader=new BufferedReader(fileReader))
		{
			while((line=reader.readLine())!=null)
			{
				nameList.add(line);
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occured while reading the file...");
		}
		return nameList;
	}
	
	private static ArrayList<String> readWithScanner(File file)
	{
		ArrayList<String> nameList=new ArrayList<String>();
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				nameList.add(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occured while reading the file...");
		}
		return nameList;
	}

}
