package j14_추상;

public class Taxi extends Transportation {

	@Override	// @시작하는 문법을 어노테이션이라 한다.
	public void go() {
		System.out.println("택시를 타고 출발");
	}
	
	@Override	// 재정의 되었다는 표시! (명시하는 이유는 : 오버라이드 됬다는 걸 표시하기 위함!)
	public void stop() {
		System.out.println("택시를 타고 도착");
	}
	
	public void checkTaxiNumber() {
		System.out.println("택시 번호 확인");
	}
}
