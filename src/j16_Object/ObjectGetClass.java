package j16_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectGetClass {
	
	public static void main(String[] args) {
		Student student = new Student("홍길동", 30);
		
		System.out.println(student.getClass()); // 클래스에 대한 정보를 가져옴
		System.out.println(Student.class); // 클래스에 대한 정보를 가져옴
		
		System.out.println(student.getClass().getName()); 
		
		Class studentClass = student.getClass(); // getClass를 하면 불러올 수 있는 메소드들! getName, getSimpleName 등등
		
		String className = studentClass.getName();
		System.out.println("클래스 이름: " + className); // 패키지 이름까지도 나옴!
		
		String simpleName = studentClass.getSimpleName();
		System.out.println("클래스 이름만: " + simpleName); // 클래스 이름만 나옴!
		
		Field[] fields = studentClass.getDeclaredFields(); // 클래스에서 선언한 멤버 변수들을 모두 불러옴!
		for(Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println();
		
		Method[] methods = studentClass.getDeclaredMethods(); // 클래스에서 선언한 메소드들을 모두 불러옴!
		for(Method method : methods) {
			System.out.println(method);
		}
		
		
		
		
		
	}

}
