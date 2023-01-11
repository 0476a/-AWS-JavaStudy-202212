package j10_생성자;

public class J10_StudentMain {
	
	public static void main(String[] args) {
		
//		J10_Student s1 = new J10_Student(); // 출력값 : 기본 생성자 호출
		
//		J10_Student s1 = new J10_Student("김땡땡" , 10);
//		s1.printInfo(); // 출력값 : 학생 이름: 김땡땡
								  //학생 나이: 10
		
//		s1.name = "박땡땡";
		
		J10_Student s1 = new J10_Student(10); // 출력값 : 학생의 나이: 10
		J10_Student s2 = new J10_Student("김삼겹"); // 출력값 : 학생의 이름: 김삼겹
		
	}

}
