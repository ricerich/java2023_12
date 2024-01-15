package ex05;

public class StringStack implements Stack {
	
	//1.멤버변수
	private String arr1[];
	private int top;
	
	public StringStack(int capacity)
	{
		arr1 = new String[capacity];
		top = -1;
	}

	@Override
	public int length() {//현재 들어가 있는 갯수
		return top+1;
	}

	@Override
	public int capacity() {//전체 용량
		return arr1.length;
	}

	@Override
	public String pop() 
	{
		if(top == -1)
			return null;
		
		String val = arr1[top];
		top--;
		return val;
	}

	@Override
	public boolean push(String val) 
	{
//		arr1[top+1] = val;
//		top++;
		
		if(top == arr1.length-1)
			return false;
		else {
			arr1[++top] = val;
			return true;
		}
	}
}










