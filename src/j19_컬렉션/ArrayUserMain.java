package j19_컬렉션;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class User{
	private String username;
	private String name;
}


public class ArrayUserMain {
	
	public static void main(String[] args) {
		
		User[] userArray = {
				new User("aaa", "김삼겹"),
				new User("bbb", "박김치"),
				new User("ccc", "이무쇠"),
				new User("ddd", "홍당무")
		};
		
		List<User> userList = Arrays.asList(userArray);
		
		String searchUsername = "aaa";
		
		User user = searchUser(userList, searchUsername);
		
		if(user == null) { // 값이 null이면 해당 조건이 실행됨!
			System.out.println("검색실패!");
			System.out.println("존재하지 않는 계정입니다.");
		} else {
			System.out.println("검색성공!");
			System.out.println(searchUsername + "계정의 회원 이름은 " + user.getName() + "입니다.");
		}
		
		/*
		 * 검색성공! aaa계정의 회원 이름은 김삼겹입니다.
		 * 검색실패! 존재하지 않는 계정입니다.
		 * 
		 */
		
		
		// 내가한거.
		
		/*
		 * 문제점
		 * 하나의 반복문으로 끝내려고 함!
		 * 만약 검색 실패시에는 어떻게 할지 생각 못하고 코드 작성 (break활용 X)
		 */
		
//		for(User user : userArray) {
//			
//			if(user.getUsername().equals(searchUsername)) {
//				System.out.println("검색 성공! " + searchUsername + "계정의 회원이름은 "+ user.getName() + "입니다.");
//				 break;
//			} else {
//				System.out.println("검색실패!");
//			}
//			
//		}
		
		
		
	}
	
	
	
	// User를 찾아주는 메소드
	private static User searchUser(List<User> userList, String username) {
		User user = null; // 앞으로 null로 체크
		
		
		for(User u : userList) {
			if(u.getUsername().equals(username)) {
				user = u;
				break;
			}
		}
		
		return user;
	}

}
