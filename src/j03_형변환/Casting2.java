package j03_형변환;

public class Casting2 {
	

	public static void main(String[] args) {
		char char_a = 'a';
		int num = (int) char_a; // 업캐스팅! 묵시적 형 변환
		
		char char_b = (char) (num + 1); // 다운캐스팅! (항상 명시 해줘야함!) 명시적 형 변환
		
		System.out.println('a' + 1);
		System.out.println(char_b);

	}

}
