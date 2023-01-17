package j22_익명클래스;

public class Main {
	
	public static void main(String[] args) {
		Calculator c1 = new Addition();
		
		System.out.println(c1.calc(10, 20));
		
		///////////////////////////////////////////////////////////////////
		
		// 클래스의 이름이 없어서 익명클래스라고 한다.
		// 다른 곳에서는 사용 X 여기서만 정의해서 사용 (1회성)
		// 딱 한번만 실행됨!
		// 파일만 복잡해진다. 여기서만 쓸거 같으면 익명클래스 사용
		// 추상 클래스도 가능!
		Calculator c2 = new Calculator() {
			
			@Override
			public int calc(int x, int y) {
				
				return x - y;
			}
			
		}; // 구현된 클래스이다. 임시적으로 클래스를 구현해놓음!
		   // 파일로 저장 X
		   
		System.out.println(c2.calc(200, 100));
	}

}
