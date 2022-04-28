package homero;

public class Homerseklet {
	private double temperature;
	private enum Unit
	{
		CELSIUS,
		KELVIN
	}
	private Unit unit;
	
	public Homerseklet(double temperature, Unit unit) {
		this.temperature = temperature;
		this.unit=unit;
	}
	
	public Homerseklet(double temperature) {
		this.temperature = temperature;
		this.unit=Unit.CELSIUS;
	}
	
	public static double konvHomerseklet(Homerseklet temp, Unit givenUnit)
	{
		if(givenUnit.equals(Unit.CELSIUS))
		{
			if(temp.unit.equals(Unit.CELSIUS))
			{
				return temp.getTemperature();
			}
			else
			{
				return temp.getTemperature()-273.15;
			}
		}
		else
		{
			if(temp.unit.equals(Unit.KELVIN))
			{
				return temp.getTemperature();
			}
			else
			{
				return temp.getTemperature()+273.15;
			}
		}
	}
	
	@Override
	public String toString()
	{
		return "Temperature: "+temperature+" "+unit;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
}
