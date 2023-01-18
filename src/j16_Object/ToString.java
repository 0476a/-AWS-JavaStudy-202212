package j16_Object;

public class ToString {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("김삼겹", 30);
		Student student2 = new Student("박김치", 10);
		Student student3 = new Student("이무쇠", 20);
		Student student4 = new Student("홍당무", 50);
		
//		String str = student1; // 스트링이 출력되긴 하지만 String에 넣을 수는 없다.
		String str = student1.toString(); // 스트링을 붙여줘야 함!
		
		System.out.println(student1); // 생성된 값을 문자로 보기 위함!
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println();
		
		System.out.println(student1.toString()); // 생성된 값을 문자로 보기 위함!
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		
		
		
		
		
		
		
		
		
//		Object obj = new Object();
//		
//		System.out.println(obj);
//		String str2 = obj; X		
//
//		
//		String str = obj.toString(); // toString();을 써줘야 String 자료형에 넣을 수 있다.
//		
//		System.out.println(str);
	}

}
