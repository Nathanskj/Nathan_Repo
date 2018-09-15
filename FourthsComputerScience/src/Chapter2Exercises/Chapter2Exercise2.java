package Chapter2Exercises;

import java.util.Scanner;

public class Chapter2Exercise2 {
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		boolean x = true;
		checkEvenOdd();
		}
		
		
		
	

	public static void checkEvenOdd() {
		Scanner myScanner = new Scanner(System.in);
		float number = myScanner.nextFloat();
		if(number%2==0) 
		{
			System.out.println("That number is even!");
		}
		else
		{
			System.out.println("That number is odd!");
		}



	}
}
