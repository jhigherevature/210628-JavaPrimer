package operators;

public class UnaryOperators {
	public static void main(String[] args) {
		System.out.println("POST:");
		int x = 10;
		System.out.println(x); // 10
		System.out.println(x++); // 10
		System.out.println(x); // 11
		
		System.out.println("PRE:");
		int y = 10;
		System.out.println(y); // 10
		System.out.println(++y); // 11
		
		System.out.println("NOT:");
		System.out.println(true); // true
		System.out.println(false); // false
		System.out.println(!true); // false
		System.out.println(!false); // true
	}
}
