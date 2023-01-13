package j18_제네릭;

public class Main2 {
	/*
	 * ? 와일드카드 제약
	 * extends 대상 객체 하위, 대상 포함 -> 이거 더 많이씀
	 * super 대상 객체 상위, 대상 포함
	 * 
	 */
	
	
	// 멤버 메소드 : 객체가 생성되야 사용!
	public CMRespDto<?> reponse(CMRespDto<?> cmRespDto) {
		System.out.println("[응답데이터]");
		System.out.println(cmRespDto);
		return cmRespDto;
	}
	
	// <?> : 와일드 카드 (어떠한 자료형이든 들어올 수 있다.)
	// <?> == <Object>
	// Object는 모든 자료형을 담을 수 있다.
	
	public static void main(String[] args) {
		Main2 main = new Main2(); // 메인 메소드가 생성이 되야 사용이 가능! static이기 때문이다.
		
		CMRespDto<String> hello 
			= new CMRespDto<String>(200, "성공", "안녕하세요");
		
		CMRespDto<Integer> score
			= new CMRespDto<Integer>(200, "성공", 85);
		
		System.out.println("hello");
		System.out.println(main.reponse(hello)); // 생성되야만 reponse 사용 가능!
		System.out.println("score");
		System.out.println(main.reponse(score));
		// 안녕하세요.
	}

}
