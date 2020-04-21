package javapractice4;

class School{
	private int m = 10;
	class Student{
		void msg() {
			System.out.println(m);
		}
	}
}
public class Test5 {

	public static void main(String[] args) {
		School n = new School();
		School.Student n2 = n.new Student();
		n2.msg();
	}

}
