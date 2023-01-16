package j13_상속;

public class ExtendsMain {

	public static void main(String[] args) {
		
		KiaCar kiaCar = new KiaCar(); // 부모가 먼저 생성
		// 출력값 : 부모
				 // 자식
		
		
		kiaCar.setPrice(30000000); 
		
		System.out.println(kiaCar); // j13_상속.KiaCar@1c4af82c
		
		System.out.println(kiaCar.getPrice()); // 출력값 : 30000000
		System.out.println(kiaCar.discountPrice(20)); // 출력값 : 24000000

	}

}
