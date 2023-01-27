package j17_스태틱.싱글톤;

// 연습
public class A2 { // 유일하게 하나만 존재해야함! 학생을 저장하는 공간은 A 하나만 존재해야함!
	
	private static A2 instance;
	
	private A2() {}
	
	public static A2 getInstance() {
		if(instance == null) {
			instance = new A2();
		}
		
		return instance;
	}
	
}