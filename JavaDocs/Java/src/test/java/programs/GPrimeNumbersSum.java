package programs;

public class GPrimeNumbersSum {

	public static int printSumofPrimes(int no_of_primes) {

		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int sum = 0;
		int prime = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i + " is Prime");
				sum = (sum + i)/num;
				prime++;
			}
			if (prime == num) {
				break;
			}
			sum = sum/num;
		}
		System.out.println(sum);
	}

}
