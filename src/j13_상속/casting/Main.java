package j13_상속.casting;

public class Main {
	
	public static void main(String[] args) {
		
//		View view = new UpdateView();
//		
//		view.show();

		
		Controller controller = new Controller(new MainView()); // 메인메뉴 뷰 부품 사용
		controller.run();
		
		System.out.println("프로그램 종료");
		
	}

}
