package jpack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class HashMapDemo {

	
	
	public static void main(String[]a) {
		System.out.println();
		
		
		HashMap<String,Integer> students = new HashMap<>(); 
		
		students.put("Vijay", 24);
		students.put("AG", 3);
		
		
		HashSet<Integer> count = new HashSet<>();
		
		count.add(23);
		
		Hashtable<Character,Integer> tab = new Hashtable<>();
		
		tab.put('c', 4);
		tab.put('V', 1);
		
		
	}
}
