import java.util.Scanner;

public class GetPrimes {

	public static void mainApp() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Let's locate prime numbers! This application finds you any prime, in order, from the first prime number on.");
		String another;
		do {
			System.out.println("Which prime number are you looking for? ");
			int num = input.nextInt();

			int prime = getPrime(num);

			System.out.printf("The number %d prime is %d.", num, prime);

			System.out.println(" Do you want to find another prime? Y/N");
			another = input.next();
		} while (another.equals("Y"));
		
		System.out.println("Bye!");
	}
	
	public static int getPrime(int val) {
		int i = 0;
		int j = 0;

		while (j <= val) {
			++i;
			if (isPrime(i)) {
				++j;
			}
		}
		return i;
	}
	

	public static boolean isPrime(int val) {
		if (val == 2) {
			return true;
		}

		for (int i = 2; i < val; ++i) {
			if (val % i == 0) {
				return false;
			}
		}
		return true;
	}

}
