package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

// 풀이
public class StudentArrayList2 {
	
	public static void updateYear(
			List<Student> students,
			String searchName,
			int newYear) {
		
		for(Student student : students) {
			if(student.getName().equals(searchName)) {
				student.setYear(newYear);
				return; // 밑에꺼 실행안됨! 리턴타입이 void 여서!
			}
		}
		
		System.out.println("검색 실패!");
	}

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

		boolean flag = true;
		
		for(int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if(student.getName().equals(searchName)) {
				student.setYear(4);
				flag = false;
				break; // 찾았으니깐 더이상 반복 돌릴 필요 X
			}
		}
		
		for(Student student : students) {
			if(student.getName().equals(searchName)) {
				student.setYear(4);
				flag = false;
				break; // 찾았으니깐 더이상 반복 돌릴 필요 X
			}
		}
		
		if(flag) { // flag 가 true 이면 출력 아니면 아무것도 안됨!
			System.out.println("검색 실패!!!");
		}
		
		System.out.println(students);
		
		updateYear(students, "최단기", 1);
		
		System.out.println(students);

	}

}
