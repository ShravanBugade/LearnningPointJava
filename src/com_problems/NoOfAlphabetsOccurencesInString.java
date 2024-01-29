package com_problems;

import java.util.HashMap;

public class NoOfAlphabetsOccurencesInString {
	public static void main(String[] args) {
		String str="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
		String [] strArr=str.split(" ");
		int counter=1;
		boolean flag;
		HashMap<String, Integer> hm =new HashMap<>();
		for (int i = 0; i < strArr.length; i++) {
			counter=0;
			if (hm.containsKey(strArr[i])) {
				counter=hm.get(strArr[i])+1;
				hm.put(strArr[i], counter);
			}else {
				flag=false;
				if (!hm.containsKey( strArr[i]) && flag==false ) {
					hm.put(strArr[i],1);
				}
					
			}
			
		}
		System.out.println(hm);
	}

}
