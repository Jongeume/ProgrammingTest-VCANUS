package Test_2;

public class Main {
	public static void main(String[] args) {
		Calculator carculator = new Calculator();
		int result = carculator.add(4).add(5).substract(3).out();
		System.out.println("계산결과 : "+result);
		System.out.println();
		
		Calculator carculator2 = new Calculator();
		int testResult = carculator2.add(10).add(2).substract(12).add(1).out();
		System.out.println("(*test값 입니다: " + testResult+")");
	}

}
