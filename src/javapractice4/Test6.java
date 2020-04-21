package javapractice4;

class Outer {
	private static int num = 0;

	static class Nested1 {
		void add(int n) {
			num += n;
		}
	}

	class Nested2 {
		int get() {
			return num;
		}
	}
}

public class Test6 {
	public static void main(String[] args) {
		Outer t = new Outer();
		Outer.Nested1 s = new Outer.Nested1();
		s.add(10);
		s.add(20);
		Outer.Nested2 n = t.new Nested2();
		System.out.println(n.get());
	}
}
