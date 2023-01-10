package j13_상속.casting;

import java.util.Scanner;

public class Controller {
	
	private View view;
	private Scanner scanner;
	
	public Controller(View view) { // 메인 뷰가 매개 변수로 들어감 -> 원하는 부품을 넣어서 사용
		                           // 수정 뷰가 매개 변수로 들어옴.
		this.view = view;
		scanner = new Scanner(System.in);
	}
	
	public void run() {
		boolean flag = true;
		String select = null;
		
		while(flag) {
			view.show(); // 메인 뷰에 있는 show() 가 호출 -> 수정 뷰에 있는 show() 가 호출
			System.out.print("명령 입력: ");
			select = scanner.nextLine();
			flag = view.menu(select); // 메인 메뉴 뷰이다. -> 수정 메뉴 뷰이다.
			System.out.println();
		}
	}

}
