package test;

import figures.Cylinder;
import figures.Cuboid;

public class Test {

	public static void main(String[] args) {
		
		Cylinder myCylinder=new Cylinder(5, 3);
		System.out.println(myCylinder.toString());

		Cuboid myCuboid=new Cuboid(5, 2, 4);
		System.out.println(myCuboid.toString());
		
		if(myCylinder.greaterVolume(myCuboid))
		{
			System.out.println("The cylinder's volume is greater");
		}
		else if(myCuboid.greaterVolume(myCylinder))
		{
			System.out.println("The cuboid's volume is greater.");
		}
	}

}
