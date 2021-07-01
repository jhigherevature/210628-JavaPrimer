package constructors;

public class Dog {
	public String name;
	public int age;
	public double weight;
	public String breed;
	
	/*
	 * Constructors do not declare a return type because
	 * constructors cannot return anything. Constructors
	 * must match the name of the class in which it is
	 * declared (this includes the casing)
	 * 
	 * Below is a parameterized constructor
	 */
	public Dog(String name, int age, double weight, String breed) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.breed = breed;
	}
	
	/*
	 * If you do not provide a constructor Java will provide
	 * one for you, known as a default (no-args) constructor.
	 * The default constructor declares no parameters and 
	 * does not perform any actions (seemingly***)
	 * 
	 * ***There is some implicit functionality, that we will
	 * cover later...
	 */
	public Dog() {
		this("Default", 0, 0.0, "No Breed");
	}
}
