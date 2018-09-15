package Chapter2Exercises;
import java.util.Scanner;
import java.lang.Math;

public class Chapter2Exercise8 {
	public static void main(String[] args) {
degreesRadians();
	}
public static void degreesRadians() {
	System.out.println("Enter the amount of degrees: ");
	Scanner degrees = new Scanner(System.in);
	double degrees1 = degrees.nextDouble();
	System.out.print("Radians: "+ (degrees1)*(Math.PI) / (180));
}
}
