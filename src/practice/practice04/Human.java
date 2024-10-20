package practice.practice04;

//클래스
class Human {
	String name;
	int age;
	
	// 생성자
	public Human() {
		this("이름 없음", 1);
	}
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메서드
	public static void main(String[] args) {
		Human noName = new Human();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
