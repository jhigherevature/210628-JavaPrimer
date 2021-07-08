package generics;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * When you declare the creation of a variable
		 * from a class/interface that uses a generic
		 * You are NOT required to specify a datatype.
		 * However, if you do not provide one, java must
		 * default to the Object type for your new object
		 * created
		 */
		GenericClass<String> gc = new GenericClass<String>("Revature");
		System.out.println(gc.getValue().toLowerCase()); // 'Revature'
		
		GenericClass<Integer> gc_num = new GenericClass<Integer>(5);
		System.out.println(gc_num.getValue());
	}
}
