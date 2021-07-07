package exceptions;

public class Simulator {
	public static void main(String[] args) {
		try {
			// startApplication();
			sumOddNumbers(2,1);
		} catch (EvenNumberException e) {
			System.out.println("Oops");
			performMoreActions();
			// startAppliction();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/*
			 * Finally block in a try-catch block can optionally be
			 * included at the end, to execute some clean-up code or
			 * functionality that you always want to occur. The 
			 * Finally block will ALWAYS execute, except for a few
			 * situations:
			 * 1 - Calling System.exit(0); 
			 * 2 - Catastrophic System Failure
			 */
			System.out.println("Finally will almost always execute");
		}
	}
	
	public static int sumOddNumbers(int a, int b) throws EvenNumberException {
		if (a % 2 == 0) {
			throw new EvenNumberException("First Argument was Even");
		} else if (b % 2 == 0) {
			throw new EvenNumberException("Second Argument was Even");
		}
		
		System.out.println(a+b);
		return a+b;
	}
	
	public static void performMoreActions() {
		System.out.println("Our code can continue here...");
	}
}
