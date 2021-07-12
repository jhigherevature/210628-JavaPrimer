package fixtures;

public abstract class Fixture {
	// Name of the room. i.e. "Foyer", "Kitchen", "Garage"...
	protected String name;
	
	// Short description of room. "A Large Foyer", "A Modern Kitchen"...
	protected String shortDesc;
	
	// Long description of room. "This kitchen has oak cabinets, a stainless steel fridge..."
	protected String longDesc;
	
	// Parameterized Constructor
	public Fixture(String name, String shortDesc, String longDesc) {
		super();
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}

	// Getters and Setters:
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	// Overriden toString method
	public String toString() {
		return "Fixture [name=" + name + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + "]";
	}
}
