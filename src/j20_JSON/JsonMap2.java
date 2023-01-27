package j20_JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonMap2 {
	
	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
		gson = new GsonBuilder().setPrettyPrinting().create();
		
		Map<String, String> user = new HashMap<>();
		Map<String, String> user1 = new HashMap<>();
		Map<String, String> user2 = new HashMap<>();
		
		
		user.put("1", "김삼겹");
		user.put("2", "박김치");
		
		user1.put("1", "홍길동");
		user1.put("2", "백길동");
		
		user2.put("1", "최친구");
		user2.put("2", "삼돌이");
		
		String userJson = gson.toJson(user);
		System.out.println(userJson);
		
		Map userMap = gson.fromJson(userJson, Map.class);
		
		System.out.println(userMap);
		
		String userJson2 = gson.toJson(userMap);
		
		System.out.println(userJson2);
		
		List<Map<String, String>> userArrays = new ArrayList<>();
		
		userArrays.add(user);
		userArrays.add(user1);
		userArrays.add(user2);
		
		for(Map<String, String> map : userArrays) {
			System.out.println(map);
			
			for(Entry<String, String> entry : map.entrySet()) {
				System.out.println(entry);
			}
		}
		
		
		
		
		
		
	}
}
