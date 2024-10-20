
/*
 * 작성자: JH Kim
 * 작성일: 2024년 10월 18일
 * 설명: 클래스와 객체 2
 * 		this 예약어
 * 		static 변수
 * 		
 */
package practice.practice05;

public class Practice05 {
	
	// static (정적 변수)
	public static int serialNum = 1000; // 인스턴스 생성과 상관 없이 먼저 생성됨
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

	public static void main(String[] args) {
		// Day5
		System.out.println("Day5 공부시작");
		System.out.println("=======================");
		
		// 1. 위에서 만든 static 변수 테스트
		Practice05 studentKim = new Practice05();
		studentKim.setStudentName("김재혁");
		System.out.println(studentKim.serialNum);
		studentKim.serialNum++;
		
		System.out.println("Kim 시리얼넘버 : " + studentKim.serialNum);
		
		System.out.println("=======================");
		
		// 2. 싱글톤 패턴 - Company라는 클래스에서 값을 가져옴
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}

}