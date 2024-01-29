package com.arrays;

public class MinAndMaxInArray {

	public static void main(String[] args) {
		int [] arr= {2,3,0,5,7,8,9,1,45,32};
		
		findMinNoInArray(arr);
		findMaxNoInArray(arr);
	}

	private static void findMaxNoInArray(int[] arr) {
		int val=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>val) {
				
				int temp=arr[i];
				arr[i]=val;
				val=temp;
			}
		}
		System.out.println("Maximum no "+val);
		
	}

	private static void findMinNoInArray(int[] arr) {
		int val=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<val) {
				
				int temp=arr[i];
				arr[i]=val;
				val=temp;
			}
		}
		System.out.println("Minimun no "+val);
		
	}

}
