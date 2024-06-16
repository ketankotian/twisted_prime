package twisted_prime;

public class Nov_22_1 {
	
	public static void main(String[] args) {
		int num = 31;
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				prime = false;
		}
		System.out.println("Number : " + num);
		System.out.println("Prime - " + prime);

		int ld, rev = 0;
		while (num > 0) {
			ld = num % 10;
			rev = ld + rev * 10;
			num = num / 10;
		}
		System.out.println("Reverse : " + rev);

		boolean tp = true;
		for (int i = 2; i < rev; i++) {
			if (rev % i == 0)
				tp = false;
		}
		System.out.println("Num twisted prime - " + tp);

	}

}
