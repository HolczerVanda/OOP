package myPersons;

public class Child extends Person{

	private String school;
	
	public Child(String name, int age, String school) {
		super(name, age);
		this.school=school;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"School: "+school+"\n";
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
