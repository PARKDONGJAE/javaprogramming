package javapractice5;
class Shape {
	void drwa() {
		System.out.println("draw shape");
	}
}
class Circle extends Shape{
	void drwa() {
		System.out.println("draw Circle");
	}
}
class Student {
	private String name;
	private int age;
	public Student(String a, int b) {
		this.name =a;
		this.age =b;
	}
	public void gotoSchool() {
		System.out.println(name + "이 학교에 간다.");
	}
}
public class Test8 {
public static void main(String[] args) {
	Student t = new Student("이순신", 27);
	t.gotoSchool();	
	Circle c = new Circle();
	c.drwa();
	Shape a = c;
	a.drwa();
	Shape[] s3 = new Shape[3];
	s3[0] =	new Shape();
	s3[1] = new Circle();
	s3[2] = new Circle();
	for (Shape s : s3) {
		s.drwa();
	}
}
}
