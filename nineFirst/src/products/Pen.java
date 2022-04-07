package products;

import java.awt.Color;
import coloring.Colorable;
import coloring.myColor;

public class Pen extends Product implements Colorable{
	
	private Color penColor;
	private String brandName;
	
	public Pen(String brandName, Color penColor, int price)
	{
		super("pen", price, 27);
		this.brandName=brandName;
		this.penColor=penColor;
	}
	
	/*@Override
	public String toString()
	{
		return "Product name: "+penColor+" "+getName()+"\nBrand: "+brandName+"\nPrice: "+getNettoPrice()+"\nVat: "+getVat()+"\n";
	}*/
	
	@Override
	public String toString()
	{
		myColor newColor=new myColor(penColor);
		return "Pen [brand = "+ brandName +", color = "+ newColor+", price = "+grossPrice()+"]\n";
	}
	
	public Color getColor()
	{
		return penColor;
	}
	
	public void setColor(Color givenColor)
	{
		this.penColor=givenColor;
	}

	public Color getPenColor() {
		return penColor;
	}

	public void setPenColor(Color penColor) {
		this.penColor = penColor;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
