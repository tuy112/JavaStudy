
/*
 * 작성자: JH Kim
 * 작성일: 2024년 10월 17일
 * 설명: 클래스와 객체 1 -> Student 클래스 만들기
 * 		
 */

// 패키지 : 클래스 파일의 묶음
package lonelyPlace;

//1. 학생이라는 클래스
public class Student {
	
	// 2. 멤버변수 : 클래스 내부에 선언하여 객체 속성을 나타내는 변수
	int studentID;
	String studentName;
	int grade;
	String address;
	// student = 클래스
	// studentID, studentName, grade, address = 멤버변수
	
	// 3. 변수의 자료형
	// 기본 자료형 : int, long, float, double
	// 참조 자료형 : Sting(문자열), Date(날짜,시간), Student(사용자정의클래스)
	
	
	// showStudentInfo = 메서드
	public void showStudentInfo() {
		
		System.out.println(studentName + "," + address);
	}
	
	// 5. 학생 이름을 반환하는 메서드
	public String getStudentName() {
		return studentName;
	}
	
	// 6. getStudentName 가져오기 -> setStudentName
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// 7. Student 클래스에 main() 함수 추가
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "KimJay";
		
		// 똑같은 결과가 출력됨
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
	}
}
