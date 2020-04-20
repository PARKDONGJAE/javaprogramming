package javapractice3;
class Animal<T>{
	T b;
	void setbreath(T b) {this.b= b;}
	T getBreath(){
		return b;
	}
}
class Dog{
	@Override
	public String toString() {
		return "Dog";
	}
}
class Cat{
}
public class Test1 {

	public static void main(String[] args) {
		Animal<Dog> a = new Animal<Dog>();
		a.setbreath(new Dog());
		Dog d = a.getBreath();
		Animal<Cat> b = new Animal<Cat>();
		System.out.println(a.getBreath());
		System.out.println(a.toString());
	}

}
