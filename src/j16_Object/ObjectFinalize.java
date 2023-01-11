package j16_Object;

class Test { // 클래스안에 외부 클래스를 만드는건 별로 않좋음 public 사용 X
	private int num;

	public Test(int num) {
		super();
		this.num = num;
		System.out.println(num + "생성");
	}
	
	
	// 가비지 컬랙터로 자동 소멸이 되므로 소멸자가 따로 없어서 사용자가 소멸 X
	// finalize 소멸을 시키고 싶지 않은 데이터가 있을 때 소멸 후 다시 그 객체를 넣어줌
	@Override
	protected void finalize() throws Throwable { // 생성 후 자동 소멸됬을 직 후에 작용
		System.out.println(num + "객체 소멸");
	}

}

public class ObjectFinalize {

	public static void main(String[] args) {
		Test test = null;
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500); // JVM에 시간적 여유를 줘서 순서대로 생성 소멸 할 수 있게 해줌!
				                   // 시간적 여유를 빼면 마음대로 소멸함!
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			test = new Test(i);
			
			test = null;
			
			System.gc(); // 가비지 컬랙터 실행! 우선순위가 저 밑에있음! JVM이 여유가 있을 때 실행
		}
		
		
	}

}
