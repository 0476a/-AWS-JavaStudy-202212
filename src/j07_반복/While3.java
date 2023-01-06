package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String select = null;
		
		
		while(true) { // 조건 true를 넣으면 무한 루프
			System.out.print("x입력시 멈춤: ");
			select = scanner.nextLine(); // 입력을 기다림!
			
			if(select.equals("x") || select.equals("X")) {
				System.out.println("프로그램을 멈춥니다.");
				break; // while문에 break를 건다!
			}
			
			System.out.println("계속 실행!");
		}
		
		System.out.println("프로그램 종료됨.");
		

	}

}
