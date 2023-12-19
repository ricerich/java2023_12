package ex02;

import java.util.Scanner;

public class Ex06 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99사이의 정수를 입력하시오>>");
		int num = sc.nextInt();
		
		if(num < 1 || num >99)
		{
			System.out.println("1~99 사이의 수가 아닙니다.");
			return;
		}
		
		
		int one = num / 10;
		int ten = num % 10;
		
		int count = 0;
		
		if(one==3 || one==6 || one==9 )
			count++;
		
		if(ten==3 || ten==6 || ten==9 )
			count++;
		
		if(count == 2)
			System.out.println("박수짝짝");
		else if(count == 1)
			System.out.println("박수짝");
		else
			System.out.println("박수없음");
		
		sc.close();
		
	}
}






