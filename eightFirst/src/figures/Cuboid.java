package figures;

public class Cuboid extends Prism{

	private double aSide;
	private double bSide;
	
	public Cuboid(int height, double aSide, double bSide) {
		super(height);
		this.aSide=aSide;
		this.bSide=bSide;
	}

	@Override
	public String toString()
	{
		return "Sides: "+aSide+", "+bSide+"\nHeight: "+getHeight()+"\nVolume: "+getVolume()+"\n";
	}
	
	@Override
	double getBaseArea()
	{
		return aSide*bSide;
	}

	public double getaSide() {
		return aSide;
	}

	public void setaSide(double aSide) {
		this.aSide = aSide;
	}

	public double getbSide() {
		return bSide;
	}

	public void setbSide(double bSide) {
		this.bSide = bSide;
	}
}
