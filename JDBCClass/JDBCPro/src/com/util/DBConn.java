package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 싱글톤( Singleton )
public class DBConn {

	private DBConn() {

	}

	private static Connection conn = null;

	public static Connection getConnection(String url, String user, String password) {
		if(conn == null) {
			// 생성
			String className = "oracle.jdbc.driver.OracleDriver";

			try {
				Class.forName(className);
				conn = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//if
		return conn;
	}

	public static void close() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		conn = null;
	}

	public static Connection getConnection() {
		if(conn == null) {
			// 생성
			String className = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@192.168.10.162:1521:xe";
			String user = "scott";
			String password = "tiger";

			try {
				Class.forName(className);
				conn = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//if
		return conn;
	}

}
