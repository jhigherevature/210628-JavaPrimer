package encapsulation;

public class Simulator {
	public static void main(String[] args) {
		System.out.println(Data.pub);
		System.out.println(Data.pro);
		System.out.println(Data.def);
		/*
		 * Private variables/methods are only accessible within
		 * the class they are declared. You cannot access this
		 * information from anywhere else in your project
		 */
//		System.out.println(Data.pri); // error
	}
}
