package test04;

public class Ex04 {

	public static void main (String args[]) 
	{
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		//클래스로 객체를 만들고, 객체 쩜 멤버변수 혹은 메소드를 사용
		
		ArrayParameter ap1 = new ArrayParameter();
		
		ap1.printCharArray(c);
		ap1.replaceSpace(c);
		ap1.printCharArray(c);
	}


}
