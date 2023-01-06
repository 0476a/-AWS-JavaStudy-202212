package j05_입력;

import java.util.Scanner;

// 내가한거
public class Input3 {

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
		
		System.out.print("주소: ");
		address = scanner.nextLine(); // 버퍼 문제 발생
		
		System.out.print("연락처: ");
		phoneNumber = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "살입니다.");
		System.out.println("주소는 " + address + "에 거주중입니다.");
		System.out.println("연락처는 " + phoneNumber + " 입니다.");
		

	}

}
