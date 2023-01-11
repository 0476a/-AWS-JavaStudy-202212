package j16_Object;

public class ObjectHashCode {

	public static void main(String[] args) {
		Student s1 = new Student("김삼겹", 45);
		Student s2 = new Student("김삼겹", 45);
		SubStudent s3 = new SubStudent("김삼겹", 45);
		
		// hashCode : 주소값
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode()); 
		
		System.out.println(s1.hashCode() == s2.hashCode()); // 같은 해시코드 이므로 equals 가 필요 X
		// 코드 값이 같으면 값이 같다라는 뜻
		System.out.println(s1.hashCode() == s3.hashCode()); // 객체가 달라도 값이 같이면 true 이다.
		
		
	}
}
