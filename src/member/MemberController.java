package member;

import util.ScannerUtil;

public class MemberController {
	
	
	public void join(){
		
		
		//회원가입
		System.out.println("──────── 회원가입 ────────");
		System.out.println("──────아이디, 비밀번호는 6글자 이상 / 공백없이 작성해주세요 ────────");
		System.out.println();

			System.out.print("    아이디 : ");
			String id = ScannerUtil.sc.nextLine();
			System.out.print("    비밀번호 : ");
			String pw = ScannerUtil.sc.nextLine();
			System.out.print("    이름 : ");
			String name = ScannerUtil.sc.nextLine();
			System.out.print("    전화번호 : ");
			String phone = ScannerUtil.sc.nextLine();
			System.out.print("    주소 : ");
			String address = ScannerUtil.sc.nextLine();
			
			MemberVo mv = new MemberVo(id, pw, name, phone, address);
			
			//비밀번호 유효성, 나머지 빈칸인지 확인시키기
			int result = new MemberService().join(mv);
			
			//실행결과
			if(result == 1) {
				System.out.println("회원가입 성공! 환영합니다");
			}else if(result == -1) {
				System.out.println("비밀번호는 6글자 이상이어야 합니다.");
			}else if(result == -2) {
				System.out.println("아이디는 6글자 이상이어야 합니다. 다시 입력해주세요");
			}else if(result == -3) {
					System.out.println("빈 항목이 있습니다. 빠짐없이 작성해주세요");
			}else {
				System.out.println("회원가입 실패");
			}
			
			
			
	}

}
