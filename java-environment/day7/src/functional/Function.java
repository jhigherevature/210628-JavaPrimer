package functional;

/*
 * The '@FunctionalInterface' annotation can help maintain
 * the structure of your Functional Interfaces by providing
 * compilation errors when multiple methods are detected in
 * an interface.
 * 
 * Functional Interfaces are simply interfaces that only have
 * a single abstract method
 */
@FunctionalInterface
public interface Function {
	public void method();
}
