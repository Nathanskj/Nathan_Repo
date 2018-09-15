package Chapter2Exercises;

import java.util.Scanner;
import java.lang.Math;

public class Chapter2Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinderVolume();
	}

	
public static void cylinderVolume() {
	System.out.println("What is the radius?: ");
	Scanner radius = new Scanner(System.in);
	double radius1 = radius.nextDouble();
	System.out.println("What is the height?: ");
	Scanner height = new Scanner(System.in);
	double height1 = radius.nextDouble();
	System.out.println("The volume of the cylinder is: " + (Math.PI)*Math.pow(radius1, 2) * height1);
}
}
