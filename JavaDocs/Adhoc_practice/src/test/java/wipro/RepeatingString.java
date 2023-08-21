package wipro;

public class RepeatingString {

	public static void main(String[] args) {

		String str1 = "abc bbc abcd abab abc";
		String str2 = "ab";
		int count = 0;
		String arr[] = str1.split(" ");

		for (String s : arr) {
			if (s.contains(str2)) {
				int c = s.indexOf(str2);
				System.out.println(c);
				count++;
			}

		}
		System.out.println(count);

	}

}
