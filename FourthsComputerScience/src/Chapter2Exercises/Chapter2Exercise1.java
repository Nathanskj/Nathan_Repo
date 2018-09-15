package Chapter2Exercises;

import java.util.Scanner;


public class Chapter2Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number!");
		Scanner myScanner = new Scanner(System.in);
		pizzazz();
		
}

	public static void pizzazz() {
		Scanner myScanner = new Scanner(System.in);
		float a = myScanner.nextFloat();
		if (a%7 ==0)
		{
			System.out.println("Pizzazz!");
		}
		else 
		{
			System.out.println("A tragic number has been entered!");
}
}
}