package javapractice;
interface IShape {
	void draw(int x, int y);
}
class Circle implements IShape{
	public void draw(int a, int b) {
		System.out.println("Draw a Circle: " +a+","+b);
	}
}
class DrawManager{
	IShape s;
	public DrawManager(IShape s) {
		this.s =s;
	}
	public void draw(int s, int t) {
		this.s.draw(s, t);
	}
}
public class Test4 {
	public static void main(String[] args) {
		DrawManager d = new DrawManager(new Circle());
		d.draw(1, 2);
	}
	
}
