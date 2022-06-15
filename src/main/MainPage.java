package main;

import util.ScannerUtil;

public class MainPage {

	public static void main(String[] args) {

		System.out.println("──────── 캣 & 도그 쇼핑몰 ────────");
		System.out.println();

		Loop1: while (true) {
			System.out.println("    원하시는 메뉴를 선택해주세요!");
			System.out.println();
			System.out.println("┌─────────────────────────");
			System.out.println("│       1. 회원 ");
			System.out.println("│       2. 관리자");
			System.out.println("│       3. 종료하기");
			System.out.println("└─────────────────────────");
			System.out.println();
			System.out.println();

			System.out.print("    메뉴 : ");
			int menu = ScannerUtil.scInt();
			System.out.println();

			switch (menu) {

			case 1:
				break; // 회원 뷰
			case 2:
				break; // 관리자 뷰
			case 3:
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				System.out.println("────────────────────────────────────");
				break Loop1;
			default:
				System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주세요");

			}
		}

	}

}
