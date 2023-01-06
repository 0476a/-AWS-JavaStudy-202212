package j09_클래스;

public class J09_StudentMain {
	
	public static void main(String[] args) {
		
//		int a;
//		System.out.println(a); // 스택 영역이라 초기화 해야함!
		
		
		// J09_Student 클래스 자료형에만 담을 수 있다.
		J09_Student s1 = new J09_Student(); // 그냥 생성된 인스턴스를 객체라 부름! (이 자체가 객체) 
	//    클래스   변수        인스턴스
		J09_Student s2 = new J09_Student(); // 생성자 호출이 가장 먼저 되고 메모리 할당 하고 변수에 저장
		
		s1.name = "김준일";
		s1.age = 30;
		
		s1.printInfo();
		
		s2.printInfo();
		
		
//		J09_Student student1 = new J09_Student(); // 리턴값이 없는데에도 호출하고 대입이 가능함!
//		J09_Student student2 = new J09_Student(); // 항상 주소값이 들어감!
//		
//		System.out.println(student1);
//		System.out.println(student2);
	}

}
