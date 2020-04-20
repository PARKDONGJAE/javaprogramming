package javapractice3;

class Box4<T>{
	private T ob;
	public void set(T o) {
		ob= o;
	}
	public T get() {
		return ob;
	}
	public String toString() {
		return (String) ob;
	}

}
class BoxFactory{
	public static <T extends Number> Box4<T> makeBox(T o){
	Box4<T> box = new Box4<T>();
	box.set(o);
	System.out.println(o.intValue());
	return box;
	}
}
class UnBoxer1{
	public static <T extends Number> T openBox(Box4<T> box) {
		
		System.out.println(box.get().intValue());
		return box.get();
	}
}
public class Test9 {
public static void main(String[] args) {
	Box4<Integer> ibox = BoxFactory.makeBox(new Integer(3));
	Box4<Double> dBox = BoxFactory.makeBox(4.3); // new Double 안넣어도 되는가??
	int i = UnBoxer1.openBox(ibox);
	Double a = UnBoxer1.openBox(dBox);
	System.out.println(dBox.get());
	System.out.println(ibox.get());
}
}
