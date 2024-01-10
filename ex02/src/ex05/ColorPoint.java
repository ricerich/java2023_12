package ex05;

public class ColorPoint extends Point {

	private String color;
	
	public ColorPoint(int x, int y, String color) 
	{
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);
		
	}

	public void setColor(String color) {
		this.color = color;
		
	}

	@Override
	public String toString() {
		return color+"색의 ("+getX()+","+getY()+")의 점";
	}
	
//	public String toString()
//	{
//		return color+"색의 ("+getX()+","+getY()+")의 점";
//	}
	
	


}









