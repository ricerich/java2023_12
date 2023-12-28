package test04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) 
	{
		Goods1 arr[] = new Goods1[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제품명, 가격, 재고, 팔리갯수>>");
		
		//1.입력 받아서, 객체를 만들고, 배열 넣는다
		for(int i=0; i<arr.length; i++)
		{
			String name = sc.next();
			int price = sc.nextInt();
			int n = sc.nextInt();
			int sold = sc.nextInt();
			
			arr[i] = new Goods1(name, price, n, sold);
		}
		
		//2.배열에 있는 객체를 하나씩 꺼내서 출력해본다
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i].getName() + " ");
			System.out.print(arr[i].price+ " ");
			System.out.print(arr[i].numberOfStock+ " ");
			System.out.println(arr[i].sold+ " ");
		}
		
//		arr[0] = new Goods1("니콘",200000,30,50);
//		arr[1] = new Goods1("캐논",100000,10,15);
//		arr[2] = new Goods1("삼성",320000,30,50);
//		
//		int price = arr[0].getPrice();
//		System.out.println(arr[0].getName() + "가격은" + price);
		

	}

}
