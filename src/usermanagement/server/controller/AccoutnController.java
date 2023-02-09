package usermanagement.server.controller;

import java.util.Map;

import usermanagement.dto.ResponseDto;
import usermanagement.entity.User;
import usermanagement.service.UserService;

public class AccoutnController {
	
	private static AccoutnController instance;
	private UserService userService;
	
	private AccoutnController() {
		userService = UserService.getInstance();
	}
	
	// 쓰레드를 사용할 때 싱글톤을 사용하면 동기화를 무조건 해줘야함!
	// 한꺼번에 접근할 수 있는 상황이 발생하기 때문에
	
	public static AccoutnController getInstance() {
			if(instance == null) {
				instance = new AccoutnController();
			}
		return instance;
	}
	
	
	public ResponseDto<?> register(String userJson) {
		
		Map<String, String> resultMap = userService.register(userJson);
		
		if(resultMap.containsKey("error")) {
			return new ResponseDto<String>("error", resultMap.get("error"));
		}
		
		return new ResponseDto<String>("ok",resultMap.get("ok"));
		
	}

}
