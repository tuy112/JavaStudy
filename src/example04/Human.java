package example04;

public class Human {
	// 1. 변수 선언
	public String cusName;
	public int money;
	
	// 2. 생성자
	public Human(String cusName, int money) {
		this.cusName = cusName;
		this.money = money;
	}
	
	// 별다방 클래스와 연결
	public void drinkStar(StarCafe star) {
		star.drink(4000);
		this.money -=4000;
	}
	
	// 콩다방 클래스와 연결
	public void drinkKong(KongCafe kong) {
		kong.drink(6000);
		this.money -=6000;
	}
	
	// 4. 최종 출력
	public void showInfo() {
		System.out.println(cusName + "님의 남은 돈은 " + money + "입니다.");
	}
}
