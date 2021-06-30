package arrays;

public class ArrayIteration {
	public static void main(String[] args) {
		/*
		 * Arrays have various properties associated with them. 
		 * One of which is the length, which is informative of
		 * the number of elements within the array.
		 * 
		 * Note that there is a relationship between the indexes
		 * and the length of an array. The last index will always
		 * be one less than the length of an array.
		 */
		int[] nums = {99,44,66,33,22,77};
		
		System.out.println("While loop: ");
		int index = 0;
		while (index < nums.length) {
			System.out.println(nums[index]);
			index++;
		}
		
		System.out.println("For loop: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("Enhanced For Loop: ");
		for (int element : nums) {
			System.out.println(element);
		}
		
		/*
		 * You can use enhanced for-loops with multi-dimensional arrays
		 * as well, but notice that we must utilize other functionality
		 * or provide more complex instructions if we want more control
		 * over the elements in the multi-dimensional array.
		 */
		int[][] multi = {{1,2,3},{4,5,6}};
		for (int[] arr : multi) {
			System.out.println(arr[0]);
		}
	}
}
