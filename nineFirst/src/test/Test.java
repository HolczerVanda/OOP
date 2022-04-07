package test;

import java.awt.Color;

import coloring.Colorable;
import coordinates.Coloredpoint;
import products.Pen;

public class Test {

	public static void main(String[] args) {
		
		Colorable dot=new Coloredpoint();
		System.out.println(dot.toString());
		
		dot.setColor(Color.BLACK);
		System.out.println(dot.toString());
		
		
		Colorable pen=new Pen("Zebra", Color.BLUE, 350);
		System.out.println(pen.toString());
		
		pen.setColor(Color.GREEN);
		System.out.println(pen.toString());
		
		Colorable.setDefaultColor(dot);
		Colorable.setDefaultColor(pen);
		
		System.out.println(dot.toString());
		System.out.println(pen.toString());

	}

}
