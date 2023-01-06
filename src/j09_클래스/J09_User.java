package j09_클래스;

public class J09_User {
	
	String username = "aaa";
	String password = "1234";
	String name = "김종환";
	String email = "aaa@gmail.com";
	
	void printUserInfo() {
		System.out.println("아이디: " + username);
		System.out.println("비밀번호: " + password);
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
		System.out.println();
	}

}
