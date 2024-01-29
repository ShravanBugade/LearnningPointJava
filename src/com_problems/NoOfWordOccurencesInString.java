package com_problems;

import java.util.HashMap;

public class NoOfWordOccurencesInString {
	public static void main(String[] args) {
		String str = "WORLD";
		char[] strArr = str.toCharArray();
		int counter = 1;
		boolean flag;
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c : strArr) {
			counter = 0;
			if (hm.containsKey(c)) {
				counter = hm.get(c) + 1;
				hm.put(c, counter);
			} else {
				flag = false;
				if (!hm.containsKey(c) && flag == false) {
					hm.put(c, 1);
				}

			}

		}
		System.out.println(hm);
	}

}
