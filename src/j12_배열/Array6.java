package j12_배열;

public class Array6 {

	public static void main(String[] args) {

		String[] names = { "박땡땡", "조땡땡", "황땡땡" };

		for (String name : names) { // (값을 담을 수 있는 변수 선언 : 배열 or 리스트)
			// 하나씩 꺼내서 넣어주는 것 하나 빼고 사라짐
			System.out.println(name); 
			name = "김삼겹";
			System.out.println(name);
		} // 인덱스 참조가 안됨. 하나 잘못하면 고칠 수 없음! 순차적으로 하나빼고 사라짐.

		System.out.println("========<<forEach>>========");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
		}
		
		int[] nums = {1,2,3,4,5};
		
		for(int i : nums) {
			System.out.println("i: " + i);
		}

		

	}

}
