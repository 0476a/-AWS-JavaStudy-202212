package j17_스태틱;

public class Student {
	
	private static final int CODE = 20230000;
	private static int ai = 1; //auto_increment

	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = CODE + ai;
		ai++;
		this.name = name;
	}
	
	public static int getAutoIncrement() { // 이 메소드는 생성이 없어도 사용할 수 있다.
		int num = 10; // 지역 변수는 선언 및 사용 가능!
		System.out.println("현재 AI: " + ai);
//		System.out.println("학생이름: " + name); // name은 생성 후에만 사용할 수 있음.
		                                         // 따라서 name 사용 X
		return ai;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
	
	
	
}
