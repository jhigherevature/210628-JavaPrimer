package animal;

/*
 * You can use the 'extends' keyword in a class to 
 * inherit from another class
 * 
 * You can use the 'implements' keyword in a class
 * to inherit from an interface
 */
public class Sparrow extends Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("The Sparrow is flying");
	}
}
