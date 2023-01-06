package j08_메소드;

public class Method2 {

	// 함수의 위치는 main 위에있든 아래 있든 상관 X (C언어에서는 상관 O)
	// 매개변수: x, 반환: x
	public static void method1() {
		System.out.println("단순 실행");
		System.out.println();
	}
	
	// 매개변수: int 하나입력, 반환: x
	public static void method2(int num) {
		System.out.println("num: " + num);
		System.out.println();
	}
	
	// 매개변수: int 두개 입력, 반환: x
	public static void method3(int num, int num2) {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println();
	}
	
	public static String method4() {
		return "데이터 반환"; // 반환은 한가지 데이터만 반환 가능!
	}
	
	public static String method5(int age) {
		String ageStr = age + "살";
		return age + "살";
	}

	public static void main(String[] args) {
		String ageStr = "30살"; // 메소드 안에서의 변수와 main변수는 독립되어 있다!
		
		method1(); // 함수 호출 // 호이스팅! 위에서 부터 아래로 코드를 분석하는 것
		method2(100);
		method3(200, 300);
		
		System.out.println(method4());
		System.out.println();
		
		String data1 = method4();
		System.out.println(data1);
		System.out.println();
		
		System.out.println(method5(30));
		System.err.println();
		
	}

}
