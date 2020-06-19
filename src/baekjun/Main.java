package baekjun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		short a = scan.nextShort();
		short b = scan.nextShort();
		if (1 <=a && a <= 10000 && 1 <= b && b <= 10000) {
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
			System.out.println(a % b);
		}

	}

}
