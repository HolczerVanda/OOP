package tenFirst;

import java.util.Comparator;

public class UniversityEmployee extends Employee /*implements Comparable<UniversityEmployee>*/{

	private Position post;
	private static int basicSalary=500000;
	
	public UniversityEmployee(String name, int age, String workplace, Position post)
	{
		super(name, age, workplace, 0);
		this.post=post;
		switch(post)
		{
			case PROF : setSalary(basicSalary);
						break;
			case TUTOR : setSalary(basicSalary*50/100);
						break;
			case ADMIN : setSalary(basicSalary*30/100);
						break;
		}
	}
	
	static class PositionSorter implements Comparator<UniversityEmployee>
	{
		@Override
		public int compare(UniversityEmployee first, UniversityEmployee second)
		{
			return first.getPost().compareTo(second.getPost());
		}
	}
	
	
	enum Position {
		PROF,
		TUTOR,
		ADMIN
	}
	
	@Override
	public String toString()
	{
		return "Name: " + getName() + "\nAge=" + getAge() + "\nWorkplace: "+getWorkplace()+"\nSalary: "+getSalary()+"\nPost: "+post+"\nBasic salary: "+basicSalary+"\n";
	}

	public Position getPost() {
		return post;
	}

	public void setPost(Position post) {
		this.post = post;
	}

	public static int getBasicSalary() {
		return basicSalary;
	}

	public static void setBasicSalary(int basicSalary) {
		UniversityEmployee.basicSalary = basicSalary;
	}
	
}
