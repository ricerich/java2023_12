package ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		final double RATE = 1216.0;//환율
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = sc.nextInt();
		
		double dollar = won / RATE;
		dollar = (int)(dollar * 100) / 100.0;
		
		System.out.println(won + "원은 $" + dollar + "입니다.");
		
		sc.close();
	}

}
