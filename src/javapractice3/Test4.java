package javapractice3;
class Apple{
	public String toString() {
		return "I am apple";
	}
}
public class Test4 {

	public static void main(String[] args) {
		Apple a = new Apple();
		a.toString();
		System.out.println(a.toString());
		System.out.println(a);
	}

}
