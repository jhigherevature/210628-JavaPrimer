package passbyvalue;

/*
 * When using variables in Java, it is important to keep
 * in mind that Java is considered a 'pass-by-value'
 * programming language.
 * 
 * 'Pass-by-value' - When you provide input to a method (arguments)
 * 					you only ever provide the value that is stored
 * 					within a variable, not a direct reference to
 * 					the variable itself!
 * 
 * 'Pass-by-reference' - Pass-by-reference languages will specifically
 * 					allow you to manipulate the value of a variable
 * 					that is used as an argument to a method, because
 * 					the language specifically passed the reference
 * 					to the method in question
 */
public class Simulator {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(modify(num)); // 20		
		System.out.println(num); // 5
		
		Data d = new Data(100);
		System.out.println(d.id); // 100
		System.out.println(modify(d).id); // 115
		System.out.println(d.id); // 115
	}
	
	public static int modify(int num) {
		num = num + 15;
		return num;
	}
	
	public static Data modify(Data d) {
		d.id = d.id + 15;
		return d;
	}
}
