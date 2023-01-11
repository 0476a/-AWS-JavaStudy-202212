package j16_Object;

public class ObjectEquals {
	
	public static void main(String[] args) {
		String name1 = "김삼겹"; // 주소 : 100
		String name2 = "김삼겹"; // 주소 : 100
		String name3 = new String("김삼겹"); // 주소 : 200
		
	
		
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(name1 == name2); // 같은 주소가 들어와있으므로 true
		// "==" 주소를 비교하는 것
		System.out.println(name1 == name3); // 다른 주소가 들어와있으므로 false
		System.out.println(name1.equals(name3)); // true 
		
		//////////////////////////////////////////////////////////////////////////
		
		Student s1 = new Student("박김치", 20); // 주소 : 100
		Student s2 = new Student("박김치", 20); // 주소 : 200
		
		System.out.println(s1 == s2); // 다른 주소가 들어와있으므로 false
		
		///////////////////////////////////////////////////////////////////////////ㄴㄴ
		
		Student s = new Student("이무쇠", 10); // 주소 : 100
		Student s3 = s; // 주소 : 100
		Student s4 = s; // 주소 : 100
		
		System.out.println(s3 == s4); // 같은 주소가 들어와있으므로 true
		
		///////////////////////////////////////////////////////////////////////////////////
		
		Student s5 = new Student("홍당무", 20); // 주소 : 100
		Student s6 = new Student("홍당무", 20); // 주소 : 200
		SubStudent s7 = new SubStudent("홍당무", 20);
		
		System.out.println(s5.equals(s7)); 
		// s6가 업케스팅이 되서 Objcet 타입이 됨!
		// s5와 s6의 주소를 비교하고 있음!
		// equals를 오버라이드 해서 비교할 수 있는 것을 만들어 줘야함!
		// 같은 객체에서 같은 값인 것만 true
		
		
		
	}

}
