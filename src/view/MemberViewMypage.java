package view;

import util.ScannerUtil;

public class MemberViewMypage {
	
	public void myPage() {
		
		System.out.println("──────── 마이페이지 ────────");
		System.out.println();

		Loop1: while (true) {
			System.out.println("    원하시는 세부 메뉴를 선택해주세요!");
			System.out.println();
			System.out.println("┌─────────────────────────");
			System.out.println("│       1. 비밀번호 수정 ");
			System.out.println("│       2. 주소지 수정");
			System.out.println("│       3. 주문내역 확인");
			System.out.println("│       4. 회원탈퇴");
			System.out.println("│       5. 종료하기");
			System.out.println("└─────────────────────────");
			System.out.println();
			System.out.println();

			System.out.print("    메뉴 : ");
			int menu = ScannerUtil.scInt();
			System.out.println();

			switch (menu) {

			case 1:
				break; // 비밀번호
			case 2:
				break; // 전화번호
			case 3:
				break; // 주문내역
			case 4:
				break; // 회원탈퇴
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
