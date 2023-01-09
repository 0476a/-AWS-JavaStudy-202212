package j12_배열;

public class DoubleArray1 {
	
	public static void main(String[] args) {
		
		int num = 0;
		
		int[] nums = new int[2];
		
		int[][] d_nums = new int[3][2]; // 2개짜리 배열이 3개가 생김!
		
		d_nums[0][0] = 1; // [상위][하위]
		d_nums[0][1] = 4;
		
		d_nums[1][0] = 2;
		d_nums[1][1] = 5;
		
		d_nums[2][0] = 3;
		d_nums[2][1] = 6;
		
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(d_nums[j][i]);
			}
		}
		
		System.out.println();
		
		int[][] d_nums2 = new int[][] {{1, 2, 3}, {4, 5, 6}}; // [2][3]
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(d_nums2[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] d_nums3 = new int[][] {{1, 2, 3}, {5, 6}};
		
		for(int i = 0; i < d_nums3.length; i++) {
			for(int j = 0; j < d_nums3[i].length; j++) {
				System.out.println(d_nums3[i][j]);
			}
		}
		
		System.out.println();
		
		System.out.println(d_nums2.length); // 밖에 배열의 크기 : 2
		System.out.println(d_nums2[0].length); // 안에 배열의 크기 : 3
		
		System.out.println(d_nums3[0].length); // 3
		System.out.println(d_nums3[1].length); // 2
		
	}

}
