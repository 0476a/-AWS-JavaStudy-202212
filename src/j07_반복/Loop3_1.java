package j07_반복;

import java.util.Scanner;

// 풀이
public class Loop3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int total = 0; // 마지막에 한번만 찍어주기 때문에 밖에 선언해준다.

		System.out.print("반복횟수: ");
		count = scanner.nextInt();
		System.out.println();

		for(int i = 0; i < count; i++) {
			int a = 0; // 매번 새롭게 값을 넣어줘야하기 때문에 지역변수로 사용
			int b = 0; // for문 이외에는 사용하지 않기 때문에 쓰고 버리려고

			System.out.println(i + 1 + "번 반복");
			System.out.print("a: ");
			a = scanner.nextInt();
			System.out.print("b: ");
			b = scanner.nextInt();

			total += a + b;
			System.out.println(i + 1 + "번 합: " + (a + b));
			System.out.println();

		}

		System.out.println("총합: " + total);
	}

}
