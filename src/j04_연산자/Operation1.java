package j04_연산자;

public class Operation1 {

	public static void main(String[] args) {
		int add = 1 + 2;
		int sub = 10 - 5;
		int mul = 10 * 2;
		int div = 10 / 4; // 정수와 정수를 나누면 정수값(몫)만 나오게 됨!
		int remainder = 10 % 5; // 나머지가 0이다는 것은 5의 배수이다.

		System.out.println(add); // 출력값 : 3
		System.out.println(sub); // 출력값 : 5
		System.out.println(mul); // 출력값 : 20
		System.out.println(div); // 출력값 : 2
		System.out.println(remainder); // 출력값 :0 
		
		System.out.println(remainder == 0 ? "5의 배수이다." : "5의 배수가 아니다."); // 삼항 연산자
		// 출력값 : 5의 배수이다.
	}

}
