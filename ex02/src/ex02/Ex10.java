package ex02;

import java.util.Scanner;

public class Ex10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 원의 중심(x1,y1)와 반지름(r1) 입력하시오>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		double r1 = sc.nextDouble();
		
		System.out.print("두 번째 원의 중심(x2,y2)와 반지름(r2) 입력하시오>>");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double r2 = sc.nextDouble();
		
		double l = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		if(r1+r2 > l)
			System.out.println("두 원은 서로 겹칩니다.");
		else
			System.out.println("두 원은 서로 겹치지 않습니다.");
		
		sc.close();
	}
}
