
/*
 * 작성자: JH Kim
 * 작성일: 2024년 10월 17일
 * 설명: 클래스와 객체 1
 * 		객체지향 프로그램 (JAVA, X++ 등등)
 * 		X++의 정의
 * 		Student 클래스 만들기 (Student.java 별도 파일)
 * 		
 */
package practice;

// 클래스
public class Practice04 {
	// 메서드
	public static void main(String[] args) {
		
		// 함수를 구현하고 호출하기
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2); // add 함수 호출
		System.out.println(num1 + "+" + num2 + "+" + "=" + sum + "입니다.");

	}
	
	// 두 값을 더하는 일을 하는 함수 만들기 (add 함수 만들기)
	public static int add (int n1, int n2) {
		int result;
		result = n1 + n2;
		
		return result;
	}
}
