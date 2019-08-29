package test;

import java.util.Scanner;

public class Factorial_Recursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to calculate its factorial: ");
		System.out.println("Factorial: " + factorialRecursion(input.nextInt()));
		
		input.close();
	}
	
	public static int factorialRecursion(int num) {
		if(num <= 1)
			return 1;
		else
			return num * factorialRecursion(num - 1);
	}

}
