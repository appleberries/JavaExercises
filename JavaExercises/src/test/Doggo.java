//Design and implement a class called Dog that contains instance data that represents the dog's name and age.
//Define the Dog constructor to accept and initialize instance data. 
//Include a method to compute and return the age of the dog in "person years" (multiply by 7).
//Include a toString method that returns a one-line description of the dog.
//Create a driver class called Kennel, whose main method instantiates and updates several Dog objects.

package test;

import java.util.Scanner;

public class Doggo {

	public static void main(String[] args) {
		//hardcode using the constructor
		Dog doggo = new Dog("Puto", 3);
		System.out.println(doggo);
		
		//getting user input using setters & getters
		Scanner input = new Scanner(System.in);
		String name;
		int age = 0;
		
		System.out.print("Dog's name and age: ");
		name = input.next();
		age = input.nextInt();
		
		input.close();
		
		Dog doggo2 = new Dog(name, age);
		doggo2.setName(name);
		doggo2.setAge(age);
		
		System.out.println(doggo2);
	}

}
