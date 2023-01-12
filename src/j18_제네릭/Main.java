package j18_제네릭;

public class Main {
	
	public static void main(String[] args) {
		TestData<String, Integer> td = new TestData<String, Integer>("김삼겹", 30); // 생성될 때 자료형이 결정함!
		TestData<String, Double> td2 = new TestData<String, Double>("kimssam", 100.05); // 생성 후에는 사용 X
		// 제네릭 생략 및 와일드 카드(꼭 제네릭을 받아야 하는 경우)
		System.out.println(td);
		System.out.println(td2);
	}

}
