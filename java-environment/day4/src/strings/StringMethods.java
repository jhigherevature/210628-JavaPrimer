package strings;

public class StringMethods {
	public static void main(String[] args) {
		String phrase = "Programming is Fun... Sometimes!";
		
		System.out.println(phrase.charAt(0));
		String camel = "";
		for (int i = 0; i < phrase.length(); i++) {
			if (i % 2 == 0)
				camel += phrase.substring(i,i+1).toUpperCase();
			else
				camel += phrase.substring(i, i+1);			
		}
		System.out.println(camel);
		
		System.out.println(phrase.indexOf('g'));
		System.out.println(phrase.indexOf("is"));
		
		System.out.println(phrase.toUpperCase());
		System.out.println(phrase.toLowerCase());
		System.out.println(phrase);
		
		/*
		 * The split method can be useful when parsing user input
		 */
		String[] words = phrase.split(" ");
		for (String w : words) {
			System.out.println(w);
		}
		
		String upper = phrase.toUpperCase();
		System.out.println(phrase.equals(upper)); // false
		System.out.println(phrase.equalsIgnoreCase(upper)); // true
		
		String equivalent = new String("Programming is Fun... Sometimes!");
		System.out.println(phrase == equivalent); // false
		System.out.println(phrase == equivalent.intern()); // true
		System.out.println(phrase.equals(equivalent)); // true
		
		// Change a String Object to a Pooled String literal:
		equivalent = equivalent.intern();
		
		// Change a Pooled String literal to a String Object:
		phrase = new String(phrase);
	}
}
