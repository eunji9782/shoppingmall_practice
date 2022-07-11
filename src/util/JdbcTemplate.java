package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {

	//연결 얻기
	public static Connection getConnection() {
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "C##KH";
		String pw = "KH";
		
		Connection conn = null; //null로 초기화
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			conn.setAutoCommit(false); //기본 설정인 오토커밋 끄기
		}catch (ClassNotFoundException e) {
			System.out.println("DB 연결 얻기 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return conn;
	}

	//커넥션 닫기
	public static void close(Connection conn) {
		if(conn != null) { //유효성 검사
			try {
				conn.close();
			}catch (SQLException e) {
				System.out.println("커넥션 닫기 중 오류");
				e.printStackTrace();
			}
		}
		
	}
	
	//prepareStatement도 가져올 수 있음
	public static void close(Statement stmt) {
		if(stmt != null) { //유효성 검사
			try {
				stmt.close();
			} catch (SQLException e) {
				System.out.println("Statement 닫기 중 오류");
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs) {
		if(rs != null) { //유효성 검사
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("ResultSet 닫기 중 오류");
				e.printStackTrace();
			}
		}
	}
	
	//commit하기
	public static void commit(Connection conn) {
		if(conn != null) { //유효성 검사
			try {
				conn.commit();
			} catch (SQLException e) {
				System.out.println("커밋 중 문제 발생");
				e.printStackTrace();
			}
		}
	}
	
	//문제 생기면 rollback
	public static void rollback(Connection conn) {
		if(conn != null) { //유효성 검사
			try {
				conn.rollback();
			} catch (SQLException e) {
				System.out.println("롤백 중 문제 발생");
				e.printStackTrace();
			}
		}
	}
	


}
