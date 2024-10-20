package practice.practice05;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money; // 지하철 요금 증가
		passengerCount++; // 지하철 승객 증가
	}
}
