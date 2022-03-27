package myproducts;

public class Bread extends Product{

	private double quantity;
	
	public Bread(String name, int nettoPrice, int vat, double quantity) {
		super(name, nettoPrice, vat);
		this.quantity=quantity;
	}

	public static boolean greaterUnitPrice(Bread firstBread, Bread secondBread)
	{
		if(((double)firstBread.grossPrice()/firstBread.getQuantity())>((double)secondBread.grossPrice()/secondBread.getQuantity()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		return "Name: "+getName()+"\nNetto price: "+getNettoPrice()+"\nVat: "+getVat()+"\nUnit price: "+Math.round((double)this.grossPrice()/quantity);
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
}
