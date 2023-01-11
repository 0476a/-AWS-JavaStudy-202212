package j16_Object;

import java.util.Objects;

public class Student {
	
	private String name;
	private int age;
	
	
	public Student(String name, int age) {
		super(); // 부모클래스의 생성자 상속받은 적이 없는데 있음
		// 부모객체 Object -> 생략되어 있음
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age); // name 과 age를 조합하여 하나의 코드를 만든다.
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// 주소값이 같으면 더 볼것도 없이 true
		if(this == obj) {
			return true;
		}
		
		// null 값이 들어가면 무조건 false
		if(obj == null) {
			return false;
		}
		
		// Student가 아닌 자료형이 들어오면 false
		if(!(obj.getClass() == Student.class)) { // 명확하게 Student 클래스 일때만 된다.
			// obj 타입이 바뀌면 false인지 true인지 값이 바뀐다.
			return false;
		}
		
		Student s = (Student) obj; // name이 Student에만 있으므로 다운캐스팅
		boolean result = name.equals(s.name) && age == s.age;
		// 같은 클래스 안에 있으므로 s.name이 됨!
		
		return result;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age;
	}
	
	

}
