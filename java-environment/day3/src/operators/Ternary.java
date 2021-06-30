package operators;

public class Ternary {
	public static void main(String[] args) {
		/*
		 * Ternary Syntax: 
		 *  (boolean-expr) ? (expr-return-true) : (expr-return-false)
		 */
		int ter_1 = true ? 45 : 1000;
		int ter_2 = false ? 45 : 1000;
		
		String phrase = ter_1 > ter_2 ? "Ter_1 is greater" : "Ter_2 is greater"; 
		System.out.println(phrase);
		
		int x = 17;
		int y = 25;
		System.out.println("Calculation is: " + ( (x > y) ? (x + 5) : (y + 100)) );
	}
}
