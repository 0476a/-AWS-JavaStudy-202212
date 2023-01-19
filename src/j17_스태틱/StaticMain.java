package j17_스태틱;

public class StaticMain {
	
	public static void main(String[] args) {
		
		System.out.println("출력1: " + TestA.getNum());
		System.out.println(); // 출력값 : 출력1: 0
		
		TestA.setNum(100); 
		System.out.println("출력2: " + TestA.getNum()); // 출력값 : 출력2: 100
	}

}
