package figures;

abstract public class Prism {

	private int height;

	public Prism(int height) {
		this.height = height;
	}

	public boolean greaterVolume(Prism newPrism)
	{
		if(this.getVolume()>newPrism.getVolume())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double getVolume()
	{
		return height*this.getBaseArea();
	}
	
	abstract double getBaseArea();
	
	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}
}
