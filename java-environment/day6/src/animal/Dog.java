package animal;

public class Dog extends Animal {
	
	public Dog (String name, int age) {
		super(name, "Dog", age);
		System.out.println("DOG CLASS CONSTRUCTOR CALLED WITH:"
				+ "\n\tName:"+name
				+ "\n\tAge:" +age);
	}
	
	/*
	 * The following is the implementation for the abstract
	 * method defined in the Animal superclass
	 */
	public void breathe() {
		System.out.println("Dogs usually breathe through their"
				+ " mouths as the pant");
	}
	
	public void eat() {
		System.out.println("Overridden Eat Method - Dog Class");
	}
	
	public void bark() {
		System.out.println("Woof Woof");
	}
}
