package ex04;

public class Circle 
{
	private double x, y;
	private int radius;
	
//	private final double PI = 3.14;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void show()
	{
		System.out.println("("+x+" , "+y+") "+radius);
	}
	
	public double getArea()//원의 넓이 구하는 메소드 
	{
		return Math.PI * radius * radius;
	}
}






