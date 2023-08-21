package jpack;

public class ExceptionDEmo {

	public static void main(String[] args) {

		String check = "Happy44Holiday##";

		String number = "";
		String alpha = "";
		String spl = "";
		for (int i = 0; i < check.length(); i++) {

			char c = check.charAt(i);
			if (Character.isDigit(c)) {

				number = number + c;
			} else if (Character.isAlphabetic(c)) {
				alpha = alpha + c;
			} else {
				spl = spl + c;
			}

		}
		System.out.println(number);
		System.out.println(alpha);
		System.out.println(spl);
	}
}
