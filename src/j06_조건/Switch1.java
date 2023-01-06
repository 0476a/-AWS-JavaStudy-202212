package j06_조건;

public class Switch1 {

	public static void main(String[] args) {
		
		String select = "F선택";
		
		switch (select) { // 시작점을 말해줌!
			case "A선택" : 
				System.out.println("PC(A)를 연결합니다.");
				break; // 멈춰줌!
			case "B선택" : 
				System.out.println("PC(B)를 연결합니다.");
				break;
			case "C선택" : 
				System.out.println("PC(C)를 연결합니다.");
				break;
			case "D선택" : 
				System.out.println("PC(D)를 연결합니다.");
				break;
			default :
				System.out.println("else와 같은 역할");
		}

	}

}
