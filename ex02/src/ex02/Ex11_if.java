package ex02;

import java.util.Scanner;

public class Ex11_if 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달(1~12)을 입력하시오>>");
		int month = sc.nextInt();
		
		if(month >= 3 && month <= 5)
			System.out.println("봄");
		else if(month >= 6 && month <= 8)
			System.out.println("여름");
		else if(month >= 9 && month <= 11)
			System.out.println("가을");
//		else if(month == 12 || (month >= 1 && month <= 2) )
		else if(month == 12 || month == 1 || month == 2)
			System.out.println("겨울");
		else
			System.out.println("(1~12)의 숫자를 입력해주세요.");
		
		sc.close();
	}
}











