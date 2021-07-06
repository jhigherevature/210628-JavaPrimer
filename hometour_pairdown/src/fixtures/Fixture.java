package fixtures;

/* The Fixture class provides a general structure for various
 * entities that will exist within our project, including the
 * name as well as Short and Long descriptions of the objects.
 */
public abstract class Fixture {
	/*
	 * The name as well as short and long descriptions
	 * are protected so that we provide access within
	 * the specific implementing classes, regardless
	 * of the package they are declared.
	 */
	protected String name;
	protected String shortDesc;
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

	// Overridden toString method
	public String toString() {
		return "Fixture [name=" + name + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + "]";
	}
}
