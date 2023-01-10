package j10_생성자;

public class J10_Student {

	// 멤버 변수(레퍼런스 변수, 참조 변수)
	public String name;
	public int age;

	J10_Student() { // 노 아규먼트 
		System.out.println("기본 생성자 호출"); // 리턴값 주소값
	}

	// 리콰이어드 아규먼트 : final이 붙어야함!
	
	J10_Student(int age) {
		System.out.println("학생의 나이: " + age);
	}

	J10_Student(String name) {
		System.out.println("학생의 이름: " + name);
	}

	// 올 아규먼트 (모든 멤버변수가 매개변수 되있음!)

	J10_Student(String name, int age) { // 생성자를 호출 할때 값을 넣어주기 위함!
		// 지역 변수 // 멤버 변수와 지역 변수는 구분 된다!
		this.name = name;
		this.age = age; // 지역 변수의 우선순위가 높다! 지역 변수 > 멤버 변수
		// this : 자기 자신의 주소
	}

	// 멤버 메소드(레퍼런스 메소드, 참조 메소드)

	void printInfo() {
		System.out.println("학생 이름: " + name); // 멤버 변수가 가지고 있는 데이터 출력
		System.out.println("학생 나이: " + age);
	}

}
