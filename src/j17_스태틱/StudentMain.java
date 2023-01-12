package j17_스태틱;

public class StudentMain {
	
	public static void main(String[] args) {
		
		System.out.println(Student.getAutoIncrement());
		
		Student[] students = new Student[5];
		Teacher[] teachers = new Teacher[5];
		
		students[0] = new Student("김삼겹");
		students[1] = new Student("박김치");
		students[2] = new Student("이무쇠");
		students[3] = new Student("홍길동");
		students[4] = new Student("청길동");
		
		teachers[0] = new Teacher("백길동1");
		teachers[1] = new Teacher("백길동2");
		teachers[2] = new Teacher("백길동3");
		teachers[3] = new Teacher("백길동4");
		teachers[4] = new Teacher("백길동5");
		
//		Student s = new Student("백길동");
//		
//		String name = s.toString();
//		
//		System.out.println(s);
		
		// 2가지 이상 시에 더 편리
		for(int i = 0; i < students.length; i++) { // 인덱스가 필요한 경우! (반복되는 인덱스 값이 같을 때)
			System.out.println(students[i]);
			System.out.println(teachers[i]);
			System.out.println();
		}
		
		System.out.println();
		
		// 하나의 객체 사용시 좋음!
		int j = 0; // j라는 변수의 낭비 발생! 이 방법은 좋지 않다!
		for(Student student : students) {
			System.out.println(student);
			System.out.println(teachers[j]);
			System.out.println();
			j++;
		}
		
		System.out.println(Student.getAutoIncrement());
		
	}

}
