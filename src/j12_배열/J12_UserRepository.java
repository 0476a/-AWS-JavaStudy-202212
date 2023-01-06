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

}
