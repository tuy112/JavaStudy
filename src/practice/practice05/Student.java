package practice.practice05;

// 1. 클래스
public class Student {
	// 2. 변수 선언
	public String studentName;
	public int grade;
	public int money;
	
	// 3. 생성자
	// bus 클래스와 연결
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -=1000;
	}
	
	// subway 클래스와 연결
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	// 4. 최종 출력
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
	
}
