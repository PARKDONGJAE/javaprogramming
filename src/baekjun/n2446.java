package baekjun;

public class n2446 {

	public static void main(String[] args) {
		int n =7;
		for (int i = 0; i < 2 * n - 1; i += 2) {

			for (int j = 2 * n - 1; j > i; j--) {
				System.out.print("*");

			}
			if (i == 2 * n - 2) {
				break;
			}
			System.out.println();

			for (int z = 0; z <= i / 2; z++) {
				System.out.print(" ");

			}

		}
		System.out.println();
		for (int i = 0; i < 2 * n - 3; i += 2) {
			for (int j = n-2; j > i / 2; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 3; j++) {
				System.out.print("*");
			}
			if(i == 2*n-4) {
				break;
			}
			System.out.println();

		}

	}
}
