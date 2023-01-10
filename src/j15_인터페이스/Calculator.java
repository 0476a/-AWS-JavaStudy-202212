package j15_인터페이스;

public interface Calculator {
	
	// 일반 변수를 가질 수 없다. -> 상수는 가질 수 있다.
	// final이 생략 되어있음.
	public int ERROR = -9999999;
	
	
//	public double plus(double x, double y) {} // 구현 메소드 X
	
	// 모두 abstract 메소드 임으로 생략 되어있음.
	public double plus(double x, double y);
	
	public double minus(double x, double y);
	
	// 일반 메소드를 쓰려면 default를 적어줘야함!
	public default double multiplication(double x, double y) {
		
		return x * y;
	}
	
	public double division(double x, double y);
	
	
}
