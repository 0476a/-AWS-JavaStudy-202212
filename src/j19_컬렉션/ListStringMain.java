package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class ListStringMain {

	public static void main(String[] args) {
		String[] strArray = new String[] { "java", "python", "C++" };

		// "html" 추가
		String[] newStrArray = new String[strArray.length + 1];

		for (int i = 0; i < strArray.length; i++) {
			newStrArray[i] = strArray[i];
		}

		newStrArray[strArray.length] = "html";

		System.out.println("[strArray]");
		for (String str : strArray) {
			System.out.println(str);
		}

		System.out.println();

		System.out.println("[newStrArray]");
		for (String str : newStrArray) {
			System.out.println(str);
		}
		System.out.println();
		
		///////////////////////////////////////////////////////////////
//		new ArrayList<>().add("test"); // 변수에 넣어주지 않아서 쓸 수 없는 객체가 되어버림!
//		new ArrayList<>().add("test"); // 다른 공간임! 좋지 않은 방법임! 사용 X
		
		// 자료구조와 알고리즘
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("java");
		strList.add("python");
		strList.add("C++");
		strList.add("html");
		strList.remove("java"); // 해당 값을 지움! (인덱스 정리까지 해줌!)
		strList.add(1, "java"); // 원하는 인덱스에 추가해줌!
		strList.remove(1); // 인덱스 찾아서 지워줌!
		
		
		for(int i = 0; i < strList.size(); i++) { // size() 크기를 뜻함! 
			System.out.print("[" + i + "]: ");
			System.out.println(strList.get(i));
		}
		
		System.out.println();
		
		for(String str : strList) {
			System.out.println(str);
		}
		
		
	}

}
