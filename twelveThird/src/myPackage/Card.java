package myPackage;

import java.time.LocalDate;

public class Card implements Comparable<Card>, Chargeable{
	private String ownerName;
	private LocalDate expiresAt;
	public enum Bank
	{
		OTP,
		KnH,
		ERSTE,
		CIB
	}
	Bank bank;
	private int balance;
	private int cardUsage;
	
	public Card(String ownerName, LocalDate expiresAt, Bank bank, int balance)
	{
		this.ownerName=ownerName;
		this.expiresAt=expiresAt;
		this.bank=bank;
		this.balance=balance;
		switch(bank)
		{
		case CIB:
			cardUsage=1500;
			break;
		case ERSTE:
			cardUsage=1620;
			break;
		case KnH:
			cardUsage=1430;
			break;
		case OTP:
			cardUsage=1580;
			break;
		}
	}
	
	public boolean withdraw(int amount) throws NotEnoughMoneyException
	{
		if(amount>balance)
		{
			throw new NotEnoughMoneyException();
		}
		else if(!(expiresAt.isBefore(LocalDate.now())))
		{
			return false;
		}
		else
		{
			balance-=amount;
			return true;
		}
	}

	@Override
	public String toString()
	{
		return "Owner: "+getOwnerName()+"\nExpiration date: "+getExpiresAt()+"\nBank: "+getBank()+"\nBalance: "+getBalance()+"\n";
	}

	public String getOwnerName() {
		return ownerName;
	}

	public LocalDate getExpiresAt() {
		return expiresAt;
	}

	public Bank getBank() {
		return bank;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getCardUsage() {
		return cardUsage;
	}

	@Override
	public int compareTo(Card card) {
		if (card.expiresAt.isBefore(expiresAt))
		{
			return 1;
		}
		else if (card.expiresAt.isAfter(expiresAt))
		{
			return -1;
		}
		return 0;
	}

	@Override
	public boolean charge(int cardUsage) throws NotEnoughMoneyException {
		
		return withdraw(cardUsage);
	}
}
