package javapractice5;

import java.util.function.Predicate;
interface CheckValue<T>{
	boolean test2(T a);
}
public class Test6 {
	static void check(Predicate<Integer> s, int a) {
		System.out.println(s.test(a));
	}
	public static void main(String[] args) {
		
		CheckValue<Integer> c = (a)-> { 
			return (a>18);
		};
		Predicate<Integer> a = (p) ->(p>18);
		System.out.println(a.test(10));
		System.out.println(c.test2(20));
		check( /*(p) -> (p>10)*/ a , 20);
	}

}
