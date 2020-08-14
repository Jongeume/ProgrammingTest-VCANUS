package Test_3;

public class Main {
	
	public static int factorial(int n) {
		if(n>0) {
			return n * factorial(n-1);
		}else{
			return 1;
		}
	}

	public static void main(String[] args) {
		int result = factorial(100000);
		System.out.println(result);
	}

}
