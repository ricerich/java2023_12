package test04.ex02;

public class Basic 
{
	public static void main(String[] args)
	{
		int basic_val = 100;
		
		A a1 = new A(basic_val);
//		a1.val_a1 = basic_val;//직접 접근 안됨!!!
		a1.setVal(basic_val);//간접 접근, 공개된 메소드를 통해서
		
//		a1.printVal();//private이라서 안된다!
//		System.out.println(a1.val_a1);//접근 안됨!
		System.out.println(a1.getVal());
		
	}

}
