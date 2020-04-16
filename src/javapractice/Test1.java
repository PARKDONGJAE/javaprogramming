package javapractice;
class Student{
protected String name;
protected int age;

public Student() {
	this.name ="홍길동";
	this.age = 20;
}
public Student(String name, int age) {
	this.name =name;
	this.age =age;
 }

public void studying() {System.out.println("Student studying");}
public void studying(String msg) {System.out.println(name+","+age+ "studying");

	}
}
class MiddleStudent extends Student{
	int grade;
	public MiddleStudent() {
		
		this.name= "이순신";
		this.age =40;
		this.grade =50;
	}
	public MiddleStudent(String name, int age, int grade) {
		super(name,age);
		this.grade =grade;
	}
	public void playingGame() {
		System.out.println("Ms paly game");
	}
	public void studying(String msg, int age, int grade) {
		System.out.println(name+","+age+ "studying");
}
}
public class Test1 {
		public static void main(String[] args) {
			Student stu = new Student();
			MiddleStudent stu2 = new MiddleStudent("박동재",27,100);
			stu2.studying("박동재");
		}
}
