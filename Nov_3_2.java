package twisted_prime;

public class Nov_3_2 {
	
	static boolean checkPrime(int num) {
		boolean isPrime = true, isTp = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				isPrime = false;
		}
		return isPrime;
	}

	static int rev(int num) {
		int ld = 0, rev = 0;
		while (num != 0) {
			ld = num % 10;
			rev = ld + rev * 10;
			num = num / 10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		int num = 17;
		int rev = rev(num);

		System.out.println(num +" prime ?  -> "+checkPrime(num));
		if(checkPrime(rev)){
			System.out.println("tp");
		}
		else 
			System.out.println("ntp");
		
	}


}
