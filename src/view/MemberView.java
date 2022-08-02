package view;

import member.MemberController;
import util.ScannerUtil;

public class MemberView {
	
	
	//회원으로 들어오면 나오는 화면
	public void memberView() {
		

		System.out.println("──────── 회원 서비스 ────────");
		System.out.println();

		Loop1: while (true) {
			System.out.println("    원하시는 메뉴를 선택해주세요!");
			System.out.println();
			System.out.println("┌─────────────────────────");
			System.out.println("│       1. 회원가입 ");
			System.out.println("│       2. 로그인");
			System.out.println("│       3. 마이페이지");
			System.out.println("│       4. 쇼핑하기");
			System.out.println("│       5. 종료하기");
			System.out.println("└─────────────────────────");
			System.out.println();
			System.out.println();

			System.out.print("    메뉴 : ");
			int menu = ScannerUtil.scInt();
			System.out.println();

			switch (menu) {

			case 1:
				new MemberController().join();
				break; // 회원가입
			case 2:
				new MemberController().login();
				break; // 로그인
			case 3:
				break; // 마이페이지
			case 4:
				break; // 쇼핑하기
			case 5:
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				System.out.println("────────────────────────────────────");
				break Loop1;
			default:
				System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주세요");

			}
		}

	}


}
