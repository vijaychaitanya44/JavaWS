package collectionFramework;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet a = new TreeSet();
		a.add(new StringBuffer("A"));
		a.add(new StringBuffer("Z"));
		a.add(new StringBuffer("L"));
		a.add(new StringBuffer("B"));
		a.add(new StringBuffer("X"));
		a.add(new StringBuffer("O"));
		System.out.println(a);

		Comparable c = new Comparable() {

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
		};

	}
}
