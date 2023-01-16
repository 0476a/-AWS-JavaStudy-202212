package j20_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import j20_JSON.builder.User;

public class JsonMap {
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		//          Gson 생성         이쁘게 출력   null 값도 보여줘! 생성해라!
		gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
		
		Map<String, Object> user = new HashMap<>();
		user.put("username", "aaa");
		user.put("password", "1234");
		user.put("name", null);
		
		String userJson = gson.toJson(user);
		System.out.println(user); // Map
		System.out.println(userJson); // JSON
		
		//                                       (Json 문자열, Map으로 바꾼다.)
		Map<String, Object> userMap = gson.fromJson(userJson, Map.class);
		//                        (Json 문자열, User 객체로 바꾼다.)
		User userObj = gson.fromJson(userJson, User.class);
		
		System.out.println(userMap);
		System.out.println(userObj);
		
		
		// toJson을 안해줘도 Json을 사용하는 것
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("test1", "aaa");
		jsonObject.addProperty("test2", "bbb");
		jsonObject.addProperty("test3", "ccc");
		
		String jsonObjectStr = jsonObject.toString();
		System.out.println(jsonObjectStr);
		
		
	}

}
