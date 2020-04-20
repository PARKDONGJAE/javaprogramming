package javapractice3;

import java.util.ArrayList;

class Box<T>{
	private T t;
	public void add(T t) {
		this.t =t;
	}
	public T get() {
		return this.t;
	}
}
class MyArr<T>{
	private ArrayList<T> arr;
	public MyArr(int size) {
		this.arr = new ArrayList<T>();
	}
	public void setAl(T v) {
		arr.add(v);
	}
	public T getAl(int inx) {
		return arr.get(inx);
	}
}
public class Test3 {


public static void main(String[] args) {
		Box<Integer> a1 = new Box<Integer>();
		a1.add(new Integer(1));
		Box<String> s1 = new Box<String>();
		s1.add("HEllo Java");
		System.out.println(s1.get());

	}

}
