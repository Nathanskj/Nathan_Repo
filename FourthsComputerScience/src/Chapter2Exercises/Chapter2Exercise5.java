package Chapter2Exercises;

import java.util.Scanner;
public class Chapter2Exercise5 {
public static void main(String[] args) {
	findTriangleArea();
}
public static void findTriangleArea() {
	System.out.println("Enter the top length");
	Scanner top1 = new Scanner(System.in);
	float top = top1.nextFloat();
	System.out.println("Enter the bottom length");
	Scanner bottom1 = new Scanner(System.in);
	float bottom = bottom1.nextFloat();
	System.out.println("Enter the height length");
	Scanner height = new Scanner(System.in);
	float height2 = height.nextFloat();
	System.out.println("The area of the trapezium is: " + (bottom + top)/2*height2);
}



}
