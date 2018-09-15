
package Chapter2Exercises;

import java.util.Scanner;
import java.lang.Math;
public class Chapter2Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
coneVolume();
curveArea();
	}
public static void curveArea() {
	System.out.println("What is the height?: ");
	Scanner height = new Scanner(System.in);
	double height1 = height.nextDouble();
	System.out.println("What is the radius?: ");
	Scanner radius = new Scanner(System.in);
	double radius1 = radius.nextDouble();
	double c = Math.pow(height1, 2) + Math.pow(radius1, 2);
	System.out.println("The area is: " + (Math.PI) * (radius1) * (Math.sqrt(c)));
} 

public static void coneVolume() {

	System.out.println("What is the height: ");
	Scanner height = new Scanner(System.in);
	double height1 = height.nextDouble();
	System.out.println("What is the radius?: ");
	Scanner radius = new Scanner(System.in);
	double radius1 = radius.nextDouble();
	System.out.println("The volume is: " + Math.PI * Math.pow(radius1, 3) * (height1 / 3));
}
}
