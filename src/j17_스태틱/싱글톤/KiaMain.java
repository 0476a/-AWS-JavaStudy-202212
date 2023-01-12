package j17_스태틱.싱글톤;

public class KiaMain {
	
	public static void main(String[] args) {
		KIA kia = KIA.getInstance();
//		KIA kia2 = new Kia(); // 밖에서 생성자를 마음대로 호출할 수 없다.
		
		kia.printCompanyName(); // 주소(생성됨!)가 있기 때문에 호출 가능!
	}

}
