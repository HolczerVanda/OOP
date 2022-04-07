package nineSecond;

public class Product implements Marketable{

	private String name;
	private int nettoPrice;
	private int vat;
	private String currency;
	
	public Product(String name, int nettoPrice, int vat) {
		this.currency=defaultCurrency;
		this.name = name;
		this.nettoPrice = nettoPrice;
		this.vat = vat;
	}
	

	public int compareGrossPrice(Product newPrice)
	{
		if(newPrice.grossPrice()<this.grossPrice())
		{
			return 1;
		}
		else if(newPrice.grossPrice()>this.grossPrice())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	public void increasePrice(int percent)
	{
		nettoPrice+=Math.round(nettoPrice*(float)(percent/100));
	}
	
	public int grossPrice()
	{
		return nettoPrice+Math.round(nettoPrice*(float)(vat/100));
	}
	
	@Override
	public String toString()
	{
		return "Name: "+name+"\nNetto price: "+nettoPrice+"\nVat: "+vat+"\n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return nettoPrice;
	}

	public void setPrice(int price) {
		this.nettoPrice = price;
	}
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency= currency;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}
}