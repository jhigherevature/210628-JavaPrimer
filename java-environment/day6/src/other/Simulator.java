package other;

import animal.Animal;
import encapsulation.Data;

public class Simulator {
	public static void main(String[] args) {
		
//		Animal anim = new Animal("Animal", "Animal", 5);
//		anim.type = "Animal"; // type is protected - cannot access outside of package
		
		Cat c = new Cat("Charles", 6);
		c.meow();
//		c.type = "Cat"; // protected fields cannot be accessed outside of the child class
		
		System.out.println(Data.pub);
		/*
		 * Outside of a package, I cannot access protected* or default
		 * fields.
		 * 
		 * Note that default level of access does not have a keyword
		 * associated with it.
		 * 
		 * **You can access Protected fields outside of a package if
		 * you establish an inheritance relationship!
		 */
//		System.out.println(Data.pro); // error
//		System.out.println(Data.def); // error
//		System.out.println(Data.pri); // error
	}
}
