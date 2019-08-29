//Design and implement a class called Dog that contains instance data that represents the dog's name and age.
//Define the Dog constructor to accept and initialize instance data. 
//Include a method to compute and return the age of the dog in "person years" (multiply by 7).
//Include a toString method that returns a one-line description of the dog.
//Create a driver class called Kennel, whose main method instantiates and updates several Dog objects.

package test;

public class Dog {
	private String _name;
	private int _age;
	
	public Dog(String name, int age) {
		_name = name;
		_age = age;
	}
	
	//setters
	public void setName(String name) {_name = name;}
	public void setAge(int age) {_age = age;}
	
	//getters
	public String getName() {return _name;}
	public int getAge() {return _age * 7;}
	
	public String toString() {
		return "Dog's name: " + getName() + ". Age in person's year: " + getAge() + ".";
	}
}
