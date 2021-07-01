package scopes;

/*
 * Scopes are isolated levels of access/data in our programs
 * 
 * There are 4 levels of Scopes:
 * Variables at a class and instance scope share the same pool
 * of names/identifiers. This means that you cannot duplicate
 * the same name for a variable on a class
 * 
 * **Class/Static - Variables that are created using the static
 * 					keyword exist in the class/static scope. These
 * 					variables will exist throughout the lifetime
 * 					of the entire application, since the information
 * 					is bound to the class definition, instead of
 * 					any individual objects 
 * **Instance/Object - Variables within instance scope exist
 * 					so long as the object exists in memory
 * 					and we can access the object via its
 * 					reference variable
 * 
 * Variables within a method (including blocks within that method)
 * have their own pool of variable names. This means that you cannot
 * duplicate the same variable name anywhere in a method, including
 * within a block.
 * **Method - Variables within method scope exist within the
 * 				execution of a method, but are lost once we
 * 				finish method execution, or exit the method
 * 				in some way 
 * **Block - Variables within block scope exist within a flow
 * 			control statement. Note that flow control statements
 * 			must exist within a method's scope. Effectively, block
 * 			scopes are a lower scope than method
 */
public class Data {
	
	public static String staticName;
	public static int staticId;
	
	public String name; // instance scope
	public int id; // instance scope
	
	public void shadow() {
		/*
		 * You can duplicate the name of a variable that exists
		 * at a class/instance scope of a class within a
		 * method in that class
		 * 
		 * 
		 */
		String name = "Name within method shadow";
		String staticName = "StaticName within method shadow";
		
		System.out.println(name);
		System.out.println(staticName);
		
		/*
		 * The 'this' keyword allows you to reference the
		 * object/class in which a method or variable exists.
		 * Effectively, it allows you to disambiguate between
		 * variables in a method that are shadowing variables
		 * at a class/instance level
		 */
		System.out.println(this.name);
		System.out.println(this.staticName);
	}
	
	public double method() {
		double decimal = 100.0;
		
		double sum = decimal + 55.5;
		
		/*
		 * To retain the information of variables created within a method
		 * scope, we must use the return keyword
		 */
		return decimal;
	}
	
	public void other() {
//		double calculation = decimal * 3; // error - decimal does not
											// exist within this method
		int i = 0;
		if (i > 10) {
			String word = "Greater than 10";
			System.out.println(word);
		}
//		System.out.println(word); // we lose access to word once we leave
									// the if-statement
		
		for (int x = 0; x < 5; x++) {
			System.out.println(x);
		}
//		System.out.println(x); // error - we left our for-loop's block scope
	}
}
