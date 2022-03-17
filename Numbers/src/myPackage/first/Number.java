package myPackage.first;

public class Number {
	private static final double tolerance=0.001;
	private double realNumber;
	
	public Number(double realNumber)
	{
		this.realNumber=realNumber;
	}
	
	public boolean difference(double givenNumber)
	{
		if(Math.abs(realNumber-givenNumber)<tolerance)
		{
			return true;
		}
		return false;
	}
	
	public double getRealNumber() {
		return realNumber;
	}

	public void setRealNumber(double realNumber) {
		this.realNumber = realNumber;
	}
}
