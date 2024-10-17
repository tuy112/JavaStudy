
/*
 * 작성자: JH Kim
 * 작성일: 2024년 10월 17일
 * 설명: for문, 
 * 		continue문, 
 * 		break문
 */

package practice;

public class Practice03 {

	public static void main(String[] args) {
		// 하나하나 코드쓰면서 확인하기!! (직접 입력하면서 공부하기!!)
		// Day3
		System.out.println("Day3 공부시작");
		System.out.println("=======================");
		
		// 1. for문 연습
		// 첫째, 변수 선언을 먼저해주기
		int num;
		int totalA = 0;
		int totalB = 0;
		
		// 둘째, "num이 1에서 100까지 반복"이라는 조건을 걸어준다.
		for ( num = 1; num <= 100; num ++ ) {
			// 셋째, if문을 사용해서 세부 조건을 만들어준다.
			// num % 2 : num을 2로 나눈 나머지
			if (num % 2 == 0) totalA += num; // 단일 조건문
		}
		System.out.println("1부터 100까지의 짝수의 합 :" + totalA); // 넷째, 최종 출력	
		
		System.out.println("=======================");
		
		// 2. continue문 : 반복문과 함께 쓰인다. 
		// 반복문 안에서 continue문을 만나면 이후 문장은 수행하지 않고 for문의 처음으로 돌아간다.
		for ( num = 1; num <= 100; num++ ) {
			if (num % 2 == 0)
				continue;
			totalB += num;
		}
		System.out.println("1부터 100까지의 홀수의 합 :" + totalB); // 최종 출력
		
		System.out.println("=======================");
		
		// 3. break문 : break를 사용하면 수행문을 더이상 반복하지 않고 반복문을 빠져오게 된다.
		// 1 ~ 5까지 숫자를 출력하다가 3에서 break문으로 멈추도록..
		int i;
		for (i = 1; i <= 5; i++) {
			if (i == 3) {
				break; // i가 3이 되면 break해라
			}
			System.out.println("break : " + i); // 3이 타기 전에 break
		}
		
		System.out.println("=======================");

	}

}
