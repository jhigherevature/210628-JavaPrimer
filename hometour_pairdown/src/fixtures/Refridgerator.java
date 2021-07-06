package fixtures;

/*
 * An Example of a class which implements the Interactable Interface
 * allowing this object, when created, to be interacted with
 */
public class Refridgerator extends Fixture implements Interactable {
	
	// Parameterized Constructor
	public Refridgerator(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public void interact() {
		// TODO: Implement Method
	}
}
