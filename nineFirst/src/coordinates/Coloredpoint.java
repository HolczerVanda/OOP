package coordinates;

import java.awt.Color;

import coloring.Colorable;

public class Coloredpoint extends Point implements Colorable{
	
	private Color newColor;
	
	public Coloredpoint()
	{
		super(0, 0);
		newColor=defaultColor;
	}
	
	public Coloredpoint(Color newColor)
	{
		super(0, 0);
		this.newColor=newColor;
	}

	public Coloredpoint(int x, int y, Color newColor)
	{
		super(x, y);
		this.newColor=newColor;
	}
	
	
	@Override
	public String toString()
	{
		return "x: "+getX()+", y: "+getY()+", color: "+newColor+"\n";
	}
	
	public Color getColor()
	{
		return newColor;
	}
	
	public void setColor(Color givenColor)
	{
		this.newColor=givenColor;
	}

}
