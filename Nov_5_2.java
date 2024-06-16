package twisted_prime;

public class Nov_5_2 {

	boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}
		return prime;
	}
	int rev(int num) {
		int rev = 0, ld;
		while (num > 0) {
			ld = num % 10;
			rev = ld + rev * 10;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int num = 17;
		Nov_5_2 n = new Nov_5_2();
		System.out.println("num prime : " + n.isPrime(num));
		System.out.println("rev : " + n.rev(num));
		if (n.isPrime(n.rev(num))) {
			System.out.println("TP");
		} else
			System.out.println("NTP");

	}
}