package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JdbcTemplate;

public class MemberDao {

	
	//회원가입 시 db에 회원 정보를 저장
	public int join(Connection conn, MemberVo mv) {
		//커넥션은 service 쪽에서 가져온다
		
		//sql 작성
		String sql = "INSERT INTO MEMBERCOPY"
				+ "(NO, ID, PW, NAME, PHONE, ADDRESS, ENROLL_DATE)"
				+ "VALUES(SEQ_MEMBERCOPY_NO.NEXTVAL, ?,?,?,?,?,SYSDATE)";
		
		PreparedStatement pstmt = null; //
		int result = 0;
		
		//mv의 정보 하나씩 가져와서 셋팅
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mv.getId());
			pstmt.setString(2, mv.getPw());
			pstmt.setString(3, mv.getName());
			pstmt.setString(4, mv.getPhone());
			pstmt.setString(5, mv.getAddress());
			result = pstmt.executeUpdate(); //insert한 결과 가져오기
		}catch (SQLException e) {
			System.out.println("저장 중 문제가 발생하였습니다");
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(pstmt);
		}
		
		return result; //결과 반환
		
	}

	public int login(Connection conn, MemberVo mv) {
		String sql = "SELECT * FROM MEMBERCOPY WHERE ID=? AND PW=?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 1;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mv.getId());
			pstmt.setString(2, mv.getPw());
			rs = pstmt.executeQuery();
			if(!rs.next()) {
				result = -1;
			}
		}catch(SQLException e){
			System.out.println("SQL 문제가 발생하였습니다");
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(pstmt);
		}
		
		return result; //결과 반환
		
	}

}
