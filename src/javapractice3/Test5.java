package javapractice3;
class Box1<T>{
	private T ob;
	public void set(T o) {
		ob = o;
		
	}
	public T get() {
		return ob;
	}
}
public class Test5 {

	public static void main(String[] args) {
		Box1<String> a = new Box1<String>();
		a.set("I am so happy");
		
		Box1<Box1<String>> b = new Box1<Box1<String>>();
		b.set(a);
		
		Box1<Box1<Box1<String>>> c = new Box1<>();
		c.set(b);
		
		System.out.println(c.get().get().get());
		System.out.println(b.get().get());
		

	}

}
