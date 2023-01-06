package j02_변수;

public class Variable2 {

	public static void main(String[] args) {
		char firstName1 = '가';
		char firstName2 = '일';
		
		char alphabetA = 'A';
		
		System.out.println("김" + firstName1 + firstName2);
		System.out.println("알파벳A: " + alphabetA);
		
		System.out.println(alphabetA + 'B'); // +는 숫자끼리만 가능하기때문에 값이 숫자로 나옴!
		System.out.println(alphabetA);
		System.out.println("\uAC00"); // 16진수 유니코드
		System.out.println(firstName1 + 0);
		
	}

}
