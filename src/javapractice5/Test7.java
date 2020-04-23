package javapractice5;

class Calc2 {
	public int add( int a , int b) {
		int c = a+b;
		return c;
	}
	public static int subtract(int a, int b) {
		return a-b;
	}
}
public class Test7 {
	static int add2(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		Calc2 c = new Calc2();
		int r = c.add(1, 3);
		System.out.println(r);
		int r2 = Calc2.subtract(3, 6);
		System.out.println(r2);
		System.out.println(add2(4,5));
		System.out.println(Test7.add2(1,5));

	}

}
