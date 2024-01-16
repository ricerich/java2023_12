package ex05;

public abstract class Shape 
{
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	} // 링크 연결

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}

class Line extends Shape {

	@Override
	public void draw() {
		System.out.println("Line(선)");

	}

}

class Rect extends Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle(사각형)");

	}

}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Circle(원)");

	}

}

