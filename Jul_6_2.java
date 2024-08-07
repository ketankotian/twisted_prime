package twisted_prime;

public class Jul_6_2 {

	static boolean prime(int num) {
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				prime = false;
		}
		return prime;
	}

	static int rev(int num) {
		int ld, rev = 0;
		while (num > 0) {
			ld = num % 10;
			rev = ld + rev * 10;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {

		int num = 13, rev = Jul_6_2.rev(num);
		boolean p = Jul_6_2.prime(num);
		if (p && Jul_6_2.prime(rev))
			System.out.println("TP");
		else
			System.out.println("NTP");
	}

}
