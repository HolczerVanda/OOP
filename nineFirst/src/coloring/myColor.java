package coloring;

import java.awt.Color;

public class myColor extends Color {
	
	public myColor(Color color)
	{
		super(color.getRed(), color.getGreen(), color.getBlue());
	}
	
	
	@Override
	public String toString()
	{
		if(this.equals(BLUE)) return "kek";
		else if(this.equals(BLACK)) return "fekete";
		else if(this.equals(CYAN)) return "cian";
		else if(this.equals(DARK_GRAY)) return "sotet szurke";
		else if(this.equals(GREEN)) return "zold";
		else if(this.equals(MAGENTA)) return "magenta";
		else if(this.equals(ORANGE)) return "narancs";
		else if(this.equals(PINK)) return "rozsaszin";
		else if(this.equals(RED)) return "piros";
		else if(this.equals(WHITE)) return "feher";
		else if(this.equals(YELLOW)) return "sarga";
		else return "?";
	}

}
