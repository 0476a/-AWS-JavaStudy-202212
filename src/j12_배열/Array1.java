package j12_배열;

public class Array1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		System.out.println(num1); // 출력값 : 10
		System.out.println(num2); // 출력값 : 20
		System.out.println(num3); // 출력값 : 30
		System.out.println(num4); // 출력값 : 40
		System.out.println(num5); // 출력값 : 50

		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(nums[i]); // 출력값 : 10
			 							 // 출력값 : 20
			 							 // 출력값 : 30
			 							 // 출력값 : 40
			 							 // 출력값 : 50
			
		}
		
	}

}
