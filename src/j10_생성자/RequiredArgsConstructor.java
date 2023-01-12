package j10_생성자;

public class RequiredArgsConstructor {

	private final int NUM;
	private final int NUM2;
	private int num3;
	private int num4;
	
	
	public RequiredArgsConstructor(int NUM, int NUM2) {
		this.NUM = NUM;
		this.NUM2 = NUM2;
	}
	
	public RequiredArgsConstructor(int NUM, int NUM2, int num3) {
		this.NUM = NUM;
		this.NUM2 = NUM2;
		this.num3 = num3;
	}
	
	
}
