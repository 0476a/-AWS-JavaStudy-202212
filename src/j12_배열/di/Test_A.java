package j12_배열.di;

public class Test_A { 
	
//	private Test_B tb = new Test_B(); // 컴파일 시 정의는 일어나야 한다. 컴파일시 정의 됨!
	                                  // 메모리 낭비 발생
	
	private final Test_B tb; // 중간에 바뀌면 안되는 변수
	
//	public Test_A() {
//		tb = new Test_B(); // 생성시에 생성되게끔 하면 메모리 낭비 하지 않게끔 한다.
//		// 테스트 A가 생성되야 테스트 B가 생성되므로 의존도가 엄청 높아짐
//	}
	
	public Test_A(Test_B tb) { // 1. 생성자의 매개변수를 넣어서
		this.tb = tb; // 리콰이어드 아규먼트 컨설터 : 필수 매개변수를 가지는 생성자
	}
	
	// 노 아규 (기본 생성자)
	// 리콰이어드 아규(final을 선언해서 필수 매겨변수를 가지는 것)
	// 올아드 아규먼트(한개 이상의 매개변수를 모든 값을 받을때)
	
//	public void setTb(Test_B tb) { // 2. setter를 사용해서 
//		this.tb = tb;
//	}

	public void testA1() {
		System.out.println("테스트A1 메소드 호출");
//		Test_B tb = new Test_B();

		tb.testB1();
	}

	public void testA2() {
		System.out.println("테스트A2 메소드 호출");
//		Test_B tb = new Test_B();

		tb.testB1();
	}

}
