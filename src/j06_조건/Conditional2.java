package j06_조건;

import java.util.Scanner;

public class Conditional2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		int a, b, c;   좋지 않은 방법
//		a = b = c = 0;
		
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		int min = 0;
		
		System.out.print("정수 3개 입력: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		max = a;
		min = a;
		
		if(max < b) max = b;
		if(max < c) max = c;
		
		if(min > b) min = b;
		if(min > c)min = c;
		
		System.out.println("최대값: " + max);
		System.out.println("최솟값: " + min);
	}

}
