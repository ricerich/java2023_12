package ex04;

import java.util.Scanner;

class Add{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a+b;
	}
}
class Sub{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a-b;
	}
}
class Mul{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a*b;
	}
}
class Div{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate() 
	{
		int result=0;
		
		if(b == 0)
		{
			System.out.println("0으로 나눌수 없어요!");
			return 0;
		}
		else
			result = a/b;
		
		return result;
	}
}

public class Calc {

	public void run() 
	{
		//Add클래스, Sub클래스, Mul 클래스, Div 클래슬 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String operator = sc.next();
		char op1 = operator.charAt(0);
		
		switch(op1)
		{
			case '+':
				Add add1 = new Add();
				add1.setValue(a, b);
				System.out.println(add1.calculate());
				break;
			case '-':
				Sub sub1 = new Sub();
				sub1.setValue(a, b);
				System.out.println(sub1.calculate());
				break;
				
			case '*':
				Mul mul1 = new Mul();
				mul1.setValue(a, b);
				System.out.println(mul1.calculate());
				break;
			case '/':
				Div div1 = new Div();
				div1.setValue(a, b);
				System.out.println(div1.calculate());
				break;
			default :
				System.out.println("잘못된 연산자 입니다.");
		}
		sc.close();
	}

}
