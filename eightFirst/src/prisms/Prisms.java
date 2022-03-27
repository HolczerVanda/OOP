package prisms;

import figures.Cylinder;
import figures.Prism;

public class Prisms {

	private Prism[] prismArray;
	
	public Prisms(int length)
	{
		this.prismArray=new Prism[length];
	}
	
	public void setIndex(int index, Prism givenPrism)
	{
		prismArray[index]=givenPrism;
	}
	
	public int getLength()
	{
		return this.prismArray.length;
	}
	
	public Prism getElement(int index)
	{
		return this.prismArray[index];
	}
	
	public int getNumberOfNotNullElements()
	{
		int cnt=0;
		for (int i = 0; i < prismArray.length; i++) {
			if(prismArray[i]!=null)
			{
				cnt++;
			}
		}
		return cnt;
	}
	
	public double getAverageVolume()
	{
		int sum=0;
		for (int i = 0; i < prismArray.length; i++) {
			if(prismArray[i]!=null)
			{
				sum+=prismArray[i].getVolume();
			}
		}
		if(this.getNumberOfNotNullElements()!=0)
		{
			return sum/this.getNumberOfNotNullElements();
		}
		else
		{
			return 0;
		}
	}
	
	public int getNumberOfCylinders()
	{
		int cnt=0;
		for (int i = 0; i < prismArray.length; i++) {
			if(prismArray[i] instanceof Cylinder)
			{
				cnt++;
			}
		}
		return cnt;
	}
}
