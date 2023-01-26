package usermanagement.entity;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	private int userId;
	private String username;
	private String password;
	private String name;
	private String email;
	
	// User 가 여러개의 Dtl을 가질 수 있기 때문이다.
	private List<RoleDtl> roleDtls;
	
}


