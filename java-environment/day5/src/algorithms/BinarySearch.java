package algorithms;

public class BinarySearch {
	/* Simulator Method */
	public static void main(String[] args) {
		// test collection
		int[] collection = {1, 2, 4, 7, 8, 15, 22, 99};
		
		System.out.println(binarySearch(7,collection));
		System.out.println(binarySearch(22,collection));
		System.out.println(binarySearch(5,collection));
	}
	
	/*
	 * Binary Search algorithms assume that the collection
	 * in question is in sorted order
	 */
	public static int binarySearch(int target, int[] collection) {
		int left = 0;
		/*
		 * collection.length : how many elements in our collection
		 * 		if we subtract 1, we will have the last index
		 * 		of our collection
		 */
		int right = collection.length-1;
		
		/*
		 * The search itself:
		 * 		If the 'left' index is less than the 
		 * 		'right', continue to search. 
		 * 		We will change the left and right values
		 * 		as we search...
		 */
		while (left <= right) {
			// The mid is index exactly between left and right
			int mid = (right + left)/2;
			/* If our target is less than the number at 
			 * the mid index, we know the target must 
			 * exist after the midpoint, if at all.
			 */  
			if (target < collection[mid])
				right = mid - 1;
			/* If our target is greater than the number 
			 * at the mid index, we know the target must 
			 * exist before the midpoint, if at all.
			 */
			else if (target > collection[mid])
				left = mid + 1;
			else
				return mid;
		}
		
		/*
		 * This return statement is reached only
		 * if the collection is searched fully
		 * and no match is found
		 */
		return -1;
	}
}
