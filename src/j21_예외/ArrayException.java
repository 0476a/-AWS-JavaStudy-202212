package j21_예외;

public class ArrayException {
	
	public static void main(String[] args) {
		
		Integer[] nums = {1, 2, 3, 4, 5};
		
		
		try {
			throw new NullPointerException(); // throw: 강제로 예외 발생! (흐름을 바꿀 때 사용) 
//			for(int i = 0; i < 6; i++) {
//				System.out.println(nums[i]);
//			}
		} catch (IndexOutOfBoundsException e) { // 다른 예외는 못잡음! (나누는 이유는 예외마다 처리하는게 다르기 때문)
			System.out.println("예외 처리함");
		} catch (NullPointerException e) {
			System.out.println("빈값 처리함");
		} catch (Exception e) { // 예외 상위 클래스 (여기서 예외를 하게 되면 업케스팅 되서 예외처리 됨!)
			System.out.println("예외 못한 예외 처리함");
		} 
		
		
		System.out.println("프로그램 정상 종료");
	}

}
