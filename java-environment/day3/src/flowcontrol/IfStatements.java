package flowcontrol;

/*
 * CTRL + SPACE for context menu
 * 
 * Flow Control Statements : Statements that allow you to
 * control the exeuction order of operations in your program
 * 
 * Flow Control statements apply to the immediately following
 * line of code/statement, or the immediately following block
 * of code (inidicated with curly braces {} )
 */
public class IfStatements {
	public static void main(String[] args) {
		/*
		 * if-else statement blocks are mutually exclusive
		 * this means that only one of the blocks of code
		 * in an if-else statement will execute...
		 */
		int x = -5;
		if (x > 0 && x < 15)
			System.out.println("X is between 0 and 15");
		else if (x % 2 == 0) 
			System.out.println("X is even");
		else if (x >= 15)
			System.out.println("X is greater than 15");
		else
			System.out.println("X is less than or equal to 0");

		
		/*
		 * Nested if-statements allow you to place if-else
		 * statement blocks within the executing block of
		 * code for another if-else statement
		 */
		
		int y = 1000;
		if (y > 0) {
			if (y % 2 == 1) {
				System.out.println("Y is a positive odd number");
			} else if(y > 100) {
				System.out.println("Y is a positive even number above 100");
			} else {
				System.out.println("Y is a positive even number below 100");
			}
		} else if (y > 100) {
			// Code is unreachable
			System.out.println("Y is greater than 100");
		} else {
			System.out.println("Y is less than or equal to 0");
		}
		
	}

}
