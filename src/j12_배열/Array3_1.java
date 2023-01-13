package j12_배열;

import java.util.Random;

// 풀이
public class Array3_1 {

	public static void main(String[] args) {
		Random random = new Random();

		int[] nums = new int[10];
		
		// 탐색 기법, 선형 탐색, 순차 탐색 알고리즘
		for(int i = 0; i < nums.length; i++) { // 인덱스 값 넣기 (i 값은 인덱스 번호)
			while(true) { // 무한 루프를 돌림!
				boolean findFlag = true; // flag 값 설정
				
				int randomNum = random.nextInt(nums.length) + 1; // random값 넣기
				
				// 값이 같은지 다른지 비교
				for(int j = 0; j < nums.length; j++) {
					if(nums[j] == randomNum) { // j가 늘어날수록 randomNum 값이랑 계속 비교
						findFlag = false; // 만약 같은 값이 나오면 false 거짓 값을 넣어준다.
						break; //다른 값을 찾으면 나와야 해서 for을 나올 때 사용
					}
					
				}
				
				if(findFlag) { // findFlag가 참이어야 안에 값이 실행됨! (참, 거짓)
					nums[i] = randomNum; // 인덱스에 랜덤한 값 넣기
					break; // while을 나올 때 사용
				}
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
			

//		System.out.println(random.nextInt(10));

	}

}
