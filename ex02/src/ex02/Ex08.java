package ex02;

import java.util.Scanner;

public class Ex08 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		//사각형이 겹치는 경우의 수를 전부 체크 (100,100), (200,200)
		
//		boolean p1 = inRect(x1, y1, 100, 100, 200, 200);
//		boolean p2 = inRect(x1, y2, 100, 100, 200, 200);
//		boolean p3 = inRect(x2, y1, 100, 100, 200, 200);
//		boolean p4 = inRect(x2, y2, 100, 100, 200, 200);

//		boolean orgin_p1 = inRect(100,100, x1,y1,x2,y2);
//		boolean orgin_p2 = inRect(100,200, x1,y1,x2,y2);
//		boolean orgin_p3 = inRect(200,100, x1,y1,x2,y2);
//		boolean orgin_p4 = inRect(200,200, x1,y1,x2,y2);
		
		if(inRect(x1, y1, 100, 100, 200, 200) || 
		   inRect(x1, y2, 100, 100, 200, 200) || 
		   inRect(x2, y1, 100, 100, 200, 200) || 
		   inRect(x2, y2, 100, 100, 200, 200))
		{
			System.out.println("사각형이 겹칩니다.");
		}
		else if(inRect(100,100, x1,y1,x2,y2) || 
				inRect(100,200, x1,y1,x2,y2) || 
				inRect(200,100, x1,y1,x2,y2) || 
				inRect(200,200, x1,y1,x2,y2))
		{
			System.out.println("사각형이 겹칩니다.");
		}
		else
			System.out.println("사각형이 겹치지 않습니다.");
			
	}
	
	public static boolean inRect(int x, int y, 
								 int rectx1, int recty1, 
								 int rectx2, int recty2) 
	{
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}
}









