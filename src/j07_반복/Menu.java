package j07_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = "김준일";
		// 글자 위치 0 1 2
		System.out.println(name.charAt(0)); // '김'을 가져옴!

		boolean loopFlag1 = true; // Flag를 선언하는 이유 : 안쪽 프로그램 종료를 위해
		boolean loopFlag2 = true;

		while (loopFlag1) {
			char select = '\0';

			System.out.println("========<<식당 메뉴>>========");
			System.out.println("1. 김밥천국");
			System.out.println("2. 탄탄면");
			System.out.println("3. 홍대개미");
			System.out.println("4. 밥앤밥");
			System.out.println("=============================");
			System.out.println("q.프로그램 종료");
			System.out.println("=============================");

			System.out.print("식당 번호 선택: ");
			select = scanner.next().charAt(0);

			if (select == 'q' || select == 'Q') {
				loopFlag1 = false;
			} else if (select == '1') {
				loopFlag2 = true;

				while (loopFlag2) {
					System.out.println();
					System.out.println("========<<김밥천국>>========");
					System.out.println("1. 라면");
					System.out.println("2. 돌솥비빔밥");
					System.out.println("3. 오므라이스");
					System.out.println("4. 김치볶음밥");
					System.out.println("=============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q.프로그램 종료");
					System.out.println("=============================");

					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);

					if (select == 'b') {
						loopFlag2 = false; // 만약 여기 break; 사용하면 종료가 안됨!
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false; // q를 누르면 두개다 종료할 수 있게 할 수 있음!
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println("라면을 선택했습니다.");
					} else if (select == '2') {
						System.out.println("돌솥비빔밥을 선택했습니다.");
					} else if (select == '3') {
						System.out.println("오므라이스를 선택했습니다.");
					} else if (select == '4') {
						System.out.println("김치볶음밥을 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}

					System.out.println();
				}

			} else if (select == '2') {
				loopFlag2 = true;

				while (loopFlag2) {
					System.out.println();
					System.out.println("========<<탄탄면>>========");
					System.out.println("1. 탄탄면");
					System.out.println("2. 마라탄면");
					System.out.println("3. 비빔탄탄면");
					System.out.println("4. 탄탄라이스");
					System.out.println("=============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q.프로그램 종료");
					System.out.println("=============================");

					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);

					if (select == 'b') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println("탄탄면을 선택했습니다.");
					} else if (select == '2') {
						System.out.println("마라탄면을 선택했습니다.");
					} else if (select == '3') {
						System.out.println("비빔탄탄면을 선택했습니다.");
					} else if (select == '4') {
						System.out.println("탄탄라이스를 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}

					System.out.println();
				}

			} else if (select == '3') {
				loopFlag2 = true;

				while (loopFlag2) {
					System.out.println();
					System.out.println("========<<홍대개미>>========");
					System.out.println("1. 스테이크 덮밥");
					System.out.println("2. 포크슬라이스 덮밥");
					System.out.println("3. 닭목살 덮밥");
					System.out.println("4. 연어 덮밥");
					System.out.println("=============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q.프로그램 종료");
					System.out.println("=============================");

					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);

					if (select == 'b') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println("스테이크 덮밥을 선택했습니다.");
					} else if (select == '2') {
						System.out.println("포크슬라이스 덮밥을 선택했습니다.");
					} else if (select == '3') {
						System.out.println("닭목살 덮밥을 선택했습니다.");
					} else if (select == '4') {
						System.out.println("연어 덮밥을 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}

					System.out.println();
				}

			} else if (select == '4') {
				loopFlag2 = true;

				while (loopFlag2) {
					System.out.println();
					System.out.println("========<<밥앤밥>>========");
					System.out.println("1. 소고기미역국");
					System.out.println("2. 뚝배기불고기");
					System.out.println("3. 얼큰순두부");
					System.out.println("4. 제육볶음");
					System.out.println("=============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q.프로그램 종료");
					System.out.println("=============================");

					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if (select == 'b') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println("소고기미역국을 선택했습니다.");
					} else if (select == '2') {
						System.out.println("뚝배기불고기를 선택했습니다.");
					} else if (select == '3') {
						System.out.println("얼큰순두부를 선택했습니다.");
					} else if (select == '4') {
						System.out.println("제육볶음을 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
					
					System.out.println();
					
				}			
			} else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}

			System.out.println();
		}

		System.out.println("프로그램 정상 종료!");

	}

}
