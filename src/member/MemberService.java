package member;

import java.sql.Connection;

import util.JdbcTemplate;

public class MemberService {
	
	//서비스는 유효성을 검사하는곳
	//트랜잭션 완수 시 커밋 작업 필
	
	private Connection conn = JdbcTemplate.getConnection();

	//회원가입
	public int join(MemberVo mv) {
		
		//비밀번호가 6자리 이상
		if(mv.getPw().length() < 5) {
			return -1;
		}
		
		//아이디는 6자리 이상
		if(mv.getId().length() < 5) {
			return -2;
		}
		
		//나머지가 빈칸이 아니어야 함 (나중에 확인해보기)
		if(" ".equals(mv.getName())||" ".equals(mv.getPhone())||" ".equals(mv.getAddress())) {
			return -3;
		}
		
		
		//위의 과정 통과하면 db에 insert
		int result = new MemberDao().join(conn, mv);
		
		
		//정상적으로 처리되면 커밋, 아니면 롤백
		if(result == 1) {
			JdbcTemplate.commit(conn);
			System.out.println("커밋 완료");
		}else {
			JdbcTemplate.rollback(conn);
			System.out.println("롤백 완료");
			
		}
		return result;
		
		
	}

	public int login(MemberVo mv) {
		if(" ".equals(mv.getId())||" ".equals(mv.getPw())) {
			return -3;
		}
		
		//위의 과정 통과하면 db로
		int result = new MemberDao().login(conn, mv);
		
		return result;
		
	}

}
