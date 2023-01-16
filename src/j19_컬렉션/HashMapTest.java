package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 임시로 객체를 만들어서 사용
public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Object> dataMap = new HashMap<>();
		dataMap.put("username", "aaa");
		dataMap.put("password", "1234");
		dataMap.put("name", "김삼겹");
		dataMap.put("email", "aaa@gmail.com");

		List<String> hobby = new ArrayList<>();
		hobby.add("골프");
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("음악감상");
		System.out.println(hobby);

		// Object로 하니깐 List도 들어감! (뭐든지 들어감!)
		dataMap.put("hobbys", hobby);

		System.out.println(dataMap);

		// value 값을 따로 빼서 쓰고 싶으면 Object로 업케스팅 된 것이므로 다운케스팅 필수!
		List<String> list = (List<String>) dataMap.get("hobbys");
		System.out.println(list.get(0));
	}

}
