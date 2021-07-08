package generics;

/*
 * Generics allow you to specify a placeholder for
 * a datatype when creating object later
 */
public class GenericClass<Placeholder> {
	private Placeholder value;
	
	public GenericClass(Placeholder value) {
		this.value = value;
	}
	
	public Placeholder getValue() {
		return value;
	}
}
