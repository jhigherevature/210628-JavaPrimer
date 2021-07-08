package iteration;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteration {
	public static void main(String[] args) {
		System.out.println("::: SETS :::");
		Set<String> hSet = new HashSet<String> ();
		hSet.add("Assembly");
		hSet.add("Binary");
		hSet.add("Compile");
		hSet.add("Compile");
		hSet.add("Compile");
		hSet.add("DataStructure");
		hSet.add("Function");
		
		/*
		 * Note: Iterators for many data structures
		 * (including hashSets) do not guarantee the 
		 * order of traversal. Even if the data structure
		 * itself uses some sort of 'ordering'. This is
		 * because the storage of data (the data structure)
		 * and the access to that data (iteration) are 
		 * controlled by different systems. The implementation
		 * provided within the JRE can look pseudo-random 
		 * at times
		 */
		System.out.println("Set - Enhanced For-Loop");
		for (String name : hSet) {
			System.out.println(name);
		}

		System.out.println("Set - While Loop");
		Iterator<String> setItr = hSet.iterator();
		while (setItr.hasNext()) {
			System.out.println(setItr.next());
		}
	}
}
