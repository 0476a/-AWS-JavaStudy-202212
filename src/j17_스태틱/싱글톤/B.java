package j17_스태틱.싱글톤;

import java.util.Scanner;

public class B {
	

	public void insertStudent() {
		Scanner scanner = new Scanner(System.in); // 여기서만 써서 지역으로 씀!

		System.out.print("학생이름: ");
		String name = scanner.nextLine(); // 학생이름 받기

		Student student = new Student(name); // 학생을 생성
		A.getInstance().addStudent(student); // a클래스에 addStudent 메소드에 학생 주소를 전달
		A.getInstance().showStudents();
	}

}
