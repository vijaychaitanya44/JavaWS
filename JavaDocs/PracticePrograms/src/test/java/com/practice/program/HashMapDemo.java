package com.practice.program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbbcccd";
		Map<Character, Integer> li = new HashMap<>();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					count++;
					li.put(ch[i], count);

				}

			}
		}

		System.out.println(li);

	}
}
