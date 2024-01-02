package test04.ex02;

public class A 
{
	private int val_a1;
	private int val_a2;//멤버변수 보호
	
	public A(int val_a1) {
		this.val_a1 = val_a1;
		printVal();
	}

	public void setVal(int val_a1)
	{
		this.val_a1 = val_a1;
		printVal();
	}
	
	public int getVal()
	{
		return val_a1;
	}
	
	private void printVal()
	{
		System.out.println("출력: " + val_a1);
	}
	
	
}
