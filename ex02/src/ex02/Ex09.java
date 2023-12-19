package ex02;

import java.util.Scanner;

public class Ex09 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 중심(x,y)와 반지름(radius) 입력하시오>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double radius = sc.nextDouble();
		
		System.out.print("점 입력>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		double length = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		
		if(radius > length)
			System.out.println("점(" + x1 + ", "+ y1 + ")은 원 안에 있습니다.");
		else
			System.out.println("점(" + x1 + ", "+ y1 + ")은 원 밖에 있습니다.");
		
		sc.close();
	}
}






