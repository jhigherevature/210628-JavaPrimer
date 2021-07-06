package animal;

/* The abstract keyword allows you to define a
 * framework for information that more closely
 * resembles our understanding of some idea, or
 * can provide a basis in which we can create
 * concrete examples/data from
 * 
 * The abstract keyword provides two major functions
 * 1 - It prevents you from creating an object
 * from a class directly.
 * 2 - When used with a class, it enables you to
 * declare abstract methods.
 */
public abstract class Animal {
	public String name;
	protected String type;
	int age;
	
	public abstract void breathe();
	
	public Animal (String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
		System.out.println("ANIMAL CLASS CONSTRUCTOR CALLED WITH:"
				+ "\n\tName:"+name
				+ "\n\tType:"+type
				+ "\n\tAge:" +age);
	}
	
	public void eat() {
		System.out.println(name + " is eating - nom nom");
	}
}
