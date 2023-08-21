package collectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> li = new LinkedList<>();
		
		li.add(6);
		li.add(55);
		li.add(23);
		li.add(9);
		li.add(100);
		li.add(37);
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		li.removeFirst();
		li.removeLast();
		System.out.println(li);
		

	}

}
