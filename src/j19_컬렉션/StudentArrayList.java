package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

// 내가한거
/*
 * 문제점 
 * equals 생각을 못함!
 * for문 생각이 이상하게 함
 * 
 */
public class StudentArrayList {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("김삼겹", 1));
		students.add(new Student("박김치", 2));
		students.add(new Student("이무쇠", 3));
		students.add(new Student("최장기", 4));

		System.out.println(students);

		String searchName = "이무쇠";
		// 이름이 searchName인 학생을 찾아서 학년을 4학년으로 바꿔라!
		// 만약 searchName 동일한 이름이 없으면 "검색실패" 메세지 출력

//		int index = 0;
//		
//		for (int i = 0; i < students.size(); i++) {
//			index = students.get(i).getName().indexOf(searchName);
//		}
//		
//		System.out.println(index);

//		for (int i = 0; i < students.size(); i++) {
//			while (true) {
//				boolean flag = true;
//
//				for (int j = 0; j < students.size(); j++) {
//
//					String name;
//					name = students.get(j).getName();
//
//					if (name == searchName) {
//						flag = false;
//						break;
//					}
//
//					if (flag) {
//
//					}
//			}
//			
//			}

//		}

	}

}
