package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import usermanagement.entity.User;

public class UserInsert {

	public int saveUser(User user) {
		int successCount = 0;

		DBConnectionMgr pool = DBConnectionMgr.getInstance();

		String sql = null;

		// try 안에서 사용되면 밖에서 사용 X (다른데도 사용하기 위해서 전역변수로 빼줌)
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// DBConnectionMgr -> Connection 생성 (데이터 베이스 실행! 데이터베이스와 자바를 연결해라!)
			connection = pool.getConnection();

			// 쿼리문
			sql = "insert into user_mst\r\n" + "values (0, ?, ?, ?, ?)";

			// Connection -> PreparedStatement 생성 (에디터에 쿼리 작성해서 넣음!) 객체 생성
			preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			// 작은 따움표 포함해서 넣어줌 (데이터를 넣어줌!)
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getName());
			preparedStatement.setString(4, user.getEmail());

			// insert, update, delete 명령 실행 (몇개가 적용이 됬는지 리턴해줌.)
			successCount = preparedStatement.executeUpdate();

			// 생성된 키값들을 들고 오는 것
			resultSet = preparedStatement.getGeneratedKeys();

			// next는 resultSet이 해당 객체를 가르키고 있음!
			if (resultSet.next()) {
				// 키 값이 int 임!
				System.out.println("이번에 만들어진 user_id Key값 : " + resultSet.getInt(1));
				user.setUserId(resultSet.getInt(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return successCount;
	}

	public int saveRoles(Map<String, Object> map) {
		int successCount = 0;

		DBConnectionMgr pool = DBConnectionMgr.getInstance();
		String sql = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		List<Integer> roles = (List<Integer>) map.get("roles");
		User user = (User) map.get("user");

		try {
			

//			sql = "insert into role_dtl\r\n"
//					+ "values \r\n"
//					+ "	(0, ?, ?)";

//			preparedStatement = connection.prepareStatement(sql);
//			
//			for(int i = 0; i < rolse.size(); i++) {
//				preparedStatement.setInt(1, rolse.get(i));
//				preparedStatement.setInt(2, user.getUserId());
//				successCount = preparedStatement.executeUpdate();

			connection = pool.getConnection();
			
			int listSize = 2;

			sql = "insert into role_dtl values";
			String values = "(0, ?, ?)";

			for (int i = 0; i < listSize; i++) {
				sql += values;
				if (i < listSize - 1) {
					sql += ",";
				}
			}
			System.out.println(sql);

			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, roles.get(0));
			preparedStatement.setInt(2, user.getUserId());
			preparedStatement.setInt(3, roles.get(1));
			preparedStatement.setInt(4, user.getUserId());
		
			successCount = preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return successCount;
	}

	public static void main(String[] args) {

		UserInsert userInsert = new UserInsert();

		User user = User.builder().username("sss").password("1234").name("sss").email("sss@gamil.com").build();

		int successCount = userInsert.saveUser(user);

		System.out.println("쿼리 실행 성공: " + successCount + "건");

		System.out.println(user);

		/* ============================================================ */

		List<Integer> roleIdList = new ArrayList<>();
		roleIdList.add(2);
		roleIdList.add(3);

		Map<String, Object> map = new HashMap();
		map.put("user", user);
		map.put("roles", roleIdList);

		successCount = userInsert.saveRoles(map);
		
		System.out.println("쿼리 실행 성공: " + successCount + "건");

	}

}
