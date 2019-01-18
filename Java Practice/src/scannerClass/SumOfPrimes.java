package scannerClass;

public class SumOfPrimes {

	static int findSumOfPrimesBetween(int from, int to) {
		boolean prime = true;
		int sum = 0;
		if (from < 0) {
			from = 2;
			}
		if (to < 0) {
			to = 2;
		}
		System.out.println(to);
		System.out.println(from);
		if (from > to) {
			int temp = 0;
			temp = from;
			from = to;
			to = temp;
		}

		for (int i = from; i <= to; i++) {
			prime = true;
			int x = 2;

			while (x < i)

			{
				if (i % x == 0) {
					prime = false;
					break;
				}
				x++;
			}

			if (prime)
				sum = sum + i;
		}
		return sum;

		// Student code ends here
	}

	public static void main(String args[]) {

		int result = SumOfPrimes.findSumOfPrimesBetween(50, -100);
		System.out.println(result);

	}
}
