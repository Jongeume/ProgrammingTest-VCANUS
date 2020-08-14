package Test_2;

public class Calculator {
	
	private int result;
	
	// 더하기
	public Calculator add(int a) {
		this.result = result+a;
		return this;
	}
	
	// 빼기
	public Calculator substract(int b) {
		this.result = result-b;
		return this;
	}
	
	// 결과
	public int out(){
		return result;
	}
}
