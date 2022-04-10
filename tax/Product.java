package tax;

public abstract class Product implements Taxable{
	
	
	private String name;
	private int nettoPrice;
	private int taxPercent;
	private String currency="Ft";
	
	
	public Product(String name, int nettoPrice, int taxPercent) {
		this.name = name;
		if(nettoPrice>=0)
		{
			this.nettoPrice = nettoPrice;
		}
		else if(nettoPrice<0)
		{
			this.nettoPrice=0;
		}
		
		if(taxPercent>=0)
		{
			this.taxPercent = taxPercent;
		}
		else if(taxPercent<0)
		{
			this.taxPercent=Taxable.taxPercent;
		}
	}

	public static int comparePrice(Product p1, Product p2)
	{
		if(p1.getTaxedValue()>p2.getTaxedValue())
		{
			return 1;
		}
		else if(p1.getTaxedValue()<p2.getTaxedValue())
		{
			return 2;
		}
		else
		{
			return 0;
		}
	}
	
	
	abstract int getUnitPrice();
	
	public static void changeCurrency(Product[] products, String targetCurrency)
	{
		for (int i = 0; i < products.length; i++) {
			if(!(products[i].getCurrency().equalsIgnoreCase(targetCurrency)))
			{
				Product.convertCurrency(products[i]);
			}
		}
	}
	
	@Override
	public String toString()
	{
		return "Name: "+name+"\nNetto price: "+nettoPrice+"\nVat: "+taxPercent+"\nGross price: "+getTaxedValue()+"\n";
	}
	
	public double getTaxedValue()
	{
		return nettoPrice+Math.round(nettoPrice*(float)(getTax()/100));
	}
	
	public void setTax(double newTax)
	{
		if(newTax>0)
		{
			this.taxPercent=(int)newTax;
		}
		else
		{
			this.taxPercent=Taxable.taxPercent;
		}
	}
	
	public double getTax()
	{
		return (double)taxPercent;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNettoPrice() {
		return nettoPrice;
	}


	public void setNettoPrice(int nettoPrice) {
		this.nettoPrice = nettoPrice;
	}

	public String getCurrency() {
		return currency;
	}

	public static void convertCurrency(Product item)
	{
		if(item.getCurrency().equalsIgnoreCase("Euro"))
		{
			item.setNettoPrice(item.getNettoPrice()*300);
			item.setCurrency("Ft");
		}
		else if(item.getCurrency().equalsIgnoreCase("Ft"))
		{
			item.setNettoPrice(Math.round((float)item.getNettoPrice()/300));
			item.setCurrency("Euro");
		}
	}
	
	public void setCurrency(String currency) {
		if(currency.equalsIgnoreCase("Euro") || currency.equalsIgnoreCase("Ft"))
		{
			this.currency = currency;
		}
	}

}
