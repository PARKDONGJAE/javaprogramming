package javapractice3;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	abstract void draw() ;
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
};
class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing rectangle");
	}
}
public class Test14 {
	static void drawShapes(List<? extends Shape> lists) {
		for(Shape s : lists) {
			s.draw();
		}
	}
	public static void main(String[] args) {
		List<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		List<Circle> list2 = new ArrayList<Circle>();
		list2.add(new Circle());
		drawShapes(list1);
	}

}
