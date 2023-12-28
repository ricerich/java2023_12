package test04.call_by_reference;

public class Person 
{
	String name;
	int age;
	
	void add(int x, int y[], Goods g1)//y를 배열
	{
		//1.변수 call by value
		x++;
		System.out.println("Person의 add()안에: x의 값은?" + x);
		
		//2.배열 call by reference
		y[0]++;
		y[1] = 15;
		y[2] = 9999;
		
		System.out.println("Person " + y[0] +","+ y[1] + ","+ y[2] );
		
		//3.객체 call by reference
		g1.z = 100;
		System.out.println("Person: g1의 z: " + g1.z);
		
		
		
//		int c = x + y;
//		System.out.println(c);
	}

}
