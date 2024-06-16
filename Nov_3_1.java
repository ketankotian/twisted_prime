package twisted_prime;

public class Nov_3_1 {

	public static void main(String[] args) {

		int num = 19;
		boolean prime = true, tp = true;
		int rev = 0, ld;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}

		while (num != 0) {
			ld = num % 10;
			rev = ld + rev * 10;
			num = num / 10;
		}
		System.out.println(rev);

		for (int i = 2; i < rev; i++) {
			if (rev % i == 0) {
				tp = false;
			}
		}

		if (prime && tp) {
			System.out.println("TP");
		} else
			System.out.println("NTP");

	}

}
