package methods;

public class DogSimulator {
	public static void main(String[] args) {
		/*
		 * When you create objects from a class, you must invoke
		 * the constructor for that class (following the 'new' keyword)...
		 * 
		 * Note that Java provides you with a constructor if you do
		 * not create your own custom one
		 */
		Dog fido = new Dog();
		fido.name = "Fido";
		fido.age = 3;
		fido.sharedName = "Fido";
		fido.bark();
		System.out.println("Shared Name [fido]: " + fido.sharedName);
		
		Dog scooby = new Dog();
		scooby.name = "Scooby Doo";
		scooby.age = 7;
		scooby.sharedName = "Scooby Doo";
		System.out.println("Shared Name [scooby]: " + scooby.sharedName);
		System.out.println("Shared Name [fido]: " + fido.sharedName);
		
		System.out.println(Dog.sharedName);
		Dog.bark();
		
		System.out.println(fido.name);
		System.out.println(scooby.name);
		scooby.bark();
		scooby.eat("Scooby Snacks");
	}
}
