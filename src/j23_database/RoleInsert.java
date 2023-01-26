package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class RoleInsert {
	
	// SQL과 Spring 툴을 연결하기 위해서 해당 정보들을 담아오기 위해 DBConnectionMgr 변수 선언!
	private DBConnectionMgr pool;
	
	// 해당 메소드 호출 시 바로 DBConnectionMgr 생성되게 함.
	public RoleInsert() {
		pool = DBConnectionMgr.getInstance();
	}
	
	// saveRole는 role_mst에 값을 넣어주는 메소드를 선언함.
	// String 자료형인 roleName 받음.
	public int saveRole(String roleName) {
		int successCount = 0;
		
		// 해당 변수들은 전역 변수로 하여금 다른 지역에도 사용할 수 있게끔 빼놓음!
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// pool 변수에 getConnection(); 메소드를 사용하여 SQL과 자바프로그램을 연결시켜줌.`
			// Connection 자료형을 리턴값으로 둠!
			// Driver 메니저를 들고 옴!
			con = pool.getConnection();
			
			// sql 변수에 사용하고 싶은 쿼리를 작성해줌.
			// "?"는 아무 값이나 들어 올 수 있음!
			sql = "insert into role_mst values (0, ?)";
			
			// Connection 변수에 prepareStatement 메소드를 사용해서 쿼리를 생성해줌.
			// 값을 넣을 수 있는 주소를 생성해줌.
			// 작성한 sql 문과 키값을 생성해줌.
			pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			// 값을 넣어줌. 여기서 "1"은 "?"의 인덱스 값이다.
			// 인덱스값과 넣고 싶은 값을 넣어서 추가해줌.
			pstmt.setString(1, roleName);
			
			// insert, update, delete 명령 실행 해줌. (몇개가 적용이 됬는지 리턴해줌.)
			successCount = pstmt.executeUpdate();
			
			// key 값을 받을 newKey 변수 선언
			int newKey = 0;
			
			// pstmt 변수에 getGeneratedKeys(키 자동 생성) 메소드를 사용해서 생성된 값들의 
			// 키값을 설정해주고 ResultSet 자료형 변수에 대입해줌.
			rs = pstmt.getGeneratedKeys();
			
			// rs 변수에서 next 메소드로 해당 key 값이 무엇인지 확인하고
			// 해당 값을 rs변수에 getInt메소드를 사용해서 newKey 변수에 대입해줌.
			if(rs.next()) {
				// "1" 은 컬럼 인덱스를 나타냄!
				newKey = rs.getInt(1);
			}
			
			// 만약 newKey 값이 0이 아니라면 "새로운 키값: " + newKey 출력
			// newKey 값이 0이라면 "키가 생성되지 않음" 출력
			System.out.println(newKey != 0 ? "새로운 키값: " + newKey : "키가 생성되지 않음" );
			
		} catch (Exception e) {
			e.printStackTrace();
			// finally는 try문이 실행되면 무조건 실행됨!
		} finally {
			// 연결을 끊어주는 역할을 함!
			pool.freeConnection(con, pstmt, rs);
		}
		
		// 명령이 몇개가 실행되었는지 값을 리턴해줌! 
		return successCount;
	}
	
	public static void main(String[] args) {
		
		// RoleInsert 자료형 변수를 생성해준다.
		// -> DBConnectionMgr가 생성됨!
		RoleInsert roleInsert = new RoleInsert();
		
		// 리턴값이 명령이 실행된 횟수를 받는 것이므로 int 자료형에 대입을 해줌.
		// 해당 클래스에 saveRole 메소드에 "ROLE_TESTER" 값을 인수로 넣어서 
		// "ROLE_TESTER" 값이 추가 되게 함!
		int successCount = roleInsert.saveRole("ROLE_TESTER");
		
		// 명령의 성공 횟수를 리턴받아 출력 해준다.
		System.out.println("insert 성공 건수: " + successCount);
	}

}
