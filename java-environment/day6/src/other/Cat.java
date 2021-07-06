package other;

import animal.Animal;

public class Cat extends Animal {
	
	public Cat (String name, int age) {
		super(name, "Cat", age);
	}
	
	public void meow() {
		/*
		 * Protected fields can be accessed from within the child class
		 * as if it were written in the child class
		 */
//		this.age = 7; // cannot access default fields
		this.type = "Cat";
		System.out.println(name + " is meowing");
	}

	/* Annotations (beginning with an '@') are descriptive
	 * meta-data tags (meta-data : information about a system/tool)
	 * that can apply some functionality to our program.
	 * 
	 * The '@Override' annotation can help distinguish between
	 * methods that are declared directly within a class
	 * and those that were inherited by the class from a parent
	 */
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}
}
