package tti;

public class Person {
	
	private String name;
	private int weight;
	private double height;
	
	public String concat()
	{
		return "Name: "+name+"\nWeight: "+weight+"\nTTI: "+getLabel();
	}
	
	public double tti()
	{
		return weight/(Math.pow(height,2));
	}
	
	public String getLabel()
	{
		String label;
		if(tti()<18.5)
		{
			label="sovany";
		}
		else if(tti()>25)
		{
			label="kover";
		}
		else
		{
			label="normal";
		}
		return label;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int kg) {
		this.weight = kg;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
