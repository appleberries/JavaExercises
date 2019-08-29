package test;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int rows = 0;
		
		System.out.print("Enter the rows of the pyramid: ");
		rows = input.nextInt();
		
		input.close();
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
