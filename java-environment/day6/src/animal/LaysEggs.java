package animal;

public interface LaysEggs {
	/*
	 * When you create a method in an interface, it is implicitly
	 * public and abstract
	 * 
	 * If you want to provide a definition for a method in
	 * an interface, you must use the 'default' keyword
	 * 
	 * It is not encouraged to use the 'default' keyword in
	 * an interface, but we do have the ability to do so
	 */
	public default void LayEgg() {
		System.out.println("Laid an Egg - Interface Level");
	}
}
