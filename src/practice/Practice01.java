package practice;

public class Practice01 {
	// 전역변수
	int globalInteger; 
	String globalString;

	public static void main(String[] args) { 
		
		// Day1
		System.out.println("Day1 공부시작");
		System.out.println("=======================");
		
		// 1-1. 변수 : 변하는 값
		int level; // 먼저 변수를 만들어주고
		level = 10; // 그 변수에 값을 넣어줌
		System.out.println(level);

		int leveln = 10;
		System.out.println(leveln);
		
		System.out.println("=======================");
		
		// 1-2. 정수 자료형(byte, short, int(integer), long)
		// byte : -128 ~ 127, short : -32768 ~ 32768, int : -2147483648 ~ 2147483647, long : 12345678900L
		byte one = 127;
		short two = 32767;
		int num = 2147483647;
		long longNum = 12345678900L;
		System.out.println(one);
		System.out.println(two);
		System.out.println(num);
		System.out.println(longNum);
		
		System.out.println("참고!! X++에서는 long, int, int64만 있음.");
		
		System.out.println("=======================");
		
		// 1-3. 문자 자료형(char)
		char grade = 'A';
		System.out.println(grade);
		
		char grade_a = 'A'; // 바이트 크기가 1 = char
		char grade_b = 'B';
		char grade_c = 'C';
		char grade_d = 'D';
		
		String abcd = "ABCD";
		System.out.println(abcd);
		
		System.out.println("=======================");
		
		// 1-4. 실수 자료형 (float, double)
		// float : 4바이트형, double : 8바이트형
		double dnum = 3.14;
		float fnum = 3.14F;
		System.out.println(dnum);
		System.out.println(fnum);
		
		// 부동의 소수점
		double specialNum = 1;
		for (int i = 0; i < 10000; i++) {
			specialNum = specialNum + 0.1;
		}
		System.out.println(specialNum);
		
		System.out.println("=======================");
		
		// 1-5. 논리 자료형 (boolean) 기본 값 = false '0' true '1'
		boolean isMarried = true; // true or false
		System.out.println(isMarried);
		
		System.out.println("=======================");
		
		// 1-6. 자료형없이 변수 선언하기
		var old_str = "old";
		String new_str = "new";
		Integer no = 1;
		
		// 문자열과 문자형 차이
		
		int hello;
		hello = 1;
		System.out.println(hello);
		
		
		System.out.println(old_str);
		System.out.println(new_str);
		System.out.println(no);
		
		System.out.println("=======================");
		
		// 1-7. 자료형 추론
		var i = 10; // int = i;
		var j = 10.0; // double = j;
		var str = "hello"; // String = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		System.out.println("=======================");
		
		// 2-1. 상수 (constant : 항상 변하지 않는 값)
		// 2-2. 리터럴 : 프로그램에서 사용하는 모든 숫자, 문자, 논리값을 일컫는 말
		final double PI = 3.14; // 원주율은 늘 3.14
		final int MAX_NUM = 100; // 최대 값을 100으로 설정해줌
		final int MIN_NUM; // 최소 값을 4로 설정해줌
		MIN_NUM = 4;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
//		MAX_NUM = 1000; 1000이라는 값을 넣으면 오류가 발생하게 됨!
		
		System.out.println("=======================");
		
		// 2-3. 형 변환 : 정수와 실수는 표현 방식이 달라서 형변환이라는 작업을 통해 자료형을 통일한 후 연산을 해야한다.
		int n = 10;
		// double dnum = n; //실수와 정수는 다르기 때문에 주석을 풀면 에러가 납니다.
		
		// 2-4. 묵시적 형 변환
		byte bNum = 10;
		int iNum = bNum; // 바이트 크기가 작은 자료형 -> 큰 자료형 =>> 남은 3바이트는 0으로 채워짐
		System.out.println(bNum);
		System.out.println(iNum); // byte형 값이 int형 변수로 대입됨
		
		System.out.println("=======================");
		
		// 2-5. 명시적 형 변환
		int zNum = 5;
		byte cNum = (byte)zNum; // 바이트 크기가 큰 자료형 -> 작은 자료형 =>> 강제로 형을 바꾸려면 바꿀 형을 괄로를 써서 명시해야함
		System.out.println(zNum);
		System.out.println(cNum);
		
		System.out.println("=======================");
		
		Practice01 jh = new Practice01();
		jh.globalInteger = 10;
		jh.globalString = "KimJH";
		System.out.println(jh.globalInteger);
		System.out.println(jh.globalString);
		
		System.out.println("=======================");
		
		// 여기서.. 문제!!
		// Q. testNum이 100이라는 정수형 변수가 있다. 문자에 해당하는 정수 값을 출력하려하면?
		int testNum = 100;
		System.out.println((char)testNum); // d?
		
		
		// + 전역변수와 지역변수의 차이
		
		// + 메서드와 클래스
	}

}
