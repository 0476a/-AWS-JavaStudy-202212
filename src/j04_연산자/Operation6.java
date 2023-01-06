package j04_연산자;

public class Operation6 {
	public static void main(String[] args) {
		/*
		 * 시험 성적을 학점으로 계산하는 프로그램
		 * 
		 * 정수자료형 score변수 선언
		 * 88점으로 초기화
		 * 
		 * 문자자료형 grade변수 선언
		 * 
		 * 조건
		 * score가 0점보다 작거나 100점보다 크면 X를 출력
		 * score가 90 ~ 100점이면 A학점
		 * score가 80 ~ 89점이면 B학점
		 * score가 70 ~ 79점이면 C학점
		 * score가 60 ~ 69점이면 D학점
		 * score가 0 ~ 59점이면 F학점
		 * 
		 * 
		 */
		
		int score = 99;
		
	
//		char grade = 0 > score || score > 100 ? 'X'
//				: score / 90 == 1 ? 'A' 
//				: score / 80 == 1 ? 'B' 
//				: score / 70 == 1 ? 'C' 
//				: score / 60 == 1 ? 'D' : 'F';
		
		
		
		char grade = 0 > score || score > 100 ? 'X'
				: score > 89 ? 'A'
				: score > 79 ? 'B'
				: score > 69 ? 'C'
				: score > 59 ? 'D' : 'F';
				
//		char plus = 0 > score || score > 100 ? '\0'
//				: score > 94 ? '+'
//				: score > 89 ? '\0'
//				: score > 84 ? '+'		
//				: score > 79 ? '\0'
//				: score > 74 ? '+'		
//				: score > 69 ? '\0'
//				: score > 64 ? '+' : '\0';
				
		char plus = score > 100 || score < 60 ? '\0' 
				: score % 10 > 4 || score == 100 ? '+' : '\0';
		
//		String grade1 =  0 > score || score > 100 ? "X"
//				: score / 90 == 1 ? "A학점" 
//				: score / 80 == 1 ? "B학점" 
//				: score / 70 == 1 ? "C학점" 
//				: score / 60 == 1 ? "D학점" : "F학점";
		

		
//		if(0 > score || score > 100) {
//			grade = 'X';
//		} else if(score / 90 == 1) {
//			grade = 'A';
//		} else if(score / 80 == 1) {
//			grade = 'B';}
//		  else if(score / 70 == 1) {
//			grade = 'C';}
//		  else if(score / 60 == 1) {
//			grade = 'D';}
//		  else {
//			grade = 'F';
//					}
		
//		System.out.println("점수(" + score + "): " + grade + "학점");
				
		System.out.println("점수(" + score + "): " + grade + plus +  "학점");
		
//		System.out.println("점수(" + score + "): " + grade1 );
		
		System.out.println("점수(88): B학점" );
	}

}
