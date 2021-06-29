package operators;

public class BinaryOperators {
	public static void main(String[] args) {
//		float d = 10.0f/3.0f;
//		System.out.println(d);
//		
//		/*
//		 * 10 / 3 leaves a remainder of 1. This 1 is
//		 * returned from the '%' (modulus) operator
//		 */
//		double m = 10.0 % 3.0;
//		System.out.println(m);
//		
//		
//		System.out.println("Logical Operators:");
//		System.out.println("AND");
//		System.out.println(true & true); // true
//		System.out.println(true & false); // false
//		System.out.println(false & true); // false
//		System.out.println(false & false); // false
//		
//		System.out.println("OR");
//		System.out.println(true | true); // true
//		System.out.println(true | false); // true
//		System.out.println(false | true); // true
//		System.out.println(false | false); // false
		
		
		System.out.println(
				// false				 // true
				printAndReturnFalse() && printAndReturnTrue()
				);
		
		System.out.println(
				// true					// false
				printAndReturnTrue() || printAndReturnFalse()
				);
	}
	
	public static boolean printAndReturnFalse() {
		System.out.println("This method returns false!");
		return false;
	}
	
	public static boolean printAndReturnTrue() {
		// asks for user input
		System.out.println("This method returns true!");
		return true;
	}
}
