package scanner;

import java.util.Scanner;

public class ScannerSimulator {
	public static void main(String[] args) {
		
		int value = Integer.parseInt("17");
		System.out.println(value);
		
		double d = Double.parseDouble("99.99");
		value = (int)d; // 99.99 >> 99
		System.out.println(d); // 99.99
		System.out.println(value); // 99
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me Input:");
		
		String input_1 = scan.next();
		String input_2 = scan.next();
		System.out.println("Input_1 was: " + input_1);
		System.out.println("Input_2 was: " + input_2);
		
		System.out.println("Give me a number:");
		int num = scan.nextInt();
		System.out.println("The number you entered was: " + num);
		System.out.println("A caluclation with your number: " + (num * 4));
		
		String line = scan.nextLine();
//		 We actually have a bit of an issue...
		System.out.println("The Line was: " + line);
	}
}
