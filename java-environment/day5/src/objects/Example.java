package objects;

public class Example {
	
	public String name;
	public double value;
	
	public Example (String name, double value) {
		this.name = name;
		this.value = value;
	}
	
	public static void main(String[] args) {
		Example ex1 = new Example("One", 1.0);
		Example ex2 = new Example("Two", 2.0);
		Example ex3 = new Example("One", 1.0);
		
		/*
		 * The println method of PrintStreams (such as
		 * the static 'out' of our System class) will
		 * invoke the toString method on an object
		 * 
		 * By default the toString method of objects will
		 * print a HashCode* of the Object's reference
		 * location.
		 * 
		 * *Hashing information is a fancy way of saying
		 * you will produce a numerical value from some
		 * input. 'Proper' Hashing have a few rules:
		 * 		-Hashes should always produce a unique value
		 * 			for the input received
		 * 		-Hashes should produce a value that is the
		 * 			same length regardless of the initial
		 * 			input
		 */
		System.out.println(ex1);
		System.out.println(ex3);
		System.out.println(ex2);
		
	}
	
	/*
	 * The toString method can be overridden to produce more
	 * insightful information about an object
	 */
	public String toString() {
		return "Example [name="+name+", value=" + value+"]";
	}
}
