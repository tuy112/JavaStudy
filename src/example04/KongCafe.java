package example04;

public class KongCafe {
	String kongCafe;
	int passengerCount;
	int money;
	
	public KongCafe(String kongCafe) {
		this.kongCafe = kongCafe;
	}
	
	public void drink(int money) {
		this.money += money; // 콩다방 요금 증가
		passengerCount++; // 콩다방 승객 증가
	}
	
	public void showInfo() {
		System.out.println("콩다방" + kongCafe + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다");
		
	}
}
