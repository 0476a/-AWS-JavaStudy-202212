package j20_JSON.builder;

public class TestMain {
	
	public static void main(String[] args) {
		
		User2 user = User2.builder()
						.username(null)
						.password(null)
						.build();
		
		System.out.println(user);
		
	}

}
