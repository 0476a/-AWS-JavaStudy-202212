package j06_조건;

public class Conditional1 {
	
	public static void main(String[] args) {
		
		int num = 10;
		int num2 = 10;
		
//		if(num > num2) System.out.println("num이 num2보다 큽니다.");
//		if(num == num2) System.out.println("num과 num2가 같습니다.");
//		if(num < num2) System.out.println("num이 num2보다 작습니다.");
		
		// 조건검사가 3번 일어남 (비용 3번 듬)
		
		if(num > num2) {
			System.out.println("num이 num2보다 큽니다.");
			System.out.println("num: " + num);
		}else if(num == num2) {
			System.out.println("num과 num2가 같습니다.");
		}else {
			System.out.println("num이 num2보다 작습니다.");
		}
			
		
		// 조건검사가 2번으로 줄어듬 (비용 2번 듬)
	}

}
