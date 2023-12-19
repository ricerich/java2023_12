package ex02;

import java.util.Scanner;

public class Ex12_if 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산(예: 7 + 1) >>");
		int x = sc.nextInt();
		String op = sc.next();
		int y = sc.nextInt();
		
		int result = 0;
		
//		if(op == "+")//이렇게 하면 안된다. 왜냐하면 String형이기 때문에, 객체형이기 때문에
		if(op.equals("+"))
			result = x + y;
		else if(op.equals("-"))
			result = x - y;
		else if(op.equals("/"))
		{
			if(y == 0){
				System.out.println("0으로 나눌수는 없어요!");
				return;
			}
			else
				result = x / y;
		}
		else if(op.equals("*"))
			result = x * y;
		
		System.out.println(x + " + " + y + "의 계산 결과는 " + result + "입니다");
	}
}










