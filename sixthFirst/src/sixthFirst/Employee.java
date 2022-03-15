package sixthFirst;

public class Employee {

	private String name;
	private int age;
	private int salary;
	static int retiringAge=65;
	
	Employee(String name, int age, int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	Employee(String name, int age)
	{
		this(name, age, age*10000);
	}
	
	public static int yearsUntilRetirement(int age)
	{
		int result=retiringAge-age;
		if(result>=0)
		{
			return result;
		}
		else
		{
			return 0;
		}
	}
	
	@Override
	public String toString()
	{
		return "Name: "+name+"\nAge: "+age+"\nSalary: "+salary+"\nYears until retirement: "+yearsUntilRetirement(age);
	}
	
	public Employee moreYears(Employee first, Employee second)
	{
		return yearsUntilRetirement(first.age)>yearsUntilRetirement(second.age) ? first : second;
	}
	
	public static void setNewRetiringAge(int newBound)
	{
		retiringAge=newBound;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static int getRetiringAge() {
		return retiringAge;
	}

	public static void setRetiringAge(int retiringAge) {
		Employee.retiringAge = retiringAge;
	}
}
