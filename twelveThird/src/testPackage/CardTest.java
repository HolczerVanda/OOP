package testPackage;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

import myPackage.Card;
import myPackage.Card.Bank;
import myPackage.CreditCard;
import myPackage.NotEnoughMoneyException;

public class CardTest {
	
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) throws Exception {
	
	int size=readInt();
	
	Card[] cards=new Card[size];
	
	cards[0]= new CreditCard("Kiss Tamas", LocalDate.parse("2020-04-30"), parseBank("OTP"), 150000, 100000);
	cards[1]= new Card("Nagy Levente", LocalDate.parse("2022-05-31"), parseBank("ERSTE"), 100000);
	cards[2]= new CreditCard("Szabo Laszlo", LocalDate.parse("2019-03-31"), parseBank("OTP"), 200000, 100000);
	cards[3]= new Card("Kovacs Edit", LocalDate.parse("2021-01-31"), parseBank("CIB"), 250000);
	
	wasSuccessfulCredit((CreditCard)cards[0], 280000);
	wasSuccessfulNoCredit(cards[1], 80000);
	wasSuccessfulCredit((CreditCard)cards[2], 50000);
	wasSuccessfulNoCredit(cards[3], 100000);
	
	countCIB(cards);
	
	Arrays.sort(cards);
	
	displayCards(cards);
	
	for (int i = 0; i < cards.length; i++)
	{
		cards[i].charge(cards[i].getCardUsage());
	}
	
	}
	
	public static void displayCards(Card[] cards)
	{
		for (int i = 0; i < cards.length; i++)
		{	
			System.out.println(cards[i].toString());
		}
	}
	
	public static void countCIB(Card[] cards)
	{
		int cnt=0;
		for (int i = 0; i < cards.length; i++) {
			if(cards[i].getBank().equals(Bank.CIB))
			{
				cnt++;
			}
		}
		if(cnt!=0)
		{
			if(cnt==1)
			{
				System.out.println("\nThere is "+cnt+" CIB bank account\n");
			}
			else
			{
				System.out.println("\nThere are "+cnt+" CIB bank accounts\n");
			}
		}
		else
		{
			System.out.println("\nThere is no CIB bank account\n");
		}
	}
	
	public static void wasSuccessfulNoCredit(Card person, int amount) throws NotEnoughMoneyException
	{
		if(person.withdraw(amount))
		{
			System.out.println(amount+" Sikeres Uj egyenleg: "+ person.getBalance());
		}
		else
		{
			System.out.println(amount+" Sikertelen Uj egyenleg: "+ person.getBalance());
		}
	}
	
	public static void wasSuccessfulCredit(CreditCard person, int amount) throws NotEnoughMoneyException
	{
		if(person.withdraw(amount))
		{
			System.out.println(amount+" Sikeres Uj egyenleg: "+ person.getBalance()+" Hitelkeret: "+person.getCreditLimit());
		}
		else
		{
			System.out.println(amount+" Sikertelen Uj egyenleg: "+ person.getBalance()+" Hitelkeret: "+person.getCreditLimit());
		}
	}
	
	public static Card.Bank parseBank(String bank) throws Exception
	{
		for(var parsed : Card.Bank.values())
		{
			if(parsed.toString().equalsIgnoreCase(bank))
			{
				return parsed;
			}
		}
		throw new Exception("Unknown Bank");
	}
	
	public static int readInt()
	{
		System.out.println("Please give the number of credit cards(1-10): ");
		Integer number=0;
		while(true)
		{
			if(input.hasNextInt())
			{
				number=input.nextInt();
				if(number<10 && number>0)
				{
					input.nextLine();
					return number;
				}
				else
				{
					System.out.println("Incorrect input");
					input.nextLine();
				}
			}
			else
			{
				System.out.println("Incorrect input");
				input.nextLine();
			}
		}
	}
	
}
