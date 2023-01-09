package j12_배열;

// 저장소(엔티티) + // 기능을 실행하기 위한 용도 (비지니스 로직) -> 비지니스 로직에 더 가까움!
public class J12_UserRepository {

	private J12_User[] userTable; // 배열이라는 부품

	public J12_UserRepository(J12_User[] userTable) {
		this.userTable = userTable;
	}
	
	public J12_User[] getUserTable() { // 외부로 가져가기 위해서
		return userTable;
	}
	
	// setter가 없는 이유는 밖에서 마음대로 배열을 늘리면 메소드들이 꼬이게 됨!
	
	public void saveUser(J12_User user) {
		extendArrayOne();
		userTable[userTable.length - 1] = user;
		//          크기 - 1 의 인덱스
	}
	
	private void extendArray(int length) {
		J12_User[] newArray = new J12_User[userTable.length + length];
		transferDataToNewArray(userTable, newArray);
		userTable = newArray;
	}
	
	private void extendArrayOne() {
		J12_User[] newArray = new J12_User[userTable.length + 1];
		transferDataToNewArray(userTable, newArray);
		userTable = newArray;
	}
	
	private void transferDataToNewArray(J12_User[] oldArray, J12_User[] newArray) {
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
	}
	
	public J12_User findUserByUsername(String username) {
		
		J12_User user = null;
		
		for(J12_User u : userTable) {
			if(u == null) { // 항상 객체는 null 체크를 해야함! 값이 null이면 내려가면 오류 발생
				continue; // 다음 반복으로 넘어가라
			} 
			if(u.getUsername().equals(username)) {
				user = u;
				break;
			}
		}
		
		return user;
	}
	
	/*
	 * 1. 사용자 이름으로 회원 조회
	 * 
	 * 2. 회원 정보 수정
	 * 		수정 할 사용자이름을 입력하세요: 
	 *   	
	 *   	========<< 수정메뉴 >>========
	 * 		<< 사용자이름: aaa >>>
	 * 		==============================
	 * 		1. 비밀번호 변경
	 * 		2. 이름 변경
	 * 		3. 이메일 변경
	 * 		==============================
	 * 		b. 뒤로가기
	 * 
	 */

}
