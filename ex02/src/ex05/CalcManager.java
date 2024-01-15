package ex05;

import java.util.Scanner;

abstract class Calc{
	protected int a;
	protected int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
	
}


class Add extends Calc{
	
	public int calculate() {
		return a+b;
	}
}
class Sub extends Calc{
	
	public int calculate() {
		return a-b;
	}
}
class Mul extends Calc {
	
	public int calculate() {
		return a*b;
	}
}
class Div extends Calc{
	
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

public class CalcManager {
	public void run() 
	{
		//Add클래스, Sub클래스, Mul 클래스, Div 클래슬 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String operator = sc.next();
		char op1 = operator.charAt(0);
		
		Calc cal = null;
		switch(op1)
		{
			case '+':
				cal = new Add();
				break;
			case '-':
				cal = new Sub();
				break;
				
			case '*':
				cal = new Mul();
				break;
			case '/':
				cal = new Div();

				break;
			default :
				System.out.println("잘못된 연산자 입니다.");
		}
		
		cal.setValue(a, b);
		System.out.println(cal.calculate());
		
		sc.close();
	}
}
