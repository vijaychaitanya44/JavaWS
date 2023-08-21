package coreJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo3 {

	public static void main(String[] args) {

		Set<Integer> c = new LinkedHashSet<>();
		
		//c.add(null);
		//c.add(null);
		c.add(2);
		c.add(0);
		c.add(22);
		c.add(2);
		c.add(0);
		c.add(456);
		
		for(int n: c) {
			System.out.println(n);
		}
	}
}
