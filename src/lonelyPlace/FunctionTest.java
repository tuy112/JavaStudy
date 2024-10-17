package lonelyPlace;

public class FunctionTest {
	public static void main(String[] args) { 
		// 사칙 연산(덧셈과 뺄셈)을 수행하는 함수 가져와서 사용
		int num1 = 5;
		int num2 = 2;
		
		int sum1 = add(num1, num2);
		int sum2 = minus(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + sum1 + "입니다.");
		System.out.println(num1 + "-" + num2 + "=" + sum2 + "입니다.");
		
	}
	
	// 덧셈 함수 (add)
	public static int add (int n1, int n2) {
		int result;
		result = n1 + n2;
		
		return result;
	}
	
	// 뺄셈 함수 (minus)
	public static int minus (int n1, int n2) {
		int result;
		result = n1 - n2;
		
		return result;
	}
}
