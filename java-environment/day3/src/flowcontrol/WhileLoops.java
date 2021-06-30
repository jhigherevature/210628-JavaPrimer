package flowcontrol;

/*
 * Loops are structures that allow you to repeat some isolated
 * set of statements until a condition is no longer true
 */
public class WhileLoops {
	public static void main(String[] args) {
		System.out.println("Start of Application");
		/*
		 * While loops are one of the most basic looping structures
		 * they will execute code so long as a condition is true
		 */
		int x = 0;
		while (x < 10) {
			System.out.println(x);
			x++;
		}
		
		System.out.println("Outside of While loop: " + x);
		
		/*
		 * do-while loops are similar to while-loops. They will
		 * execute code so long as a condition is true, however
		 * they will always execute the associated code at least
		 * one time prior to checking the condition
		 */
		x = 0;
		do {
			System.out.println(x);
			x++;
		} while(x < 10);
		
		System.out.println("Outside of do-while loop: " + x);
		
		System.out.println("End of Application");
	}
}
