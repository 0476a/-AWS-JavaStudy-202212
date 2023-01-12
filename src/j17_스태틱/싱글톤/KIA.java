package j17_스태틱.싱글톤;
/*
 * 싱글톤 사용
 * 유일하게 하나만 존재하는 객체들 (ex. 회사, 유일한 객체가 되야하는 경우)이 필요한 경우
 * 여러개를 만들어야 하는 곳에는 사용 X
 */

public class KIA { // 유일한 객체가 되어버림! // 모든 영역에서 다 가지고 올 수 있다.
	
	private static KIA instance = null; // 한번 값이 들어가서 그 값을 공유함!
	
	private KIA() {} // 생성자가 private
	
	public static KIA getInstance() { // getter와 똑같음!
		if(instance == null) { // null 값인지 확인 최초로 생성하면 값이 null 임!
			instance = new KIA(); // 자기 자신 값을 넣어서 생성 (단 한번만 실행!)
		}
		return instance; // 주소값 하나만 계속 넣어줌! (단 하나의 주소값만 존재)
	}
	
	public void printCompanyName() {
		System.out.println(getClass().getSimpleName());
	}

}
