package j19_컬렉션;

import java.awt.print.PrinterAbortException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMain {
	
	/**
	 * 
	 * CRUD
	 * 
	 * C reate
	 * R ead
	 * U pdate
	 * D elete
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		
		// * 값 추가
		strList.add("java");
		strList.add("python");
		System.out.println(strList);
		
		// 값 원하는 위치에 추가
		strList.add(1, "android");
		System.out.println(strList);
		
		// * 해당 인덱스의 값을 추출
		System.out.println(strList.get(0));
		String lang = strList.get(1);
		System.out.println(lang);
		
		// 리스트에 해당 값이 있는지 확인(T, F)
		System.out.println(strList.contains("c++"));
		System.out.println(strList.contains(lang));
		
		// 값 수정
		strList.set(2, "javascript");
		System.out.println(strList);
		
		// * 값 삭제
		strList.remove("android");
		System.out.println(strList);
		strList.remove(1);
		System.out.println(strList);
		
		// * 리스트의 크기 확인
		System.out.println(strList.size());
		
		// 리스트가 비었는지 확인
		System.out.println(strList.isEmpty());
		
		// 리스트 초기화
		strList.clear();
		System.out.println(strList.isEmpty());
		
		/* * 굉장히 많이 씀!
		 * 배열을 리스트로 변환
		 * Arrays.asList(배열);
		 */
		String[] langs = {"java", "c++", "python", "javascript"};
		List<String> tempList = Arrays.asList(langs); // 배열을 리스트로 변환
		strList.addAll(tempList); // 리스트를 한번에 add하고 싶을 때
		strList.addAll(2, tempList); // 중간 삽입 존재
		System.out.println(strList);
		
		
		// * 해당 값의 위치(index) 왼쪽 부터 찾기
		int findIndexLeft = strList.indexOf("python");
		System.out.println(findIndexLeft);
		
		// * 해당 값의 위치(index) 오른쪽 부터 찾기
		int findIndexRight = strList.lastIndexOf("java");
		System.out.println(findIndexRight);
		
		////////////////////////////////////////////////////////
		
		strList.set(1, "java");
		System.out.println(strList);
		strList.subList(strList.indexOf("java") + 1, strList.size()).indexOf("java");
		
		////////////////////////////////////////////////////////
		
		// ※ 중간의 java는 꺼내올 수 없다!
		
		// 배열 잘라내기 (시작 인덱스에서 끝 인덱스 "전"까지)
		// fromIndex 부터 toIndex전까지 리스트를 잘라냄!
		List<String> subList = strList.subList(1, 4);
		System.out.println(subList);
		
		
		System.out.println();
		// =================<< 반복 >>================
		// 일반 반복문
		for(int i = 0; i < strList.size(); i++) {
			System.out.println("[" + i + "]: " + strList.get(i));
		}
		
		System.out.println();
		
		// forEeach
		for(String str : strList) {
			System.out.println("[값]: " + str);
		}
		
		System.out.println();
		
		// 람다식 forEeach
		strList.forEach(str -> System.out.println("[값2]: " + str));
		System.out.println();
		
		// 반복자 (라이브러리 할 때 사용) 일회성
		Iterator<String> iterator = strList.iterator(); // 스택에 잠깐 쌓아놓고
		// hasNest() 다음이 있는지 확인 다음이 있으면 반복(iterator)을 실행해라!
		while(iterator.hasNext()) {
			// next();는 무조건 하나씩 꺼내주는 역할을 함!
			String lang2 = iterator.next(); // 제일 위에 있는 값들을 꺼내줌(next();)!
			System.out.println("[값3]: " + lang2);
		}
		
		System.out.println();
		
		iterator = strList.iterator();
		while(iterator.hasNext()) {
			String lang2 = iterator.next();
			System.out.println("[값3]: " + lang2);
		}
		
		
		
	}

}
