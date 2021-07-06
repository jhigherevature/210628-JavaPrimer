package animal;

public class Bird extends Animal implements LaysEggs {

	public Bird(String name, String type, int age) {
		super(name, type, age);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * The following no-args constructor is for the ease
	 * of this example
	 */
	public Bird () {
		super("Bird", "Bird", 0);
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LayEgg() {
		// TODO Auto-generated method stub
		
	}

}
