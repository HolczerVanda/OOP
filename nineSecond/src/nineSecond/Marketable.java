package nineSecond;

public interface Marketable {
	
	int defaultPrice=1;
	String defaultCurrency="Ft";
	
	public int getPrice();
	public void setPrice(int price);
	
	public String getCurrency();
	public void setCurrency(String currency);
}
