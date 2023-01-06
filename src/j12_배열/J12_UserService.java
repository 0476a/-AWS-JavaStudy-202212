package j12_배열;

import java.util.Scanner;

// 기능을 실행하기 위한 용도 (비지니스 로직)
public class J12_UserService {

	private Scanner scanner; // 전역 변수 : 모든 공간에 사용할 수 있기 때문에 밖으로 빼둠
	// scanner = new Scanner(System.in); // 생성을 하지 않아도 클래스가 정의 될때 부터 할당 됨!
	
	
//	public J12_UserService(Scanner scanner) { // 결합도가 낮은 코드 
//		this.scanner = scanner;
//	}

	public J12_UserService() { // 결합도가 높은 코드 (생성자 호출이 있어야만 스캐너 호출)
		scanner = new Scanner(System.in); // 안에 넣은 이유 : 생성하면서 같이 생성되게끔 해줌.
		                                  // 클래스를 사용하지 않을 때 메모리를 잡아먹기 때문
	}

	public void run() {
		boolean loopFlag = true; // 지역변수로 쓰는 이유 : 하나 빠지면 다 빠져 나와서
		char select = '\0';

		while (loopFlag) {
			showMainMenu();
			select = inputSelect("메인");
			loopFlag = mainMenu(select);
		}

	}

	public void stop() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500); // 반복 돌때 0.5초씩 쉰다.
				System.out.println("프로그램 종료중...(" + (i + 1) + "/10)");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}

	private char inputSelect(String menuName) {
		System.out.print(menuName + " 메뉴 선택: ");
		char select = scanner.next().charAt(0); // next로 받고 // 문자열에서 charAt문자인덱스를 
		                                                       // 찾아줘서 문자값으로 리턴해줌.
		scanner.nextLine(); // nextLine으로 엔터를 지워줌. 회원값을 받을 때 nextLine()으로 받기 때문
		return select;
	}
	
	

	private void showMainMenu() {
		System.out.println("========<< 메인메뉴 >>========");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 등록");
		System.out.println("3. 사용자이름으로 회원 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("==============================");
		System.out.println("q. 프로그램 종료");
		System.out.println();
	}

	private boolean mainMenu(char select) {
		boolean flag = true;

		if (isExit(select)) {
			flag = false;

		} else {
			if (select == '1') {

			}else if(select == '2') {

			}else if(select == '3') {

			}else if(select == '4') {

			}else {
				System.out.println(getSelectedErrorMessage());
			}

		}
		System.out.println();
		
		return flag;
	}

	// 리팩터링 기법 : 기존 소스코드를 정리하는 개념
	private boolean isExit(char select) {
		return select == 'q' || select == 'Q';
	}
	
	private String getSelectedErrorMessage() { // 메시지 내용을 다른 클래스에도 사용할 것이기 때문에
		return "###<< 잘못된 입력입니다. 다시 입력하세요. >>###"; 
		// 메시지를 수정할 때 용이 하기 때문에 String 사용
	}

}
