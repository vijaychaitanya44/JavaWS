package a_pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStream1 {
	// @Test
	public void regular() {

		ArrayList<String> names = new ArrayList<>();

		names.add("Vijay");
		names.add("Dev");
		names.add("Ravan");
		names.add("London");
		names.add("Rohit");

		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("R")) {
				count++;
			}

		}
		System.out.println(count);
	}

	// @Test
	public void streamTest() {
		ArrayList<String> names = new ArrayList<>();

		names.add("Vijay");
		names.add("Dev");
		names.add("Ravan");
		names.add("London");
		names.add("Rohit");
		names.add("Thunder");

		long n = names.stream().filter(s -> s.startsWith("L")).count();
		System.out.println(n);

		long d = Stream.of("Apple", "Banana", "Ball", "Bat", "Mango", "Pumpkin").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);

		// names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.length() > 5).limit(1).forEach(s -> System.out.println(s));
	}

	// @Test
	public void streamMap() {

		Stream.of("Abhishek", "Amulya", "Rama", "Rakesh", "Ester", "Tanvish").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		List<String> names = Arrays.asList("Brotha", "Armugam", "Hangover", "Amanda", "Tenali", "Alapooza", "Loyola",
				"Adam");
		names.stream().filter(s -> s.startsWith("A")).map(s -> s.toLowerCase()).sorted()
				.forEach(s -> System.out.println(s));
	}

	//@Test
	public void streamMerge() {
		List<String> names = Arrays.asList("Brotha", "Armugam", "Hangover", "Amanda", "Tenali", "Alapooza", "Loyola","Tiger",
				"Adam");
		List<String> animals = Arrays.asList("Monkey", "Tiger", "Gorilla", "Lion", "Elephant", "Adam");

		Stream<String> cStream = Stream.concat(names.stream(), animals.stream());

		//cStream.forEach(s -> System.out.println(s));
		//cStream.sorted().forEach(s->System.out.println(s));
		//cStream.sorted().distinct().forEach(s->System.out.println(s));
		
		boolean flag=cStream.anyMatch(s->s.equalsIgnoreCase("lion"));
		System.out.println(flag);
		
		Assert.assertTrue(flag);

	}
	@Test
	public void StreamCollect() {
		List<String> li =Stream.of("Abhisheka", "Amulya", "Rama", "Rakesh", "Ester", "Tanvish").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		li.stream().sorted();
		System.out.println(li.get(1));
		
		List<Integer> arr = Arrays.asList(1,4,5,2,1,4,7,8,3,2,4);
		
	List<Integer> dis=	arr.stream().sorted().distinct().collect(Collectors.toList());
	
		System.out.println(	dis.get(1));
		
	}

}
