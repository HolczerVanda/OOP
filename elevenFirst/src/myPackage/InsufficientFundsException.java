package myPackage;

public class InsufficientFundsException extends Exception{

	private double missingAmount;
	
	InsufficientFundsException(double missingAmount)
	{
		this.missingAmount=missingAmount;
	}

	public double getMissingAmount() {
		return missingAmount;
	}
}
