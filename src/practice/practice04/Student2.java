package practice.practice04;

public class Student2 {
	int studentID;
	String studentName;
	int koreaScore;
	int mathScore;
	
	// 과목 이름 변수 추가
	String koreaSubject;
	String mathSubject;
	
	// Student1에서 private로 만든 변수는 사용이 불가능함
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		 // studentLee.studentNum = "이말똥";
		 // Student1 클래스에 있는 studentNum 변수가 private이기 때문에 오류 발생
	}
	
}
