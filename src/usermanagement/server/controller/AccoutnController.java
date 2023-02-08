package usermanagement.server.controller;

import usermanagement.dto.ResponseDto;
import usermanagement.entity.User;

public class AccoutnController {
	
	private static AccoutnController instance;
	
	private AccoutnController() {}
	
	// 쓰레드를 사용할 때 싱글톤을 사용하면 동기화를 무조건 해줘야함!
	// 한꺼번에 접근할 수 있는 상황이 발생하기 때문에
	
	public static AccoutnController getInstance() {
			if(instance == null) {
				instance = new AccoutnController();
			}
		
		
		return instance;
	}
	
	public ResponseDto<?> register(User user) {
		
		return new ResponseDto<String>("ok", "회원가입 성공");
		
	}

}
