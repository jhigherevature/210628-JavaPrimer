package scanners;

import java.util.Scanner;

public class ClosingScanner {
	/*
	 * Making a static scanner reference can help with
	 * closing the scanner resource
	 */
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Give me input:");
		
		String value = scan.next();
		System.out.println(value);

		int number = scan.nextInt();
		System.out.println(number);
		
		/*
		 * When closing a scanner, we do not close the
		 * Scanner object, we close the resource associated
		 * with the scanner, in this case, we would close
		 * the static inputStream of our System class
		 */
		scan.close(); // Make sure to close the scanner at the end
	}
}
