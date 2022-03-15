package sixthFirst;

import java.util.Scanner;

public class Main {
	
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("How many employees do you want? ");
		
		int numberOfEmployees=readInt();
		Employee[] employees=readEmployees(numberOfEmployees);
		
		writeEmployees(employees);
		
		/*Employee.setNewRetiringAge(60);
		System.out.println("After changing retirement age: ");
		writeEmployees(employees);
		
		lessThan(employees);
		
		moreThanAverage(employees);*/
		
		orderIncreasing(employees);
		System.out.println("Inc: ");
		writeEmployees(employees);
		orderDecreasing(employees);
		System.out.println("Dec: ");
		writeEmployees(employees);

	}
	
	public static void orderDecreasing(Employee[] array)
	{
		for(int i=0; i<array.length; i++) 
		{
			int maxIndex = i;
			for(int j=i+1; j<array.length; j++) 
			{
				if (Employee.yearsUntilRetirement(array[j].getAge()) >Employee.yearsUntilRetirement(array[maxIndex].getAge())) 
					{
						maxIndex = j;
					}
			}
			if (maxIndex != i) 
			{
				Employee tmp = array[i];
				array[i] = array[maxIndex];
				array[maxIndex] = tmp;
			}
		}
	}
	
	public static void orderIncreasing(Employee[] array)
	{
		for(int i=0; i<array.length; i++) 
		{
			int minIndex = i;
			for(int j=i+1; j<array.length; j++) 
			{
				if (Employee.yearsUntilRetirement(array[j].getAge()) <Employee.yearsUntilRetirement(array[minIndex].getAge())) 
					{
						minIndex = j;
					}
			}
			if (minIndex != i) 
			{
				Employee tmp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = tmp;
			}
		}
	}
	
	public static void moreThanAverage(Employee[] array)
	{	
		int sum=0, cnt=0, number=0;
		double average;
		
		for(int i=0;i<array.length;i++)
		{
			sum+=Employee.yearsUntilRetirement(array[i].getAge());
			cnt++;
		}
		
		average=(double)sum/cnt;
		
		System.out.println("Employees that have more years until retirement than the average("+average+"):");
		
		for(int i=0;i<array.length;i++)
		{
			if(Employee.yearsUntilRetirement(array[i].getAge())>average)
			{
				System.out.println(array[i].toString()+"\n");
				number++;
			}
		}
		
		if(number==0)
		{
			System.out.println("There is none");
		}
	}
	
	public static void lessThan(Employee[] array)
	{
		System.out.println("Employees that have less than 5 years until retirement:");
		int cnt=0;
		for(int i=0;i<array.length;i++)
		{
			if(Employee.yearsUntilRetirement(array[i].getAge())<5)
			{
				System.out.println(array[i].toString()+"\n");
				cnt++;
			}
		}
		if(cnt==0)
		{
			System.out.println("There is none\n");
		}
	}
	
	public static void writeEmployees(Employee[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i].toString()+"\n");
		}
	}
	
	public static String readString()
	{
		return input.nextLine();
	}
	
	public static int readInt()
	{
		int number=input.nextInt();
		input.nextLine();
		return number;
	}
	
	public static Employee[] readEmployees(int n)
	{
		Employee[] array=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Please give the person's datas: ");
			array[i]=new Employee(readString(), readInt());
		}
		return array;
	}

}
