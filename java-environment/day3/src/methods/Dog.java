package methods;

public class Dog {
	public String name;
	public int age;
	
	public static String sharedName;
	
	public static void bark() {
		System.out.println("Woof Woof");
	}
	
	public void eat(String food) {
		System.out.println(name + " is eating " + food);
	}
}
