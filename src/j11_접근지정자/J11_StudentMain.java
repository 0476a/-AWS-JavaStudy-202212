package j11_접근지정자;

import j11_접근지정자.default1.J11_StudentDefault; 
 // 다른 패키지에서 들어온 자료형을 들고 올때 import를 꼭 해줘야 함!

public class J11_StudentMain {

	public static void main(String[] args) {
//		J11_Student s1 = new J11_Student();
//		s1.name = "김땡땡";
		
//		s1.printInfo(); // 메소드: 은행원
		
		J11_StudentDefault s2 = new J11_StudentDefault();
		
//		s2.name = "박땡땡";
//		
//		System.out.println("이름: " + s2.name);
		System.out.println("이름: " + s2.getName()); // 항상 메소드를 통해서 가져와야 보호 가능!
		
		// 메소드는 private X 
	}
}
