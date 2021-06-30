package methods;

public class MethodOverloading {
	public static void main(String[] pineapple) {
		method();
		method("Hi there!");
	}
	
	/*
	 * Method Overloading: Java (as well as other programming languages)
	 * allow you to declare multiple methods that share the same name.
	 * So long as the methods can be distinguished based on their parameter
	 * list, multiple methods, that share a name can exist within the same class
	 * 
	 * We can distinguish between method signatures based on the amount, type
	 * and order of parameters declared
	 */
	public static void method() {
		System.out.println("This method takes no arguments");
	}
	
	public static void method(int num) {
		System.out.println("This method takes 1 int parameter: " + num);
	}
	
	public static void method(String input) {
		System.out.println("This method takes 1 String parameter: " + input);
	}
	
	public static void method(String word, int num) {
		System.out.println("This methods takes 2 parameters. String and Int");
	}
	
	public static void method(int num, String word) {
		System.out.println("This methods takes 2 parameters. String and Int");
	}
}
