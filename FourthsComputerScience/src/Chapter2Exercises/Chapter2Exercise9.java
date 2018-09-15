package Chapter2Exercises;
import java.util.Scanner;
import java.lang.Math;
public class Chapter2Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pythagoras();
	}
public static void Pythagoras() {
	System.out.println("What is the size of side a?: ");
	Scanner a = new Scanner(System.in);
	double a1 = a.nextDouble();
	System.out.println("What is the size of side b?: ");
	Scanner b = new Scanner(System.in);
	double b1 = b.nextDouble();
	double c = Math.pow(a1, 2)+ Math.pow(b1, 2);
	System.out.println("The hypotenuse is: " + Math.sqrt(c));
}

}
