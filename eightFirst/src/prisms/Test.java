package prisms;

import java.util.Scanner;

import figures.Cuboid;
import figures.Cylinder;
import prisms.Prisms;

public class Test {
	
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {

		Prisms prismArray=new Prisms(5);
		
		prismArray.setIndex(0, new Cylinder(5, 3));
		prismArray.setIndex(1, readCuboid());
		prismArray.setIndex(2, readCylinder());
		prismArray.setIndex(3, null);
		prismArray.setIndex(4, readCuboid());
		
		System.out.println();
		
		for (int i = 0; i < prismArray.getLength(); i++) {
			if(prismArray.getElement(i)!=null)
			{
				System.out.println(prismArray.getElement(i).toString());
			}
		}
		
		System.out.println(prismArray.getAverageVolume());
		
		System.out.println(prismArray.getNumberOfCylinders());
	}
	
	public static Cuboid readCuboid()
	{
		Cuboid c=new Cuboid(0, 0, 0);
		boolean ok;
		do
		{
			ok=true;
			System.out.print("Please give the height and the sides: ");
			try
			{
				String row=input.nextLine();
				String[] item=row.split(",");
				c.setHeight(Integer.parseInt(item[0]));
				c.setaSide(Integer.parseInt(item[1]));
				c.setbSide(Integer.parseInt(item[2]));
			}
			catch(Exception e)
			{
				ok=false;
				System.out.println("Incorrect input.");
			}
		}while(!ok);
		return c;
	}

	public static Cylinder readCylinder()
	{
		Cylinder c=new Cylinder(0, 0);
		boolean ok;
		do
		{
			ok=true;
			System.out.print("Please give the height and the radius: ");
			try
			{
				String row=input.nextLine();
				String[] item=row.split(",");
				c.setHeight(Integer.parseInt(item[0]));
				c.setRadius(Integer.parseInt(item[1]));
			}
			catch(Exception e)
			{
				ok=false;
				System.out.println("Incorrect input.");
			}
		}while(!ok);
		return c;
	}
	
}
