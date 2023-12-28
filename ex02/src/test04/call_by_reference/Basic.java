package test04.call_by_reference;

public class Basic {

	public static void main(String[] args) 
	{
		Person p1 = new Person();
		
		int x=1;//변수일때 call by value
		int y[]= {4, 6, 7};//배열일때 call by reference
		
		
		Goods g1 = new Goods();
		g1.z = 12;
		
		p1.add(x, y, g1);
		
		System.out.println("Basic의 main()의 x의 값은?" + x);
		System.out.println("Basic: g1의 z: " + g1.z);
		System.out.println("Basic " + y[0] +","+ y[1] + ","+ y[2] );
	}

}
