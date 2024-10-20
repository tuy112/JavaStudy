package practice04;

public class Person {
	String name;
	float height; // float : 실수 자료형
	float weight;
	
	public Person() {} // 디폴트 생성자
	
	// 이름을 매개변수(Parameter)로 입력받는 생성자 (매개변수 : 함수 선언 시 함수가 받아들일 값)
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
