package example04;

public class StarCafe {
	String starCafe;
	int passengerCount;
	int money;

	public StarCafe(String starCafe) {
		this.starCafe = starCafe;
	}
	
	public void drink(int money) {
		this.money += money; // 별다방 요금 증가
		passengerCount++; // 별다방 승객 증가
	}
	
	public void showInfo() {
		System.out.println("별다방" + starCafe + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다");
	}
}
