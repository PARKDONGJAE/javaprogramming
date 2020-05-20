package baekjun;

import java.util.Scanner;

public class dasd {

	public static void main(String[] args) {
//		String a = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.print("ют╥б :");
//		int n = scan.nextInt();
//		for (int i = 0; i < n; i++) {
//			System.out.print("");
//			for (int j = 0; j < i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 0; i<n; i++) {
//			for (int j=n; j>i+1; j--) {
//				System.out.print("*");
//			}System.out.println();
//		}
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i<n; i++) {
			for (int j=n; j>i+1; j--) {
				System.out.print("*");
			}System.out.println();
		}

	}
}
