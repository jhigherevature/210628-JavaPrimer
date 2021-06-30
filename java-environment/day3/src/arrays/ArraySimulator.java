package arrays;

public class ArraySimulator {
	public static void main(String args[]) {
		/*
		 * Arrays are datastructures that are fixed in size
		 * This means that, after the array has been created
		 * we cannot change the number of elements that can
		 * be placed within the array (although we retain the
		 * ability to manipulate their values)
		 */
		
		// declare size but not the values of an array
		int[] nums_1 = new int[5];
		
		// declare the values (and in turn the size as well) of an array
		int[] nums_2 = new int[] {6,44,32,99,101}; 
		
		/*
		 * Anonymous array assignment. This allows us to declare
		 * the size and values of the array, without explicitly
		 * stating the array datatype that we are assigning...
		 * 
		 * Note that this only works when we CREATE the array
		 * reference variable, we cannot use anonymous arrays
		 * when we reassign the value later
		 */
		int[] nums_3 = {51,62,73,84,95};
		
		nums_3 = new int[] {1,2,3,4};
//		nums_3 = {5,6,7,8}; // error
		
		/*
		 * indexing allows you to locate elements within an
		 * array-based structure. Indexing in array-based
		 * structures generally start with 0. (very few start
		 * with 1).
		 */
		System.out.println(nums_3[0]); // 1
		nums_3[0] = 15; // 1 -> 15
		System.out.println(nums_3[0]); // 15
		
		int nums_4[] = {99,88,77};
	}
}
