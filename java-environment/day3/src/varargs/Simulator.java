package varargs;

public class Simulator {
	public static void main(String... args) {
		int[] numbers = {41,5543,765,98,23};
		printNumbers(numbers);
		printNumbers(5,72,99,41,543,67,2,9);
		printNumbers();
	}
	
	/*
	 * A variable arguments list allows you to pass an arbitrary
	 * number of arguments (that share the same datatype) to a method
	 * When using a variable arguments list, it must be the last parameter
	 * stated in the list of parameters for the method. In addition, each
	 * method can only include a single varargs list..
	 */
	public static void printNumbers(int... values) {
		System.out.println("Invoked Print Numbers [varargs]");
//		for (int i = 0; i < values.length; i++) {
//			System.out.println(values[i]);
//		}
		for (int v : values) {
			System.out.println(v);
		}
	}
	
//	public static void printNumbers(int[] values) {
//		System.out.println("Invoked Print Numbers [array]");
//		for (int v : values) {
//			System.out.println(v);
//		}
//	}
	
	public static void printStrings (String... words) {
		System.out.println("Invoked Print Strings [varargs]");
		for (String w : words) {
			System.out.println(w);
		}
	}
}
