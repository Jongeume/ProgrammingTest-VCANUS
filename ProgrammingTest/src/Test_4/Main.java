package Test_4;

public class Main {
	static int factorial(int n) {
		
		int acc = 1;

		do {
			if (n == 1) {
				return acc;
			}
			acc = acc * n;
			n = n - 1;

		} while (true);

	}

	public static void main(String[] args) {
		int result = factorial(1000000);
		System.out.println(result);

	}

}
