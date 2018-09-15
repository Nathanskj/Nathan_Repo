package Chapter2Exercises;
import java.util.Scanner;
public class Chapter2Exercise4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findParaArea();
	}
public static void findParaArea() {
	System.out.println("Enter the height length");
	Scanner height = new Scanner(System.in);
	float height1 = height.nextFloat();
	System.out.println("Enter the base length");
	Scanner base = new Scanner(System.in);
	float base1 = base.nextFloat();
	System.out.println("the area is: "  + base1 * height1);
	
	
	
}
}
