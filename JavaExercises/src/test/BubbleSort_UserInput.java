package test;

import java.util.Scanner;

public class BubbleSort_UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = 0;
		int temp = 0;
		boolean tof = true;
		
		System.out.print("Size of array: ");
		size = input.nextInt();
		
		int[] sort = new int[size];
		
		for(int i = 0; i < sort.length; i++) {
			System.out.println("Index " + (i+1) + ": ");
			sort[i] = input.nextInt();
		}
		
		input.close();
		
		System.out.print("Input: ");
		for(int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
		
		while(tof) {
			tof = false;
			for(int i = 0; i < sort.length - 1; i++) {
				if(sort[i] > sort[i + 1]) {
					temp = sort[i];
					sort[i] = sort[i+1];
					sort[i+1] = temp;
					tof = true;
				}
			}
		}
		
		System.out.println();
		
		System.out.print("Sorted: ");
		for(int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
	}

}
