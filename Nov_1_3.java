package twisted_prime;

public class Nov_1_3 {
	public static void main(String[] args) {

		int num = 19;

		Nov_1_2 tp = new Nov_1_2();
		tp.checkPrime(num);
		int rev = tp.rev(num);

		if (tp.checkPrime(rev)) {
			System.out.println("tp");
		}
		else 
			System.out.println("ntp");
	}

}
