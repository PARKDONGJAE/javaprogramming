package baekjun;

import java.util.Scanner;

public class n2562 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] answer = new int[9];
		for (int i = 0; i < 9; i++) {
			answer[i] = scan.nextInt();

		}
		int ans =answer[0];
		for (int j = 0; j < 9; j++) {
			if (answer[j] >ans) {
				ans = answer[j];

			}

		}
		System.out.println(ans);
		for (int i = 0; i < 9; i++) {
			if (answer[i] == ans) {
				System.out.print(i + 1);
			}
		}

	}
}
// int a1 = scan.nextInt();
// // System.out.println();
// int a2 = scan.nextInt();
// if (a1 < a2) {
// ans = a2;
// } else {
// ans = a1;
// }
// int a3 = scan.nextInt();
// if (ans < a3) {
// ans = a3;
// } else {
// ans = ans;
// }
// int a4 = scan.nextInt();
// if (ans < a4) {
// ans = a4;
// } else {
// ans = ans;
// }
// int a5 = scan.nextInt();
// if (ans < a5) {
// ans = a5;
// } else {
// ans = ans;
// }
// int a6 = scan.nextInt();
// if (ans < a6) {
// ans = a6;
// } else {
// ans = ans;
// }
// int a7 = scan.nextInt();
// if (ans < a7) {
// ans = a7;
// } else {
// ans = ans;
// }
// int a8 = scan.nextInt();
// if (ans < a8) {
// ans = a8;
// } else {
// ans = ans;
// }
// int a9 = scan.nextInt();
// if (ans < a9) {
// ans = a9;
// } else {
// ans = ans;
// }
// System.out.println(ans);
// if (ans == a1) {
// System.out.println(1);
// } else if (ans == a2) {
// System.out.println(2);
// } else if (ans == a3) {
// System.out.println(3);
// } else if (ans == a4) {
// System.out.println(4);
// } else if (ans == a5) {
// System.out.println(5);
// } else if (ans == a6) {
// System.out.println(6);
// } else if (ans == a7) {
// System.out.println(7);
// } else if (ans == a8) {
// System.out.println(8);
// } else if (ans == a9) {
// System.out.println(9);
// }
