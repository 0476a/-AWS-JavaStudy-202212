package j19_컬렉션;

import java.util.HashSet;
import java.util.Set;

public class StudentHashSet {
	
	private static Student searchStudent(Set<Student> students, String searchName) {
		Student student = null;
		
		for(Student s : students) {
			if(s.getName().equals(searchName)) {
				student = s;
				break;
			}
		}
		
		return student;
	}
	
	

	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		
		students.add(new Student("김삼겹", 26));
		students.add(new Student("박김치", 24));
		students.add(new Student("이무쇠", 31));
		students.add(new Student("홍당무", 32));
		
		System.out.println(students);
		
		Student student = searchStudent(students, "홍당무");
		
		if(student == null) {
			System.out.println("검색실패!");
		} else {
			System.out.println("검색성공!" + student);
		}
	}

}
