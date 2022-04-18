package myPackage;

public class BankAccount {
	private int accountNumber;
	private int accountBalance;
	
	public BankAccount(int accountNumber)
	{
		this.accountNumber=accountNumber;
		this.accountBalance=0;
	}

	public void increaseBalance(int amount)
	{
		accountBalance+=amount; 
	}
	
	public void decreaseBalance(int amount) throws InsufficientFundsException
	{
		if(amount<=accountBalance)
		{
			accountBalance-=amount; 
		}
		else
		{
			double missingAmount=amount-accountBalance;
			throw new InsufficientFundsException(missingAmount);
		}
		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public int getAccountBalance() {
		return accountBalance;
	}
}
