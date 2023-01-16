package j20_JSON.builder;

import lombok.Builder;
import lombok.Data;

//@AllArgsConstructor // 빌더 패턴을 만들 때는 필수 적이다.

@Builder //@AllArgsConstructor 안에 들어있다.!
@Data
	public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	
	// username만 따로 넣거나 password만 따로 넣고 싶을 때 생성자를 사용하게 되면
	// 매개변수의 자료형이 같아서 사용할 수 없다. 
	// 이러한 문제가 생겼을 때 사용하는 것이 builder 패턴이다.
	// 빌더 패턴을 사용해서 넣고 싶은 변수에만 값을 넣을 수 있다.
	
//	public User(String username) { 
//		this.username = username;
//	}
//	
//	public User(String password) {
//		this.password = password;
//	}
	
	
//	public static UserBuilder builder() {
//		return new UserBuilder(); // 이게 생성되서 UserBuilder 클래스의 메소드를 사용 가능하다!
//	}
//
//	// 그냥 바로 생성해주기 위해 static을 사용함!
//	@Data
//	public static class UserBuilder { // static이므로 User가 생성되지 않아도 사용 가능!
//		private String username;
//		private String password;
//		private String name;
//		private String email;
//		
//		public UserBuilder username(String username) {
//			this.username = username;
//			return this;
//		}
//		
//		public UserBuilder password(String password) {
//			this.password = password;
//			return this;
//		}
//		
//		public UserBuilder name(String name) {
//			this.name = name;
//			return this;
//		}
//		
//		public UserBuilder email(String email) {
//			this.email = email;
//			return this;
//		}
//		
//		// 이 해당 멤버 메소드를 사용하려면 해당 클래스가 생성되야 쓸 수 있음!
//		public User build() { 
//			// 올아규먼트 생성자가 필수적이다. // User클래스를 생성
//			return new User(username, password, name, email); // User 올아규먼트 생성자에 들어가게 됨!
//			// 들어가지 않는 값은 null이 들어감!
//		}
//	}

}
