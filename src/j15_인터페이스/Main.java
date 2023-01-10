package j15_인터페이스;

public class Main {
	
	public static void main(String[] args) {
		Equipment[] equipments = new Equipment[2];
		
		equipments[0] = new GeneralCalculator(); // 일반계산기가 Equipment가 될 수도 있고 Calculator가 될 수도 있다.
		equipments[1] = new SmartPhone(); // 스마트폰이 Equipment가 될 수도 있고 Calculator가 될 수도 있다.
		
		Calculator calculator = new Computer();
		
		System.out.println("모든 장비 전원 켜기");
		for(Equipment eq : equipments) {
			eq.powerOn();
		}
		System.out.println();
		
		System.out.println("모든 장비에서 10과 20을 더하기");
		for(Equipment eq : equipments) { 
			Calculator c = (Calculator) eq; // 형태만 변한 것 (주소만 바뀐 것) 형 변환만 함!
			double result = c.plus(10, 20);
			System.out.println("결과: " + result);
		}
		System.out.println();
		
		System.out.println("모든 장비에서 10에서 0을 나누기");
		// 두가지를 모두 포함하고 있기 때문에 가능!!
		for(Equipment eq : equipments) { // equipments가 활성화 Calculator 비활성화
			Calculator c = (Calculator) eq; // 형태만 변한 것 (주소만 바뀐 것) 형 변환만 함!
			// Calculator가 활성화 equipments 비활성화 
			double result = c.division(10, 0);
			System.out.println("결과: " + result);
		}
		System.out.println();
		
		System.out.println("모든 장비 전원 끄기");
		for(Equipment eq : equipments) {
			eq.powerOff();
		}
		System.out.println();
	}

}
