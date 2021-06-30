package methods;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * Invoking a method involves stating the name
		 * of a declared method, followed by parenthesis, and
		 * and required arguments if parameters are specified
		 * 
		 * i.e., we want to method to actually perform its
		 * functionality!
		 * 
		 * we can only invoke methods within other methods, from
		 * an object that has been created OR when assigning 
		 * values to some instance variables in
		 * specific cases...
		 */
		printStuff("One", 1, true, "Other String");
		printStuff("Revature!", 16, false, "programming");
		
		int value = combine(15,5);
		System.out.println(value);
	}
	
	/*
	 * Declaring a method involves stating the access-level, 
	 * specifiers (non-access modifiers), return type, name, 
	 * parameter list and exception list, and the associated
	 * statements within the method body 
	 */
	public static void printStuff(String input, int num, boolean checker, String otherInput) {
		System.out.println("This printed from my printStuff method");
		System.out.println("Your number was: " + num);
		System.out.println("Your input was: " + input);
		System.out.println("Your otherInput was: " + otherInput);
		System.out.println("Your boolean was: " + checker);
	}
	
	/*
	 * The parameter list allows you to specify placeholders
	 * for information we can provide to our methods when invoking
	 * them.
	 * 
	 * Parameters - the name of the placeholder when declaring a method
	 * Argument - the name of the values/expressions provided to a method
	 * 		when invoking the method
	 */
	public static int combine(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
