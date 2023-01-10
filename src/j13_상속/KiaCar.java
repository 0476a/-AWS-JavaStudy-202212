package j13_상속;

public class KiaCar extends Car {

	public KiaCar() {
		super(); // 상위 객체 부모 객체 (부모의 생성자 출력)
		System.out.println("자식");
//		super(); // 항상 부모 객체는 먼저 호출 되야함!
		// 부모가 있어야 자식이 있기 때문에
	}
	
//	@Override
//	public int discountPrice(int percentage) {
//		return super.discountPrice(percentage); // 생략 되어있음.
//	}    // 부모에 discountPrice 값을 반환 한다.

	@Override
	public int discountPrice(int percentage) { // 주소가 다른거임!
		return super.discountPrice(percentage);
	}
	
}
