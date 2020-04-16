package javapractice2;

abstract class Animal{
	public abstract void breath();
	public void eat() {
		System.out.println("Animal eat");
	}
	
}
class Dog extends Animal{
	public void breath() {
		System.out.println("Dog breath");
	}
}
public class Test1 {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.breath();

	}

}
