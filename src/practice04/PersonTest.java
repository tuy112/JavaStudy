package practice04;

// 클래스
public class PersonTest {
	// 메소드
	public static void main(String[] args) {
		Person personKim = new Person(); // Person = 생성자
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F; 
		
		Person personLee = new Person("이순신", 175, 75); 
	}
}
