package myClasses;

public class Student extends Person{
	
	String neptunCode;
	
	public Student(String name, String neptunCode) {
		super(name);
		this.neptunCode=neptunCode;
	}

	
	@Override
	public String toString() {
		return "Name: "+name+"\nNeptun code: " + neptunCode + "\n";
	}

	public String getNeptunCode() {
		return neptunCode;
	}

	public void setNeptunCode(String neptunCode) {
		this.neptunCode = neptunCode;
	}

}
