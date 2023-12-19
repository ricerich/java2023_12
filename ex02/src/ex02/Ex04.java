package ex02;

import java.util.Scanner;

public class Ex04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int mid = 0; //중간값
		
		//경우1 - a가 중간값이 경우
		if( (a>b && a<c) || (a>c && a<b) )
		{
			mid = a;
		}
		else if((b>c && b<a) || (b>a && b<c))
		{//경우2 - b가 중간값이 경우
			mid = b;
		}
		else if((c>a && c<b) || (c>b && c<a)) 
		{
			mid = c;
		}
		
		System.out.println("중간값은 " + mid);
		
		sc.close();
	}
}





