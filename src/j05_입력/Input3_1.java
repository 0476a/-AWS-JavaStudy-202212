package j05_입력;

import java.util.Scanner;

// 풀이
public class Input3_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		String address;
		String phoneNumber;
		
		System.out.print("이름: ");
		name = scanner.next();
		
		System.out.print("나이: ");
		age = scanner.nextInt();
		scanner.nextLine(); // 허공에 하나를 버려줘야함!
		
		System.out.print("주소: ");
		address = scanner.nextLine(); // 문제 해결
		
		System.out.print("연락처: ");
		phoneNumber = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "살입니다.");
		System.out.println("주소는 " + address + "에 거주중입니다.");
		System.out.println("연락처는 " + phoneNumber + " 입니다.");
		

	}

}
