package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {
	private static String st="";
	private static Set<Integer> uniqueValues=new HashSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a1= {1,2,3,2,1};
		Integer [] a2= {1,2,3};
		Integer [] a3= {1,2,3,4};
		
		
		checkValInArr(a1);
		checkValInArr(a2);
		checkValInArr(a3);
		
		
//		System.out.println(st.substring(0,st.length()-1));
//		System.out.println(uniqueValues.toString().substring(1,uniqueValues.toString().length()-1)+"<< uniqueValues ");
		
	}
	private static void checkValInArr(Integer[] a1) {
		
		  for (Integer value : a1) {
	            uniqueValues.add(value);
	        }

		  
		  
	}

}
