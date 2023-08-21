package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
	
	public static void main(String[]args) {
		
		
		LinkedHashSet l = new LinkedHashSet();
		
		l.add('P');
		l.add(null);
		l.add(33);
		l.add("Apple");
		l.add(44);
		System.out.println(l.add('P'));
		System.out.println(l);
	}

}
