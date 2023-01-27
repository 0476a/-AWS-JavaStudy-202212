package JavaTest1.Test9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapList {
	
	public static void main(String[] args) {
		Map<String, Object> customerMap = new HashMap<>();
		customerMap.put("name", "홍길동");
		customerMap.put("rating", "vip");
		customerMap.put("age", 30);
		
		
		Map<String, Object> customerMap2 = new HashMap<>();
		customerMap2.put("name", "김기영");
		customerMap2.put("rating", "gold");
		customerMap2.put("age", 35);
		
		
		List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
		customers.add(customerMap);
		customers.add(customerMap2);
		
		
		for(Map<String, Object> customer : customers) {
			
			for(Entry<String, Object> entry : customer.entrySet()) {
				System.out.println(entry);
			}
		}
	}
}
