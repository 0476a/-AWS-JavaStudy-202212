package j20_JSON.builder;

public class UserMain {
	
	public static void main(String[] args) {
		// User user = new User();
		// UserBuilder가 static이므로 이렇게 가능!
		User.UserBuilder userBuilder = new User.UserBuilder();
		
		// 생성할 때 내가 원하는 변수값만 골라서 넣어줄 수 있다.
		User user2 = User.builder()
				.username("aaa")
				.password("1234")
				.name("김삼겹")
				.build(); // User를 생성
		
		
		// 외부에 클래스를 생성해줬을 때 사용
		User user3 = new UserBuilder()
				.username("bbb")
				.password("1234")
				.name("박김치")
				.build();
		
		
		System.out.println(user2);
		System.out.println(user3);
		
	}

}
