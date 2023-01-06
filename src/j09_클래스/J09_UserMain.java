package j09_클래스;


public class J09_UserMain {

	public static void main(String[] args) {
		

		J09_User s1 = new J09_User();
		J09_User s2 = new J09_User();
		J09_User s3 = new J09_User();

		
		
		s1.username = "id123";
		s1.password = "1234";
		s1.name = "홍길동";
		s1.email = "id123@gmail.com";

		s1.printUserInfo();

		s2.username = "id456";
		s2.password = "5678";
		s2.name = "청길동";
		s2.email = "id456@gmail.com";
		s2.printUserInfo();

		s3.printUserInfo();
		
		
	}

}
