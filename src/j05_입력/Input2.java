package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열1: ");
		String str1 = scanner.nextLine(); // 띄어쓰기 포함 (이것만 유일하게 띄어쓰기 허용)
		
		System.out.print("문자열2: ");
		String str2 = scanner.next(); // 띄어쓰기 X 띄어쓰기 시에는 엔터와 똑같은 역할을 하게 됨!
		
		System.out.print("정수: ");
		int number1 = scanner.nextInt();
		
		System.out.print("실수: ");
		double number2 = scanner.nextDouble();
		
		System.out.println("문자열1: " + str1);
		System.out.println("문자열2: " + str2);
		System.out.println("정수: " + number1);
		System.out.println("실수: " + number2);

	}

}
