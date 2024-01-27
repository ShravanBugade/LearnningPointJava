package com.second.largest_smallest_no;

import java.util.Arrays;

public class SecondNoInArray {
	public static void main(String[] arg) {
		findSecondSmallest();
		findSecondLargest();

	}

	private static void findSecondLargest() {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int[] array = { 5, 3, 8, 1, 7, 2, 4, 6 };

		int i = 0;
		while (i < array.length) {
			int value = array[i];

			if (value > largest) {
				secondLargest = largest;
				largest = value;
			} else if (value > secondLargest && value != largest) {
				secondLargest = value;
			}

			i++;
		}
		System.out.println("second Smallest :-" + secondLargest);

		
	}

	private static void findSecondSmallest() {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int[] array = { 5, 3, 8, 1, 7, 2, 4, 6 };

		int i = 0;
		while (i < array.length) {
			int value = array[i];

			if (value < smallest) {
				secondSmallest = smallest;
				smallest = value;
			} else if (value < secondSmallest && value != smallest) {
				secondSmallest = value;
			}

			i++;
		}
		System.out.println("second Smallest :-" + secondSmallest);

	}

}
