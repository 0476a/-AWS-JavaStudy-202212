package j01_출력;

public class Output2 {

	public static void main(String[] args) {
		int year = 5; // year 변수명!
		
		System.out.println("이름: 김준일");
		System.out.println("나이: " + (20 + year)); // 연산의 우선순위 때문에 괄호를 붙여준다.
		System.out.println("이름: 김준이");
		System.out.println("나이: " + (21 + year));
		System.out.println("이름: 김준삼");
		System.out.println("나이: " + (22 + year));
		System.out.println("이름: 김준사");
		System.out.println("나이: " + (23 + year));

	}

}
