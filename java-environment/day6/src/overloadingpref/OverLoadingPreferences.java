package overloadingpref;

public class OverLoadingPreferences {
	public static void main(String[] args) {
		method(5,25);
	}
	
	public static void method(int a) {
		System.out.println("Int");
	}
	
	public static void method(int a, int b) {
		System.out.println("Two Ints");
	}
	
	public static void method(long l) {
		System.out.println("Long");
	}
	
	public static void method(int... i) {
		System.out.println("Var Args");
	}
}
