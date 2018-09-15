package Chapter2Exercises;

import java.util.Scanner;
public class Chapter2Exercise3 {
public static void main(String[] args) {
	findTriangleArea();
}
public static void findTriangleArea() {
	System.out.println("Enter the base length");
	Scanner base = new Scanner(System.in);
	float base1 = base.nextFloat();
	System.out.println("Enter the height length");
	Scanner height = new Scanner(System.in);
	float height1 = height.nextFloat();
	System.out.println("The area of the triangle is: " + 0.5 * base1 * height1);
}



}

