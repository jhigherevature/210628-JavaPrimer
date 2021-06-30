package flowcontrol;

/*
 * For-loops are a slightly more complex looping structure. They
 * provide us with more nuanced control over the execution of code
 * within our loop.
 * 
 * For loops are comprised of three statements:
 *  1 - Initialization statement - A statement that will execute one time
 *  								prior to our loop's execution 
 *  2 - Conditional statement - A statement that will be evaluated prior
 *  							to executing our looping code
 *  3 - Update/Modification statement - A statement that will execute at
 *  								the end of each cycle of our loop
 *  
 *  for (intilization; condition; update) {
 *  		//code...
 *  }
 */
public class ForLoops {
	public static void main(String[] args) {
		System.out.println("Start of Application");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int y = 0;
		for (int z = 1000; y < 5; --z) {
			System.out.println("y is:" + y + ", z is: " + z);
			y++;
		}
		
		String word = "Program";
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
		System.out.println("End of Application");
	}
}
