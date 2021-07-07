package animal;

import other.Cat;

public class AnimalSimulator {
	public static void main(String[] args) {
		// Animal class is abstract
//		Animal anim = new Animal("Animal-name", "Animal-type", 10);
//		anim.eat();
//		anim.bark(); // we cannot just use information from a child class...
		
		Dog d = new Dog("Fido", 7);
		d.eat();
//		d.bark();
		
		/*
		 * Below is an example of a 'polymorphic' reference
		 */
		Animal a = new Dog("Scooby Doo", 7);
		/*
		 * The following does not give us a compiler error
		 * because the Dog class exists within the hierarchy
		 * of the Animal class
		 */
		a.eat();
		((Dog)a).bark();
//		((Cat)a).meow(); // unchecked exception
		
		/*
		 * Below does not work, because our Animal class
		 * does not contain (and will not chain constructors
		 * to) the Dog class information
		 */
//		Dog p = new Animal("Peter", "Dog", 6);
		
		double dbl = 10.0;
		int i = (int)dbl;
	}
}
