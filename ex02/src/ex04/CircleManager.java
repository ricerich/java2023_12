package ex04;

import java.util.Scanner;

public class CircleManager 
{
	void run()
	{
		Scanner sc = new Scanner(System.in);
		
		Circle arr[] = new Circle[3];
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("x, y, radius>>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			
			arr[i] = new Circle(x,y,radius);			
		}
		
		for(int i=0; i<arr.length; i++){
			arr[i].show();
		}
		
		double max = 0.0;
		int max_index = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].getArea() > max) 
			{
				max = arr[i].getArea();
				max_index = i;
			}
		}
		
		System.out.print("가장 면적이 큰 원은");
		arr[max_index].show();
		
		System.out.println("가장 면적이 큰 없의 좌표와 넓이 ");
		System.out.println("("+arr[max_index].getX() +"," + arr[max_index].getY()+")");
		System.out.println(arr[max_index].getArea());
		
		
		sc.close();
	}

}












