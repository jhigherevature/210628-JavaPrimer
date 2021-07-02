package algorithms;

public class QuickSort {
	/* Simulator Method */
	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		
		System.out.println("Given Array");
		printArray(arr);
		
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, arr.length-1);
		
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
	
	/*
	 * Recursively sort the elements by finding a pivot element
	 * and swapping elements based on the value of that pivot
	 * element...
	 * This recursive call occurs on all elements on the left
	 * of a partition and all elements on the right of the partition.
	 */
	public void quickSort(int arr[], int begin, int end) {
		if (begin < end) {
			int p_index = partition(arr, begin, end);
			
			quickSort(arr, begin, p_index-1); // recursive sort on left partition
			quickSort(arr, p_index+1, end); // recursive sort on right partition
		}
	}
	
	// How to Find partition
	private int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = begin - 1;
		
		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot ) {
				i++;
				
				swap(arr, i, j); // swap elements around pivot point
			}
		}
		
		swap(arr, i+1, end);
		
		return i+1; // location of pivot element used for future swaps
	}
	
	/* Swap position of two indexs of an array */
	void swap (int[] arr, int l_index, int r_index) {
		int temp = arr[l_index];
		arr[l_index] = arr[r_index];
		arr[r_index] = temp;
	}
}
