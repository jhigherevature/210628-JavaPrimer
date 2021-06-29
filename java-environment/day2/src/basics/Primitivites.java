package basics;

public class Primitivites {
	public static void main(String[] args) {
		int i = 9;
		System.out.println(i);
		
		byte b = (byte)1000;
		System.out.println(b);
		
		long l = 10_000_000_000L;
		
		double d = 1000.00;
		float f = 1000.00F;
		
		/*
		 * When converting between datatypes
		 * Java will implicitly (without you stating)
		 * convert a smaller datatype into a larger
		 * variable.
		 * 
		 * You must explicitly use the cast operation
		 * when converting a larger datatype into 
		 * a smaller variable.
		 */
		f = (float)d; // Explicit Casting	
		d = f;	// Implicit Casting
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		
	}
}
