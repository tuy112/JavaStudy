package practice.practice05;

public class TakeTrans {

	public static void main(String[] args) {
		// 학생, 버스, 지하철 클래스 합치기
		// 1. 학생 생성
		Student studentJaHuk = new Student("JaHuk", 5000);
		Student studentTommy = new Student("Tommy", 15000);
		
		// 2. 노선 번호가 100번인 버스
		Bus bus100 = new Bus(100);
		studentJaHuk.takeBus(bus100); // 100번 버스를 탐
		studentJaHuk.showInfo(); // jahuk 정보 출력
		bus100.showInfo(); // 버스 정보 출력
		
		// 3. 2호선 지하철
		Subway subwayGreen = new Subway("2호선");
		studentTommy.takeSubway(subwayGreen);
		
		System.out.println("=============================");
		
		studentTommy.showInfo();
		subwayGreen.showInfo();
	}

}
