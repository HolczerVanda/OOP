package tax;

public interface Taxable {
	
	int taxPercent=27;
	
	abstract void setTax(double newTax);
	
	abstract double getTax();
	
	abstract double getTaxedValue();

}
