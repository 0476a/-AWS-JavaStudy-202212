package usermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class RequestDto<T> {
	// 어떤 것인지 로그인인가? 회원가입인가?
	private String resource;
	private T body;
}
