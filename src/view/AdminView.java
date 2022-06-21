package view;

import util.ScannerUtil;

public class AdminView {
		
		
		//관리자로 들어오면 나오는 화면
		public void adminView() {
			

			System.out.println("──────── 관리자 서비스 ────────");
			System.out.println();

			Loop1: while (true) {
				System.out.println("    원하시는 메뉴를 선택해주세요!");
				System.out.println();
				System.out.println("┌─────────────────────────");
				System.out.println("│       1. 상품등록 및 삭제 ");
				System.out.println("│       2. 주문서 조회");
				System.out.println("│       3. 회원조회");
				System.out.println("│       4. 종료하기");
				System.out.println("└─────────────────────────");
				System.out.println();
				System.out.println();

				System.out.print("    메뉴 : ");
				int menu = ScannerUtil.scInt();
				System.out.println();

				switch (menu) {

				case 1:
					break; // 상품
				case 2:
					break; // 주문서
				case 3:
					break; // 회원조회
				case 4:
					System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
					System.out.println("────────────────────────────────────");
					break Loop1;
				default:
					System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주세요");

				}
			}

		}
	


}
