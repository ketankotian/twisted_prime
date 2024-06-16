package twisted_prime;

public class Nov_1_2 {
	// process

	boolean isPrime = true, isTp = true;

	int ld = 0, rev = 0;

	public boolean checkPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				isPrime = false;
		}
		return isPrime;
	}

	public int rev(int num) {
		while (num != 0) {
			ld = num % 10;
			rev = ld + rev * 10;
			num = num / 10;
		}
		return rev;
	}

}
