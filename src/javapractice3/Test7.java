package javapractice3;
class Box2<T extends Number>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
	
}
public class Test7 {
	public static void main(String[] args) {
		Box2<Integer> a = new Box2<Integer>();
		a.set(1);
		Box2<Double> b = new Box2<Double>();
		b.set(2.0);
		
		System.out.println(a.get());
	}
}
