package j04_연산자;

public class Operation2 {

	public static void main(String[] args) {
		int num = 10;
		
		num = num + 1;
		
//		System.out.println(++num); (선증가)  // 출력값: 12
		// num은 지금 이순간은 11이다! 이후 +1이 된다! (후증가)
		System.out.println(num++); // 출력값: 11
		System.out.println(num++); // 출력값: 12
		System.out.println(num); // 출력값: 13
	}

}
