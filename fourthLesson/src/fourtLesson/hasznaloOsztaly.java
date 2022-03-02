package fourtLesson;

import java.util.Scanner;

public class hasznaloOsztaly {

    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {

        Alkalmazott employee=new Alkalmazott();

        employee.name="Vanda";
        employee.salary=200000;

        System.out.println(employee.concat(employee.name, employee.salary));

        employee.increaseSalary(10000);

        System.out.println(employee.concat(employee.name, employee.salary));


        Alkalmazott2 employee2=new Alkalmazott2("Vanda", 300000);
        Alkalmazott2 anotherEmployee=new Alkalmazott2("Nem Vanda", 400000);

        /*employee2.setName("Vanda");
        employee2.setSalary(300000);

        String employeeName=employee2.getName();
        int employeeSalary=employee2.getSalary();*/


        System.out.println(employee2.concat());

        employee2.increaseSalary(20000);
        int newSalary=employee2.getSalary();


        System.out.println(employee2.concat());


        //anotherEmployee.setName("Nem Vanda");
        //anotherEmployee.setSalary(400000);

        int anotherSalary=anotherEmployee.getSalary();

        System.out.println("The salary is between the given bounds: "+employee2.isBetween(100000, 500000));
        System.out.println("The tax is(with 16%): "+ employee2.taxCalculator(newSalary));
        System.out.println("The first employee's salary is greater than the second one's: "+ employee2.isGreaterThan(anotherSalary));

        Alkalmazott2[] employees= arrayFiller();
        for(int i=0;i<employees.length;i++)
        {
            System.out.println(employees[i].concat());
        }

        greatestSalary(employees);

        System.out.println("Number of salaries between the given boundaries: "+ countSalaries(employees, 100000,800000));

        System.out.println("The average of salaries"+ averageSalary(employees));
    }

    public static double averageSalary(Alkalmazott2[] array)
    {
        double sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i].getSalary();
        }
        return sum / (array.length);
    }

    public static int countSalaries(Alkalmazott2[] array, int lower, int upper)
    {
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i].getSalary()>lower && array[i].getSalary()<upper)
            {
                count++;
            }
        }
        return count;
    }

    public static void greatestSalary(Alkalmazott2[] array)
    {
        int max=0;
        int index = 0;
        for(int i=0;i<array.length;i++)
            {
                if(array[i].getSalary()>max)
                {
                    max=array[i].getSalary();
                    index = i;
                }
            }
        System.out.println("The greatest salary belongs to: "+array[index].getName());
    }

    public static Alkalmazott2[] arrayFiller()
    {
        Alkalmazott2[] array= new Alkalmazott2[2];

        System.out.println("Please give me the names and salaries: ");

        for (int i = 0; i < array.length; i++) {
            array[i]=new Alkalmazott2(readName(),readSalary());
        }
        return array;
    }

    public static String readName()
    {
        String inputName=input.nextLine();
        return inputName;
    }

    public static int readSalary()
    {
        int inputSalary=input.nextInt();
        input.nextLine();
        return inputSalary;
    }

}