package flowcontrol;

/*
 * Switch statements are another flow-control statement
 * that allows you to perform different operations/actions
 * based on certain criteria established. For Switch statements
 * we compare the value of a variable against case statements
 * and when a match is found we will execute the code associated
 * with that case statement.
 * 
 * NOTE: Switch statement cases use fall-through logic.
 * This means that once a match is found, we will continue
 * to execute code in ALL proceeding case statements, until
 * we reach a break statement or the end of the switch statement
 * 
 * switch statement syntax:
 * 
 * switch (variable) {
 * case value_1:
 * 		lines of code...
 * 		break;
 * case value_2:
 * 		lines of code...
 * 		break;
 * case value_3:
 * 		lines of code...
 * 		break; 
 * ...
 * default:
 * 		lines of code...
 * 		break;
 * }
 */
public class SwitchStatements {
	public static void main(String[] args) {
		char letter = 'A';
		switch (letter) {
		default:
			// the default case can be included anywhere in a switch statement
			System.out.println("Too many letters");
			break;
		case 'A':
			System.out.println("A for Assembly");
			break;
		case 'B':
			System.out.println("B for Binary");
			break;
		case 'C':
			System.out.println("C for Compiled");
			break;
		}
	}
}
