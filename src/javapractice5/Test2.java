package javapractice5;

enum Menu2{
	Pizza, Noodle
}
enum Menu3{
	Pizza(100), Noodle(200);
	int aa;
	private Menu3(int aa) {
		this.aa= aa;
	}
}
public class Test2 {
public static void main(String[] args) {
	Menu2 m = Menu2.Pizza;
	System.out.println(m);
	System.out.println(Menu2.valueOf("Pizza"));
	System.out.println(Menu2.valueOf("Pizza").ordinal());
	System.out.println(Menu3.valueOf("Pizza"));
	System.out.println(Menu3.valueOf("Pizza").aa);
}
}
