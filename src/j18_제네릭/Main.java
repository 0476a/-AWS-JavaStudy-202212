package j18_제네릭;

public class Main {
	
	public static void main(String[] args) {
		TestData<String, Integer> td = new TestData<String, Integer>("김삼겹", 30); // 생성될 때 자료형이 결정함!
		TestData<String, Double> td2 = new TestData<String, Double>("kimssam", 100.05); // 생성 후에는 사용 X
		// 제네릭 생략 및 와일드 카드(꼭 제네릭을 받아야 하는 경우)
		
//		TestData<?, ?> td = new TestData<>("김삼겹", 30); // 생성될 때 자료형이 결정함!
//		TestData<?, ?> td2 = new TestData<>("kimssam", 100.05); // 왠만하면 자료형을 보여주는게 좋음!
		// 한번 더 자료형을 생각하는 작업을 거치기 때문에 성능 낭비됨!
		
		System.out.println(td);
		System.out.println(td2);
		
		CMRespDto<TestData<String, Integer>> cm =
				new CMRespDto<TestData<String, Integer>>(2000, "성공", td);
		
//		CMRespDto<?> cm2 =
//				new CMRespDto<>(2000, "성공", td); // 이런식으로도 표현 가능!
		
		System.out.println(cm);
	}

}
