package j07_반복;

public class Continue {
	
	// 내가한거..
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
				continue;
			}
			
			i++;

		}

		System.out.println("i: " + i);
		
	}
}
