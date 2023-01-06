package j07_반복;

import java.util.Scanner;

// 풀이
public class Loop2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startNumber = 0;
		int endNumber = 0;
		
		
		System.out.print("시작: ");
		startNumber = scanner.nextInt();
		
		System.out.print("끝: ");
		endNumber = scanner.nextInt();
		
		int total = 0;
		
		for (int i = 0; i < endNumber - startNumber + 1; i++) {
			            //ex)  20     -    18       + 1  = 3번 반복 (18 + 19 + 20)
			total += startNumber + i; 
			
		}
		
		System.out.println("총합: " + total);

	}

}
