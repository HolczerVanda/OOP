package fourthLesson;

public class Alkalmazott2 {

	private String name;
	private int salary;
	
	public void increaseSalary(int extent)
	{
		salary+=extent;
	}
	
	public String concat(String name, int salary)
	{
		String salaryString=Integer.toString(salary);
		String concated=name.concat(salaryString);
		return concated;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	public Integer getSalary()
	{
		return this.salary;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	
	public boolean isBetween(int min, int max)
	{
		if(salary>min && salary<max)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double taxCalculator(int salary)
	{
		double tax=(double)salary*0.16;
		return tax;
	}
	
	public boolean isGreaterThan(int anotherSalary)
	{
		if(salary>anotherSalary)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
