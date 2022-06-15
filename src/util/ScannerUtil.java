package util;

import java.util.Scanner;

//스캐너 유틸
public class ScannerUtil {

	public static final Scanner sc = new Scanner(System.in);

	// 정수
	public static int scInt() {
		int result = sc.nextInt();
		sc.nextLine();
		return result;
	}

	// 실수
	public static double scDouble() {
		double result = sc.nextDouble();
		sc.nextLine();
		return result;

	}

}
