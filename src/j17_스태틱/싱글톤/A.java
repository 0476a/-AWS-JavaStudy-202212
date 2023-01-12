package j17_스태틱.싱글톤;

public class A { // 유일하게 하나만 존재해야함! 학생을 저장하는 공간은 A 하나만 존재해야함!
	
	private Student[] students;
	
	private static A instance = null; // 주소값 null
	
	private A() {
		students = new Student[3];
	}
	
	
	// 그냥 getter 그 자체
	public static A getInstance() {
		if(instance == null) { // 주소값이 null 인지 확인 (한번도 생성되지 않았으면 참)
			instance = new A(); // 단 한번만 생성해줌 (ex. 주소값 : 100)
		}
		return instance; // getInstance를 호출 할때 마다 주소값(100) 하나만 계속 반환함!
	}
	
	public void addStudent(Student student) { // 학생을 추가하겠다! 
		
		for(int i = 0; i < students.length; i++) { // 학생 배열에 비는 공간이 있는지 확인
			if(students[i] == null) { // 값이 비어있다!
				students[i] = student; // 값을 넣어라!
				return; // 학생 값이 들어가면 반복을 끊어 줘야함! 
				        // break를 사용해서 반복만 멈추면 밑에 출력문이 출력됨!
				        // return을 사용하면 메소드가 끝남! (void 사용 중이기에 가능함!) 
			}
		}
		
		System.out.println("더 이상 학생을 추가할 수 없습니다.");
		System.out.println();
	}
	
	public void showStudents() {
		for(Student student : students) {
			System.out.println(student);
		}
		System.out.println();
	}

}
