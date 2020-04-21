package javapractice4;

interface Calculator {
	int add(int x, int y);
}

public class Test8 {

	public static void main(String[] args) {
		Calculator c = (a, b) -> {
			int r = a + b;
			return r;

		};
		int r2 = c.add(4, 5);
		System.out.println(r2);
	}
}
