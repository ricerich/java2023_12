package ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삼각형의 3변의 길이 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if( (a+b < c) || (b+c < a) || (a+c < b) )//삼각형이 안되는 조건 
		{
			System.out.println("삼각형을 만들수 없어요!");
		}
		else//삼각형이 되는 조건
		{
			System.out.println("삼각형이 됩니다.");
		}
		
		sc.close();
	}
}





