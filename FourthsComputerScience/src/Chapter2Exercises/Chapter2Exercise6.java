package Chapter2Exercises;
import java.util.Scanner;
import java.lang.Math;
public class Chapter2Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinderCurve();
	}
public static void cylinderCurve() {
	System.out.println("What is the height?: ");
	Scanner height = new Scanner(System.in);
	float height1 = height.nextFloat();
	System.out.println("What is the radius?: ");
	Scanner radius = new Scanner(System.in);
	float radius1 = radius.nextFloat();
	System.out.println("The surface area is: " + 2*(Math.PI)*(radius1)*(height1));
	
}
}
