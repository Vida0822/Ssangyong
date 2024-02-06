package days04;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DBConn;

/**
 * @author Inhyuk
 * @date 2023. 4. 13.
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		
		int empno;
		String ename;
		String job;
		Date hiredate;
		int deptno = 10;
		
		String sql = "{ CALL UP_SELEMP(?,?)}";
		
		Connection conn = null;
		CallableStatement cstmt = null; // 저장 프로시저, 저장 함수, 익명 프로시저 호출
		ResultSet rs = null;
		
		conn = DBConn.getConnection();
		
		try {
			cstmt = conn.prepareCall(sql);
			// ? 출력용 파라미터
			cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR); // 출력용 파라미터에 자동적으로 담김 -> ResultSet 불필요
			cstmt.setInt(2, deptno);
			cstmt.executeQuery();
			rs = (ResultSet) cstmt.getObject(1); // cursor
			
			while (rs.next()) {
				empno = rs.getInt(1);
				ename = rs.getString(2);
				job = rs.getString(3);
				hiredate = rs.getDate(4);
				
				System.out.printf("%d %s %s %s\n", empno, ename, job, hiredate);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				cstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		DBConn.close();
		
		System.out.println("=end=");

	}//main

}//class
