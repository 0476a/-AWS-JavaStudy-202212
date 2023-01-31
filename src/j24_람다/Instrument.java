package j24_람다;

// 이곳에서 추상메소드를 하나만 만들도록 제약을 줌

@FunctionalInterface
public interface Instrument {
	
	public String play(String instrument);
	
	public default void testPrint() {
		System.out.println("테스트");
	}
}
