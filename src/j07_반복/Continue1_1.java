package j07_반복;

public class Continue1_1 {
	// 풀이
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i % 2 != 0) { // 홀수이면...
				continue; // 다음 반복을 계속해라! (증감식으로 이동!) 
			}

			System.out.println("i: " + i);

		}

		int i = 0;

		while (i < 10) {

			if (i % 2 != 0) {
				i++; // if가 해당 됬을 때도 증가가 되야함!
				continue;
			}
			
			System.out.println("i: " + i);
			i++; // 출력 후 증가 해줘야 함!
			
		}
		

	}
}
