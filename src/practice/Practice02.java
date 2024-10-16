package practice;

public class Practice02 {

	public static void main(String[] args) {

		// Day2
		System.out.println("Day2 공부시작");
		System.out.println("=======================");
		
		// 1. 기본 연산자
		// 1-1. 단항 연산자, 이항 연산자, 삼항 연산자(조건 연산자 1-9)
		int num_a = 1;
		int num_c = 1;
		//++num_a;
		//num_a++;
		// 뒤에 있을때와 앞에 있
		
		System.out.println("단항 연산자 :" + num_a);
		System.out.println("단항 연산자 :" + ++num_a);
		System.out.println("단항 연산자 :" + num_a++); // 단항 연산자
		System.out.println("이항 연산자 :" + (num_a + num_c)); // 이항 연산자
		
		System.out.println("=======================");
		
		// 1-2. 대입 연산자 : 변수의 값을 대입하는 연산자
		int age = 24;
		System.out.println("나이 :" + age); // 나이를 의미하는 age 변수에 24를 대입
		
		//  age에 1을 더하기
		System.out.println((age + 1));
		age += 1;
		age = age + 1;
		++age;
		age++;
		--age;
		age--;
		// 상황에 따라 다르지만 age++를 더 많이 쓴다 (앞에 붙여주는 상황 알아보기)
		
		System.out.println("=======================");
		
		// 1-3. 부호 연산자 : + - 두가지가 있음. +는 양수로 만들어주고 -는 음수로 만들어준다.
		System.out.println(+num_a); // 양수
		System.out.println(-num_a); // 음수 (값을 
		System.out.println(num_a); // 다시 양수
		num_a = -num_a; // 값 자체를 음수로 바꾸어줌
		System.out.println(num_a); // 음수가 출력됨
		
		System.out.println("=======================");
		
		// 1-4. 산술 연산자 (+, -, *, /, %)
		int math = 90;
		int eng = 70;
		
		int total = math + eng;
		int avg = total / 2;
		int remainder = avg % 9; //8
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("나머지 : " + remainder);
		
		System.out.println("=======================");
		
		// 1-5. 증감(증가,감소) 연산자 ++, --
		int gameScore = 100;
		int goalScore = gameScore++; // 101
		System.out.println("증가 연산자 :" + goalScore); // 101
		
		int hitScore = --gameScore;
		System.out.println("감소 연산자 :" + hitScore); // 다시 100
		
		System.out.println("=======================");
		
		// 1-6. 관계 연산자 : 항이 두 개인 이항 연산자로 항 두개를 비교한 후 true or false로 결과가 나옴 (기본 값 : false 0 )
		int myAge = 29;
		boolean ageValue = (myAge >= 29);
		System.out.println("관계 연산자 :" + ageValue); // true
		
		System.out.println("=======================");
		
		// 1-7. 논리 연산자
		// 모두 참 = 논리 곱은 참 and 그리고
		boolean val = (5>3) && (5>2) && (5==4); // 둘다 참 true
		System.out.println(val);
		
		// 하나만 참 = 논리 합은 참 or 또는
		boolean vall = (5>3) || (5<2); // 하나만 참 true
		System.out.println(vall);
		
		// 참의 부정은 거짓 + 거짓의 부정은 참
		boolean vally = !(5<3); // 참을 부정 false
		System.out.println(vally);
		
		System.out.println("=======================");
		
		// 1-8. 복합 대입 연산자 : 대입 연산자와 다른 연산자를 조홥해 하나의 연산자처럼 사용하는 연산자
		// +=
		int num_ab = 2;
		 num_ab += 2; 
		 		 num_ab = num_ab + 2;
		
		System.out.println("복합 대입 연산자?");
		
		// -=
		// num_ab -= 2; 
		// num_ab = num_ab - 2;
		
		// *=, %=, <<=, >>=, >>>=, &=, |=, ^= 이하 동일
		
		System.out.println("=======================");
		
		// 1-9. 조건 연산자 : 연산에 필요한 항이 3개인 삼항 연산자
		int father = 50;
		int mother = 48;
		
		char ch;
		ch = ( father > mother ) ? 'T' : 'F'; // father이 mother보다 더 숫자가 크므로 참 -> 그러므로 ch 또한 참이 된다
		
		if ( father < mother  ) {
			ch = 'a';
			
		} else {
			ch = 'b';
		}
		
		System.out.println("삼항 연산자 : " + ch); // false
		
		System.out.println("=======================");
		
		// 2. 비트 연산자 : 비트 값을 기반으로 하는 연산자 / 비트 단위로 연산이 이루어지는 연산자 (비트 : 0,1로 구성된 2진수)
		// 2-1. & 연산자 : 비트 단위로 AND 연산을 한다. (두 비트가 모두 1이여만 결과가 1이 됨)
		int num1 = 5; // 5 = 00000101
		int num2 = 10; // 10 = 00001010
		int result1 = num1 & num2;
		System.out.println("& : " + result1); // 00000000 = 0
		
		// 2-2. | 연산자 : 비트 단위로 OR 연산을 한다. (하나의 비트라도 1이면 결과가 1이 됨 )
		int result2 = num1 | num2;
		System.out.println("| : " + result2); // 00001111 = 15
		
		// 2-3. ^ 연산자 : 비트 단위로 XOR 연산을 한다. (두 비트가 다를때만 1인 됨)
		int result3 = num1 ^ num2;
		System.out.println("^ : " + result3); // 00001111 = 15
		
		// 2-4. ~ 연산자(비트NOT 연산자) : 단항 연산자, 모든 비트를 반전시킨다. (0과 1 반전시키기)
		int num3 = 5; // 5 = 00000101
		int result4 = ~num3; // 비트를 반전시킴
		System.out.println("~ : " + result4); // 11111010 = -6
		
		// 2-5. >> 연산자 : 비트 이동 연산자 -> 오른쪽으로 비트 이동시키는 연산자
		int x = 8; // 8 = 00001000
		int result5 = x >> 2; // 2비트만큼 오른쪽으로 이동시킴 
		System.out.println(">> : " + result5); // 00000010 = 2
		
		// 2-6. << 연산자 : 왼쪽으로 비트 이동시키는 연산자
		int result6 = x << 2; // 2비트만큼 왼쪽으로 이동시킴
		System.out.println("<< : " + result6); // 00100000 = 32
		
		// 2-7. >>> 연산자 : >> 연산자와 마찬가지로 오른쪽으로 이동하는 연산자이다. 단, 왼쪽에 채워지는 비트가 다 0이다
		int y = -6; // 6 = 11111010
		int result7 = y >>> 2;
		System.out.println(">>> : " + result7); // 1
		
		System.out.println("=======================");
		
		// 3. 조건문
		// 3-1. if 문
		int a = 3;
		if (a == 3) {
			System.out.println("a :정답!!");
		}
		
		System.out.println("=======================");
		
		// 3-2. if ~ else 문
		int yAge = 20;
		if (yAge >= 30) {
			System.out.println("적정 나이");
		} else {
			System.out.println("yAge :적정 나이가 아닙니다");
		}
		
		System.out.println("=======================");
		
		// 3-3. if ~ else if 문
		int enterAge = 9;
		int charge;
		
		if (enterAge < 8) {
			charge = 1000;
			System.out.println("미취학 아동 : 1000원");
		} else if (enterAge < 14) {
			charge = 1400;
			System.out.println("초등생 : 1400원");
		} else if (enterAge < 20) {
			charge = 1400;
			System.out.println("중고생 : 1400원");
		} else {
			charge = 2500;
			System.out.println("성인 : 2500원");
		}
		
		System.out.println("입장료는 " + charge + " 원입니다.");
		
		System.out.println("=======================");
		
		// if ~ if 문 : 모든 조건이 다 걸리게 되어 else문 파트를 제외한 1400원으로 charge 값이 출력된다.
		int yourAge = 9;
		int yourCharge;
		
		if (yourAge < 8) {
			charge = 1000;
			System.out.println("미취학 아동 : 1000원");
		} 
		if (enterAge < 14) {
			charge = 1400;
			System.out.println("초등생 : 1400원");
		}
		if (yourAge < 20) {
			charge = 1400;
			System.out.println("중고생 : 1400원");
		} else {
			charge = 2500;
			System.out.println("성인 : 2500원");
		}
		
		System.out.println("입장료는 " + charge + " 원입니다.");
		
		System.out.println("=======================");
		
		// 3-4. 조건문 연산자
		int jh = 92;
		char grade;
		if (jh >= 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		System.out.println(jh + "의 grade는 " + grade);
		
		System.out.println("=======================");
		
		// 3-5. switch ~ case 문
		int ranking = 3 ;
		String tier;
		
		switch(ranking) {
			case 1 : tier = "bronze";
			break;
		
			case 2 : tier = "Silver";
			break;
			
			case 3 : tier = "Gold";
			break;
			
			default : tier = "iron";
		}
		System.out.println(ranking + "은 " + tier);
		// 왜 break를 걸지 않으면 case파트는 걸리지 않고 쭉 내려가는지 궁금합니다.. 기본값이 iron이 출력됨
		
		System.out.println("=======================");
		
		// 4. 반복문
		// 4-1. 하나하나 다 더해주기
		int zNum = 1;
		zNum += 1; // zNum = zNum + 1;
		zNum += 2;
		zNum += 3;
		System.out.println("1부터 3까지의 합은 " + zNum);
		
		System.out.println("=======================");
		
		// 4-2. while 문
		int yNum = 1;
		int ySum = 0;
		while (yNum <= 10) {
			ySum += yNum;
			yNum++;
		}
		System.out.println("1부터 10까지의 합은 " + ySum);
		
		System.out.println("=======================");
		
		// 4-3. do ~ while 문
		int hNum = 1;
		int hSum = 0;
		
		do {
			hSum += hNum;
			hNum++;
		} while (hNum <= 10);
		
		System.out.println("1부터 10까지의 hSum은" + hSum + "입니다");
		
		System.out.println("=======================");
		
		// 4-4. for문
		int k;
		int kSum;
		for (k = 1, kSum = 0; k <= 10; k++) {
			kSum += k;
		}
		System.out.println("1부터 10까지의 kSum은" + kSum + "입니다");
		
	}

}
