package myPackage;

public class Main {

	public static void main(String[] args) {
		
		BankAccount myAccount=new BankAccount(13123623);
		myAccount.increaseBalance(100000);
		System.out.println("Balance: "+myAccount.getAccountBalance());
		
		try
		{
			System.out.println("Withdraw 60000");
			myAccount.decreaseBalance(600000);
			System.out.println("Withdraw 50000");
			myAccount.decreaseBalance(50000);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println("There's not enough money, you only have: "+e.getMissingAmount());
			e.printStackTrace();
		}
		
	}

}
