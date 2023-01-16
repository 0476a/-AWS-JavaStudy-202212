package j19_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapStringMain {
	
	public static void main(String[] args) {
		Map<String, String> strMap = new HashMap<>();
		
		strMap.put("김삼겹", "a");
		strMap.put("박김치", "b");
		strMap.put("이무쇠", "c");
		strMap.put("홍당무", "d");
		
		System.out.println(strMap);
		
		System.out.println(strMap.get("a"));
		System.out.println(strMap.get("e"));
		
		// 알파벳은 hash 값이 정해져있어서 자동으로 정렬됨
		// 글자 조합이 생기면 정렬되지 않게 나옴!
		for(String k : strMap.keySet()) { // 키값을 set으로 가져오는 것 (중복 X)
			System.out.println("key: " + k);
			System.out.println(strMap.get(k));
		}
		
		for(String v : strMap.values()) {
			System.out.println("value: " + v);
		}
		
		// key와 value가 합쳐져 entry를 하나 만든다.
//		System.out.println(strMap.entrySet()); // 한세트를 set으로 보는 것
		
		Set<Entry<String, String>> s = null;
		
		// entrySet안에 entry가 들어있기 때문에 자료형을 적어줘야함!
		for(Entry<String, String> entry : strMap.entrySet()) { 
			System.out.println(entry);
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
			System.out.println();
		}
		
		System.out.println("===================================");
		
		strMap.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
		
		
	}

}
