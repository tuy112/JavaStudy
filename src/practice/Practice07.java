package practice;

public class Practice07 {
	// 일반 고객
	// 1. 클래스 + 멤버변수
	public class Customer {
		private int customerID;
		private String customerName;
		private String customerGrade;
		int bonusPoint;
		double bonusRatio;
		
		// 2. 디폴트 생성자
		public Customer() {
			customerGrade = "SILVER"; // 기본 등급
			bonusRatio = 0.01; // 보너스 포인트 기본 적립 비율
		}
		
		// 3. 메서드(보너스 포인트 적립, 지불 가격 계산 메서드)
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio; // 보너스 포인트 계산 (=> bonusPoint = bonusPoint + (price * bonusRatio))
			return price;
		}
		
		// 4. 최종 출력
		public String showCustomerInfo() {
			return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
		}
		
	}
	
	// VIP 고객
	// 1. customerID, customerName, customerGrade, bonusPoint, bonusRatio 멤버변수는 동일!
	// agentID, salesRatio가 VIP에 추가!!
	public class VIPCustomer {
		private int customerID;
		private String customerName;
		private String customerGrade;
		int bonusPoint;
		double bonusRatio;
		
		private int agentID;
		double saleRatio;
		
		// 2. VIPCustomer default 생성자
		public VIPCustomer() {
			customerGrade = "VIP";
			bonusRatio = 0.05;
			saleRatio = 0.1;
		}
		
		
	}
	

	public static void main(String[] args) {
		

	}

}
