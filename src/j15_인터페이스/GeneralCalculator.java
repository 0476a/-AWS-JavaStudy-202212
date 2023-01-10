package j15_인터페이스;

public class GeneralCalculator extends Equipment implements Calculator{

	// 상속 (추상클래스)
	@Override
	public void powerOn() {
		System.out.println("일반 계산기 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("일반 계산기 전원을 끕니다.");
	}

	// 구현 (인터페이스)
	@Override
	public double plus(double x, double y) {
		System.out.println("일반계산기에서 더하기 실행");
		return x + y;
	}

	@Override
	public double minus(double x, double y) {
		System.out.println("일반계산기에서 빼기 실행");
		return x - y;
	}

	@Override
	public double division(double x, double y) {
		
		System.out.println("일반계산기에서 나누기 실행");
		
		if(x == 0 || y == 0) {
			return ERROR; // Calculator에 포함되있고 implements 하고 있기에 사용가능
			
		}
		
		return x / y;
	}

}
