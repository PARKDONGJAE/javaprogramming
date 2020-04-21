package javapractice4;

public class Test3 {

	public static void main(String[] args) {
		for(Menu m : Menu.values()) {
			System.out.println(m.value);
		}
	int value = Menu.valueOf("Pizza").value;
		System.out.println(value);
	}
	
}
