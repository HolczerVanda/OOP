package nineSecond;

public class Property implements Marketable{

	int price;
	String currency;
	int size;
	String city;
	
	public Property(int price, int size, String city)
	{
		this.price=price;
		this.currency=defaultCurrency;
		this.size=size;
		this.city=city;
	}
	
	@Override
	public String toString()
	{
		return "City: "+city+"\nSquare metre price: "+this.squareMetrePrice()+" "+currency+"\n";
	}
	
	public int squareMetrePrice()
	{
		return Math.round((float)price/size);
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency= currency;
	}
}
