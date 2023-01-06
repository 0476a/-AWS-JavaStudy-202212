package j03_형변환;

public class Casting3 {
	// 풀이

	public static void main(String[] args) {
		double kor = 87.5;
		double eng = 95.7;
		double math = 80.5;

		int total = (int) kor + (int) eng + (int) math;
		double avg = (double) total / 3.0;  // int와 int가 연산되면 값이 int가 나온다.
											// 따라서 3.0을 나눠줘야함!
											// 같은 자료형끼리만 연산이 가능함! total이 묵시적 형변환으로 double이 됨!

		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);

	}

}
