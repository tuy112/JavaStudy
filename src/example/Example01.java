package example;

public class Example01 {

	public static void main(String[] args) {
		
		System.out.println("실전문제 시작");
		System.out.println("=======================");
		// 1. 변수 두 개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력해보세요.
		int tNum = 10;
		double pNum = 2.0;
		
		System.out.println("덧셈 결과: " + (tNum + pNum));
		System.out.println("뺄셈 결과: " + (tNum - pNum));
		System.out.println("곱셈 결과: " + (tNum * pNum));
		System.out.println("나누기 결과: " + (tNum / pNum));
		
		System.out.println("=======================");
		
		// 2. '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력하여 확인해 보세요.
		String myTxt = "글";
//		char chTxt = (char)"글";
		
		System.out.println("String 결과: " + myTxt);
//		System.out.println("char 반환결과: " + chTxt);
	}

}
