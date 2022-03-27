package figures;

public class Cylinder extends Prism{
	
	private double radius;
	
	public Cylinder(int height, double radius){
		super(height);
		this.radius=radius;
		
	}
	
	@Override
	public String toString()
	{
		return "Radius: "+radius+"\nHeight: "+getHeight()+"\nVolume: "+getVolume()+"\n";
	}
	
	@Override
	double getBaseArea()
	{
		return Math.pow(radius, 2)*3.14159265359;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
