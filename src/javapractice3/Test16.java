package javapractice3;
interface IAnimal5<T> {
	void set(T t);

	T get();

	void breath();
}

class Animal5<T> implements IAnimal5<T> {
	T animal;

	@Override
	public void set(T t) {
		this.animal = t;
	}

	@Override
	public T get() {

		return this.animal;
	}

	@Override
	public void breath() {
		System.out.println("Animal breath");

	}

}
class Dog4{
}
public class Test16 {
public static void main(String[] args) {
	Animal5<Dog4> a =new Animal5<Dog4>();
	a.set(new Dog4());
	Dog4 a1 = a.get();
}
}
