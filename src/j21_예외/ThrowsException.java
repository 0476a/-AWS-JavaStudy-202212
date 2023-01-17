package j21_예외;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ThrowsException {
	
	
	// throws 예외를 미룬다. (checked Exception을 해줘 한다.)
	public static void printList(List<String> list, int size) throws IndexOutOfBoundsException{
		
		for(int i = 0; i < size; i++) {
			System.out.println("[" + i + "]" + list.get(i));
		
		}
	}
	
	
	public static void main(String[] args) {
		String[] names = {"김삼겹", "홍당무", "백김치", "박갈비"};
		
		try {
//			throw new ClassCastException();
			printList(Arrays.asList(names), 5);
			
			
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace(); // 어떤 예외가 떴는지 확인 가능함!
		} finally {
			System.out.println("무조건 실행"); 
			// Exception을 안걸어준 경우 사용
			// 예상치 못한 예외가 발생했을 때도 실행
			// 예외가 터져든 않터지든 무조건 실행
			// 해당 파일 임시저장을 해주는 느낌
			// 프로그램이 꺼지는 것을 방지 해주지는 못함!
		}
		
		System.out.println("프로그램 정상종료");
	}

}
