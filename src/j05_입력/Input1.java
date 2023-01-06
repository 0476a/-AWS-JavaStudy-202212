package j05_입력;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int inputnum1 = 0; // 변수의 선언은 윗쪽에 몰아서 해주는 것이 좋다!
		int inputnum2 = 0; // 내가 어떤 변수를 사용했는지 한번에 확인 할 수 있기 위해서
		int inputnum3 = 0; // 기본값이 초기화 되있어야 좋다!
		int inputnum4 = 0;
		int inputnum5 = 0;
		
//		int inputNum = scanner.nextInt();
		
//		System.out.println("입력값: " + inputNum);
		
		System.out.print("입력1: ");
		inputnum1 = scanner.nextInt(); // 입력 후 엔터하면 다음 줄로 넘어감!
		System.out.print("입력2: ");
		inputnum2 = scanner.nextInt(); // 정수만 입력가능!
		System.out.print("입력3: ");
		inputnum3 = scanner.nextInt();
		System.out.print("입력4: ");
		inputnum4 = scanner.nextInt();
		System.out.print("입력5: ");
		inputnum5 = scanner.nextInt();
		
		
		System.out.println("입력값: " + (inputnum1 + inputnum2 + inputnum3 + inputnum4 + inputnum5));
	

	}

}
