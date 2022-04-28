package myPackage;

public interface Chargeable {
	
	boolean charge(int cardUsage) throws NotEnoughMoneyException;

}
