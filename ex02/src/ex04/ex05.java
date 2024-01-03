package ex04;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Circle arr[] = new Circle[3];
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("x, y, radius>>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			
//			Circle c1 = new Circle(x,y,radius);
//			Circle c2 = new Circle(x,y,radius);
//			Circle c3 = new Circle(x,y,radius);
			
			arr[i] = new Circle(x,y,radius);			
		}
		
		for(int i=0; i<arr.length; i++){
			arr[i].show();
		}
		
	
	}

}
