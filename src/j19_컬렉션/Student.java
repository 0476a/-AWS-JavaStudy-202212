package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor // 기본 생성자
//@RequiredArgsConstructor 

//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString

@AllArgsConstructor // 전체 생성자
@Data

public class Student {
	//@Getter // 변수위에 해주면 해당 변수의 getter가 생성
	private String name; // 이름
	private int year; // 학년
//	private final String address;
}
