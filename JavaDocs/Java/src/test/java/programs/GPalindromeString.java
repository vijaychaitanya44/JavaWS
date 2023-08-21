package programs;

public class GPalindromeString {

	public static boolean palindromOrNot(String str) {

		String original = str.trim();
		String rev = "";
		if (original.length() <= 1) {
			return false;
		}
		for (int i = original.length() - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
		boolean value = original.equals(rev) ? true : false;

		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(palindromOrNot("2  2"));
	}

}
