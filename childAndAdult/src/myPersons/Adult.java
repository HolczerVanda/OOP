package myPersons;

public class Adult extends Person{

	private String workplace;
	
	public Adult(String name, int age, String workplace) {
		super(name, age);
		this.workplace=workplace;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"School: "+workplace+"\n";
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
}
