package ex02;

import java.util.Scanner;

public class Ex12_switch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산(예: 7 + 1) >>");
		int x = sc.nextInt();
		String op = sc.next();
		int y = sc.nextInt();
		
		int result = 0;
		
		switch(op)
		{
			case "+":
				result = x + y;
				break;
			case "-":
				result = x - y;
				break;
			case "*":
				result = x * y;
				break;
			case "/":
				if(y == 0){
					System.out.println("0으로 나눌수는 없어요!");
					return;
				}
				else
					result = x / y;
				break;
			default :
				System.out.println("사칙연산이 아닙니다.");
		}
		
		System.out.println(x + " + " + y + "의 계산 결과는 " + result + "입니다");
	}
}










