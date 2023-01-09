package j12_배열.di;

public class Main {

	public static void main(String[] args) {
		Test_C tc = new Test_C();
		Test_C tc2 = new Test_C();
		
		Test_B tb = new Test_B(tc2); // Test_B(아규먼트)

		Test_A ta = new Test_A(tb);

//		ta.setTb(tb);
		
		// di 디펜전시 인젝션
		// 객체 주입은 외부에서 일어 나야 한다.

		ta.testA1();
		ta.testA2();
	}

}
