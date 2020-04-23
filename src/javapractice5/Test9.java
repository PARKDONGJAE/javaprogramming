package javapractice5;

import java.util.function.BiFunction;
interface AddOp {
	int add(int a, int b);
}
public class Test9 {

	public static void main(String[] args) {
		AddOp o = new AddOp() {
			public int add(int x, int y) {
				return x+y;
			};
		};
		int r2 = o.add(2, 5);
		System.out.println(r2);
		BiFunction<Integer, Integer, Integer> d = (a,b) -> {return a+b;};
		int r = d.apply(2, 4);
		System.out.println(r);

	}

}
