package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetStringMain {

	public static void main(String[] args) {
		// 순서가 없다.
		Set<String> setStr = new HashSet<>(); // hash 값을 가지고 정렬하는 것
		List<String> listStr = new ArrayList<>();
		
		listStr.add("홍길동");
		listStr.add("백길동");
		listStr.add("홍길동");
		listStr.add("홍길동"); // 중복된 값도 들어간다.
		
		System.out.println(listStr);
		
		setStr.add("김삼겹");
		setStr.add("박김치");
		setStr.add("이무쇠");
		setStr.add("홍당무");
		setStr.add("홍당무"); // 중복된 값은 들어가지 않는다.
		setStr.addAll(listStr); // list에서 set으로 값을 넣게 되면 자동으로 중복제거가 되서 옴!
		// map은 따로 있기 때문에 addAll에 넣어줄 수 없음!
		// key와 value를 나누어서 사용하면 가능!

		System.out.println(setStr);
		String searchName = "박김치";

		for (String name : setStr) {
			if (name.equals(searchName)) {
				System.out.println(name);
			}

		}
		
		
		// map에서 반복을 돌리기 위한 방법은 람다를 제외하고 이게 유일함
		Iterator<String> iterator = setStr.iterator();
		while(iterator.hasNext()) {
			String n = iterator.next();
			if(n.equals(searchName)) {
				System.out.println(n);
			}
		}
	}
}
