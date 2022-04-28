package myPackage;

import java.time.LocalDate;

public class CreditCard extends Card{
	
	private int creditLimit;
	
	public CreditCard(String ownerName, LocalDate expiresAt, Bank bank, int balance)
	{
		super(ownerName, expiresAt, bank, balance);
		this.creditLimit=100000;
	}
	
	public CreditCard(String ownerName, LocalDate expiresAt, Bank bank, int balance, int creditLimit)
	{
		super(ownerName, expiresAt, bank, balance);
		this.creditLimit=creditLimit;
	}
	
	@Override
	public boolean withdraw(int amount) throws NotEnoughMoneyException
	{
		if(!(getExpiresAt().isBefore(LocalDate.now())))
		{
			return false;
		}
		else if(amount<(getBalance()+creditLimit))
		{
			if(amount>getBalance())
			{
				setBalance((getBalance()+creditLimit)-amount);
				return true;
			}
			else
			{
				setBalance(getBalance()-amount);
				return true;
			}
		}
		else
		{
			throw new NotEnoughMoneyException();
		}
	}
	
	@Override
	public boolean charge(int cardUsage) throws NotEnoughMoneyException 
	{
		int additionalFee=0;
		switch(bank)
		{
		case CIB:
			additionalFee=1500;
			break;
		case ERSTE:
			additionalFee=1620;
			break;
		case KnH:
			additionalFee=1430;
			break;
		case OTP:
			additionalFee=1580;
			break;
		}
		return withdraw(cardUsage+additionalFee);
	}
	
	@Override
	public String toString()
	{
		return "Owner: "+getOwnerName()+"\nExpiration date: "+getExpiresAt()+"\nBank: "+getBank()+"\nBalance: "+getBalance()+"\nCredit limit: "+getCreditLimit()+"\n";
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
}
