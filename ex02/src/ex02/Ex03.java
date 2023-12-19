package ex02;

import java.util.Scanner;

public class Ex03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		final int N_50000 = 50000;
		
		System.out.print("금액을 입력하시요>>");
		int money = sc.nextInt();
		int count = 0;
		
	
		count = money / N_50000;
		money = money % N_50000;
		
		if(count > 0)
			System.out.println("오만원권 "+count+"매");
		
		count = money / 10000;
		money = money % 10000;
		
		if(count > 0)
			System.out.println("만원권 "+count+"매");
		
		count = money / 1000;
		money = money % 1000;
		
		if(count > 0)
			System.out.println("천원권 "+count+"매");
		
		count = money / 500;
		money = money % 500;
		
		if(count > 0)
			System.out.println("오백원 "+count+"개");
		
		count = money / 100;
		money = money % 100;
		
		if(count > 0)
			System.out.println("백원 "+count+"개");
		
		count = money / 50;
		money = money % 50;
		
		if(count > 0)
			System.out.println("오십원 "+count+"매");
		
		count = money / 10;
		money = money % 10;
		
		if(count > 0)
			System.out.println("십원 "+count+"매");
		
		sc.close();
		
	}

}









