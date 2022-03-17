package sixthSecond;

import java.time.LocalDate;

public class Employee {

	private String name;
	LocalDate birthday;
	int age=(LocalDate.now().getYear())-birthday.getYear();
	private int salary;
	static final int retirementAge=65;
	
	private static String[] monthNames;
	static {
		monthNames = new String[13];
		monthNames[0] = " ";
		monthNames[1] = "január";
		monthNames[2] = "február";
		monthNames[3] = "március";
		monthNames[4] = "április";
		monthNames[5] = "május";
		monthNames[6] = "június";
		monthNames[7] = "július";
		monthNames[8] = "augusztus";
		monthNames[9] = "szeptember";
		monthNames[10] = "október";
		monthNames[11] = "november";
		monthNames[12] = "december";
	}
	
	
	public Employee(String name, int year, int month, int day)
	{
		this.name=name;
		this.birthday=LocalDate.of(year, month, day);
		this.salary=10000*(LocalDate.now().getYear())-birthday.getYear();
	}
	
	public Employee(String name, int year, String month, int day)
	{
		this.name=name;
		int monthvalue;
		if(convertMonthName(month)==0)
		{
			monthvalue=1;
		}
		else
		{
			monthvalue=convertMonthName(month);
		}
		this.birthday=LocalDate.of(year, monthvalue, day);
		this.salary=10000*(LocalDate.now().getYear())-birthday.getYear();
	}
	
	public String convertMonthValue(int monthvalue) {
		return monthNames[monthvalue];
	}

	public int convertMonthName(String monthname) {
		for(int i=1; i<monthNames.length; i++) {
			if (monthNames[i].equalsIgnoreCase(monthname))
				return i;
		}
		return 0;
	}
	
	public static int yearsUntilRetirement(int age)
	{
		int result=retirementAge-age;
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
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}*/

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static int getRetiringAge() {
		return retirementAge;
	}
}