package j20_JSON.builder;

public class UserBuilder {
	
	private String username;
	private String password;
	private String name;
	private String email;
	
	public UserBuilder username(String username) {
		this.username = username;
		return this;
	}
	
	public UserBuilder password(String password) {
		this.password = password;
		return this;
	}
	
	public UserBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public UserBuilder email(String email) {
		this.email = email;
		return this;
	}
	
	// 이 해당 멤버 메소드를 사용하려면 해당 클래스가 생성되야 쓸 수 있음!
	public User build() { 
		// 올아규먼트 생성자가 필수적이다. // User클래스를 생성
		return new User(username, password, name, email); // User 올아규먼트 생성자에 들어가게 됨!
		// 들어가지 않는 값은 null이 들어감!
	}

}
