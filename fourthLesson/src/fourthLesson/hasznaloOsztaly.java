package fourthLesson;

import java.util.Scanner;

public class hasznaloOsztaly {

	public static void main(String[] args) {

		Alkalmazott employee=new Alkalmazott();
		
		employee.name="Vanda";
		employee.salary=200000;
		
		System.out.println(employee.concat(employee.name, employee.salary));
		
		employee.increaseSalary(10000);
		
		System.out.println(employee.concat(employee.name, employee.salary));
		
		
		Alkalmazott2 employee2=new Alkalmazott2();
		Alkalmazott2 anotherEmployee=new Alkalmazott2();
		
		employee2.setName("Vanda");
		employee2.setSalary(300000);
		
		String employeeName=employee2.getName();
		int employeeSalary=employee2.getSalary();
		
		
		System.out.println(employee2.concat(employeeName, employeeSalary));
		
		employee2.increaseSalary(20000);
		int newSalary=employee2.getSalary();
		
		
		System.out.println(employee2.concat(employeeName, newSalary));
		
		
		anotherEmployee.setName("Nem Vanda");
		anotherEmployee.setSalary(400000);
		
		int anotherSalary=anotherEmployee.getSalary();
		
		System.out.println("The salary is between the given bounds: "+employee2.isBetween(100000, 500000));
		System.out.println("The tax is(with 16%): "+ employee2.taxCalculator(newSalary));
		System.out.println("The first employee's salary is greater than the second one's: "+ employee2.isGreaterThan(anotherSalary));
		
		
		
	}
	
	public static Alkalmazott2[] arrayFiller()
	{
		Alkalmazott2[] array= new Alkalmazott2[2];
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
		}
		return array;
	}

}
