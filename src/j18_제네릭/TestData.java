package j18_제네릭;
/*
 * 제네릭은 일반 자료형 못씀. 무조건 래퍼 클래스 사용
 */


public class TestData<T, E> {

	private T data1;
	private E data2; // Integer 래퍼클래스(Wrapper Class) (기본 자료형을 클래스화!)

	public TestData(T data1, E data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "TestData [data1=" + data1 + ", data2=" + data2 + "]";
	}

}
