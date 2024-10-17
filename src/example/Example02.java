package example;

public class Example02 {

	public static void main(String[] args) {

		System.out.println("실전문제 시작");
		System.out.println("=======================");
		
		int dan;
		int times;
		
		// 1. 구구단을 출력하도록 프로그램을 만들어 보세요. (for)
		// 1 ~ 9단
		for (dan = 1; dan <= 9; dan++) { // 1~9
			for (times = 1; times <= 9; times++) { //1~9
				System.out.print("1. ");
				System.out.println(dan + "X" + times + "=" + (dan * times));
			}
		}
		
		System.out.println("=======================");
		
		// 2. 구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요. (continue)
		for (dan = 1; dan <= 9; dan++) {
			for (times = 1; times <= 9; times++) {
				if(dan % 2 != 0) { // 홀수를 원하면 ==
					continue;
				}
				System.out.print("2. ");
				System.out.println(dan + "X" + times + "=" + (dan * times));
			}
		}
		
		System.out.println("=======================");
		
		// 3. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요. (break문 사용)
		for (dan = 1; dan <=9; dan++) {
			for (times = 1; times <= 9; times++) { //1~9
				if (dan < times) {
					break; // dan이 times 보다 작아지면 break!!
				}
				System.out.print("3. ");
				System.out.println(dan + "X" + times + "=" + (dan * times));
			}
		}
		

	}

}
