package javapractice3;

interface Eatable{
	public String eat();
}

class Apple12 implements Eatable{
	public String toString() {
		return "I am an apple";
	}
	@Override
	public String eat() {
		return "It tastes so good!";
	}
}
class Box123<T extends Eatable>{
	T ob;
	public void set(T o) {
		ob= o ;	
	}
	public T get() {
		System.out.println(ob.eat());
		return ob;
	}
}
public class Test8 {
public static void main(String[] args) {
	Box123<Apple12> box = new Box123<Apple12>();
	box.set(new Apple12());
	
	Apple12 ap = box.get();
	System.out.println(ap);
	
}
}
