package com.second.largest_smallest_no.sort.bubblesort;

public class SearchElementUsingBubbleSort {
	public static void main(String[] args) {
		int arr[] = { 4, 2, 5, 6, 7, 8, 9, 1 };
		getval(arr);
		System.out.println();
		System.out.println(bubbleSort(arr));
		getval(arr);
		
	
	}

	public static void getval(int[] array) {

		for (int element : array) {
			System.out.print(element + " ");
		}
	}

	public static int bubbleSort(int[] array) {
		boolean swapped = true;

		while (swapped) {
			swapped = false;

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					// Swap elements
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;

					swapped = true;
				}
			}

		}
		return array[array.length - 3];
	}

}
