package coreJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(2,67,9,1,12,34,51);
		
		
		
		Stream<Integer> s1 = nums.stream();
		Stream<Integer> s2 =	s1.filter(s->s%2==0);
		 s2.forEach(s->System.out.println(s));
		//s1.forEach(s->System.out.println(s));
		
		
	}

}
