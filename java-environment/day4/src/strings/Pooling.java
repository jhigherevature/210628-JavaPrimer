package strings;

public class Pooling {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1);
		System.out.println(s2);
		/*
		 * '==' compares the memory address of objects in the
		 * heap and will return true when two reference variables
		 * are pointing to the exact same location in memory
		 * 
		 * Because String literals are pooled, anytime you reference
		 * a String literal, they will point to the same String
		 * literal reference in the String pool
		 */
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // true
	}
}
