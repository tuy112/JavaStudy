package example04;

public class example04 {

	public static void main(String[] args) {
		// Q. 아침 출근길에 김씨는 4000원을 내고 별다방에서 아메리카노를 사마셨니다. 이씨는 
		// 콩다방에서 4500원을 내고 라떼를 사마셨습니다. "객체 간 협력"을 참고하여 이 과정을
		// 객체 지향으로 프로그래밍 해보세요.
		Human cusKim = new Human("kim", 10000);
		Human cusLee = new Human("lee", 10000);
		
		StarCafe starcafe = new StarCafe("star");
		cusKim.drinkStar(starcafe);
		cusKim.showInfo();
		starcafe.showInfo();
		
		System.out.println("=============================");
		
		KongCafe kongcafe = new KongCafe("kong");
		cusLee.drinkKong(kongcafe);
		cusLee.showInfo();
		kongcafe.showInfo();
	}

}
