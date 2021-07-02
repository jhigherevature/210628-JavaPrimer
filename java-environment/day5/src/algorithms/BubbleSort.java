package algorithms;

public class BubbleSort {
	/* Simulator Method */
	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		
		System.out.println("Given Array");
		printArray(arr);
		
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		
		System.out.println("\nSorted array");
		printArray(arr);
	}
	
	/* A utility method to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	/* Bubble Sort Algorithm */
	void bubbleSort(int arr[]) {
		/* n represents how many times we loop through
		 * a collection, i.e. the size of the collection
		 * in question
		 */
		int n = arr.length;
		/* The outer loop ensures we will account
		 * for every element of the collection
		 */
		for (int i = 0; i < n - 1; i++)
			/* This inner loop performs the actual
			 * comparisons and swap...
			 * as we iterate through our collection
			 * we are continuously shifting values
			 * to their appropriate positions, and
			 * as such, we do not need to look
			 * through every single item of the collection
			 * in the inner loop, every time, though we
			 * could...
			 */
			for (int j = 0; j < n - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					swap(arr, j, j+1);
				}
	}
	
	/* Swap position of two indexes of an array */
	void swap (int[] arr, int l_index, int r_index) {
		int temp = arr[l_index];
		arr[l_index] = arr[r_index];
		arr[r_index] = temp;
	}
}
