package days01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author Inhyuk
 * @date 2023. 4. 10.
 * @subject // Ex03_02.java dept 테이블 추가( INSERT )
 * @content
 */
public class Ex03_02 {
	public static void main(String[] args) {
		// VO, DTO 객체 선언
		// 1. VO - 값을 가지는 객체( 읽기 전용, setter X )
		// 2. DTO - 값을 가지는 객체( 읽기, 쓰기 전용 ), 계층 간의 전송
		// DeptDTO.java
		// 3. DAO - DB에 로직을 처리하는 객체( CRUD )
		
		// 키보드로부터 부서번호, 부서명, 지역명을 입력받아서 반환하는 메서드 선언
		DeptDTO dto = getDept();
		// DB에 입력 정보를 INSERT하는 메서드 선언
		addDept(dto);
	}//main

	private static void addDept(DeptDTO dto) {
		// Ex03.java 복붙
		String className = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		Statement stmt = null;
		
		int deptno = dto.getDeptno();
		String dname = dto.getDname();
		String loc = dto.getLoc();
		
		/*
		String sql = "INSERT INTO dept ( deptno, dname, loc )"
					+ "VALUES ( "+deptno+", '"+dname+"', '"+loc+"' )";
		*/
		
		String sql = String.format("INSERT INTO dept (deptno, dname, loc)"
									+ "VALUES (%d, '%s', '%s')", deptno, dname, loc);
		
		try {
			// 1.
			Class.forName(className);
			// 2.
			conn = DriverManager.getConnection(url, user, password);
			// conn.setAutoCommit(true); 자동 커밋이 기본
			// 3.
			stmt = conn.createStatement();
			// stmt.executeQuery(sql); SELECT문
			int 영향받은레코드수 = stmt.executeUpdate(sql); // INSERT, UPDATE, DELETE문
			if (영향받은레코드수 == 1) {
				System.out.println("부서 추가 성공");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 4.
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static DeptDTO getDept() {
		int deptno;
		String dname, loc;
		Scanner scanner = new Scanner(System.in);

		System.out.printf("> 부서번호, 부서명, 지역명 입력하세요 : ");
		
		deptno = scanner.nextInt();
		dname = scanner.next();
		loc = scanner.next();
		
		DeptDTO dto = new DeptDTO(deptno, dname, loc);
		
		return dto;
	}

}//class
