package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int ten;//10의 자리수
		int one;//1의 자리수
		
		System.out.print("2자리의 정수 입력(10~99)>>");
		int num = sc.nextInt();
		
		if(num < 10 || num > 99)
		{
			System.out.println("10~99사이의 수를 입력해주세요");
			return;
		}
		
		ten = num / 10;
		one = num % 10;
		
		if(ten == one)
		{
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else
		{
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		
		sc.close();
	}

}



