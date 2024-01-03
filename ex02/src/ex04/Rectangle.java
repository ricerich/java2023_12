package ex04;

public class Rectangle 
{
	private int x; 
	private int y; 
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void show()
	{
		System.out.print("("+x+","+y+")에서 ");
		System.out.println("크기가 "+width+"x"+height+"인 사각형");
	}

	public int square() {
		return width*height;
	}

//	public boolean contains(Rectangle r) 
//	{
//		if(r.x > this.x &&  
//		   r.x+r.width < this.x+this.width && 
//		   r.y > this.y && 
//		   r.y+r.height < this.y+this.height)
//			return true;
//		else
//			return false;
//	}

	public boolean contains(Rectangle r) 
	{
		if(r.x > x &&  //x의 최소값 비교
		   r.x+r.width < x+width && //x의 최대값 비교 
		   r.y > y && //y의 최소값 비교
		   r.y+r.height < y+height) //y의 최대값 비교
			return true;
		else
			return false;
	}
}














