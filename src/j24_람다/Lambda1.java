package j24_람다;

public class Lambda1 {
	
	public static void main(String[] args) {
		Instrument instrument = new Instrument() {
			
			@Override
			public String play(String instrument) {
				return instrument + "을(를) 연주합니다.";
			}
		};
		
		System.out.println(instrument.play("피아노"));
		// 출력값 : 피아노을(를) 연주합니다.
		
		Instrument instrument2 = (String itm) -> {
			return itm + "을(를) 연주합니다.";
		};
		
		String playText = instrument2.play("드럼");
		System.out.println(playText);
		// 출력값 : 드럼을(를) 연주합니다.
		
		// 매개변수의 자료형을 생략할 수 있다.
		// 하나의 추상메소드만 사용하기 때문에 이미 자료형이 정의되어있다.
		// 매개변수의 이름을 바꿀 수 있다.
		Instrument instrument3 = (itm) -> {
			return itm + "을(를) 연주합니다.";
		};
		System.out.println(instrument3.play("베이스"));
		// 출력값 : 베이스을(를) 연주합니다.
		
		// 매개변수가 하나이면 매개변수를 감싸는 괄호를 생략할 수 있다.
		Instrument instrument4 = itm -> {
			return itm + "을(를) 연주합니다.";
		};
		System.out.println(instrument4.play("실로폰"));
		// 출력값 : 실로폰을(를) 연주합니다.
		
		// 구현부의 명령이 하나일 때 중괄호를 생략할 수 있다.
		// 이때 리턴자료형이 정해져있으면 리턴값으로 사용이 된다.
		// 중괄호가 생략되면 리턴도 같이 생략됨!
		// if문도 실행이 하나이면 중괄호가 생략되듯이 이것도 그렇다.
		Instrument instrument5 = itm -> itm + "을(를) 연주합니다.";
		System.out.println(instrument5.play("잼배"));
		// 출력값 : 잼배을(를) 연주합니다.
		
		
		// 지역변수를 넣어서 사용이 가능하다!
		int result = 10 + 20;
		
		// 지역변수에서 사용하고 있는 변수명을 사용할 수 없다.
		Instrument instrument6 = itm -> itm + "을(를) 연주합니다." + result;
		
		System.out.println(instrument6.play("기타"));
		// 출력값 : 기타을(를) 연주합니다.30
		
		// 한번만 정의해서 사용함! 한번만 사용한다. (익명 클래스와 동일)
		
		
		
		
		
		
		
	}
	
}
