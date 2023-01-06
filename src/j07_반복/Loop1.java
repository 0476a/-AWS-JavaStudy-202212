package j07_반복;

public class Loop1 {

	public static void main(String[] args) {
		
		
//		for (int i = 0; i < 10 ; i++) { // i 반복 때 사용하는 임시 변수 // 후증가를 많이 사용함
//			System.out.println(i + 2);
//		} 
		
		// 10은 반복횟수
		
//		for (int i = 1; i < 11 ; i++) { // 가독성이 떨어짐. 괄호안은 고정 바꾸지 말 것
//			System.out.println(i);
//		}
		
		int total = 0;
		
		for (int i = 0; i < 100; i++) {
			total += i + 1;
		}
		
		System.out.println("총합: " + total);

	}

}
