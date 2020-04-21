package javapractice4;

interface Animal5 {
//	void breath();
	String eat(String food);
}

//class Dog implements Animal5 {
//	@Override
//	public void breath() {
//		System.out.println("Dog breath");
//	}
//}
//
//class Cat implements Animal5 {
//	@Override
//	public void breath() {
//		System.out.println("Cat breath");
//	}
//}

public class Test7 {
	public static void main(String[] args) {
//		Dog d = new Dog();
//		d.breath();
//		Animal5 a = new Animal5() {
//			public void breath() {
//				System.out.println("Dog");
//			}
//
//		};
//		a.breath();
//		
		Animal5 a2 = (as) -> {System.out.println("Dog"); return "";};
		String str = a2.eat("Àú³á");
	}
}
