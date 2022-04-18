package tenFirst;

public class Employee extends Person{
	
	private String workplace;
	private int salary;
	
	public Employee(String name, int age, String workplace, int salary)
	{
		super(name, age);
		this.workplace=workplace;
		this.salary=salary;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + getName() + "\nAge=" + getAge() + "\nWorkplace: "+workplace+"\nSalary: "+salary+"\n";
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
