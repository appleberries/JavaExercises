package test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to calculate its factorial: ");
		System.out.println("Factorial: " + factorial(input.nextInt()));
		
		input.close();
	}
	
	public static int factorial(int num) {
		int result = 1;
		for(int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}

}
