package j12_배열;

public class Array2 {

	public static void printNames(String[] names) {

		for (int i = 0; i < names.length; i++) {
			System.out.println("이름[" + (i + 1) + "]: " + names[i]);
		}

		System.out.println();
	}

	public static void main(String[] args) {

		// 1. 들어갈 값이 정해지지 않을 때 사용, 값들이 들어갈 공간이 확실할 때
		String[] names = new String[3]; // 배열 데이터가 넘어가는 거임!

		names[0] = "홍길동";
		names[1] = "청길동";
		names[2] = "백길동";

		// 2. 크기 X 안에 있는 값의 갯수로 자동으로 구해줌! , 빈공간을 만들때는 null을 넣어줘야함!
		// 넣을 값들이 정해져있는 경우 ,크기 지정 X
		String[] names2 = new String[] { "김삼겹", "김두루", "박찌개" }; // 배열을 생성하자 마자 값을 넣는다.
		String[] names3 = { "김호랑", "이박쥐", "박토끼", "코끼리" }; // 위에거 줄인거 (여기서만 줄이는게 가능!)

//		for (int i = 0; i < 3; i++) {
//			System.out.println("이름[" + (i + 1) + "]: " + names[i]);
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println("이름[" + (i + 1) + "]: " + names2[i]);
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println("이름[" + (i + 1) + "]: " + names3[i]);
//		}

		printNames(names);
		printNames(new String[] { "김삼겹", "김두루", "박찌개" });
		printNames(names3); 

	}

}
