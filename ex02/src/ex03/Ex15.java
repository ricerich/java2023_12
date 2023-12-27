package ex03;

import java.util.Scanner;

public class Ex15 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
//			if()
//				break;
			
			System.out.print("곱하고자 하는 두 수 입력>>");
			
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.print(n + "x" + m + "=" + n*m);
				break;
			}
			catch(Exception e)
			{
				System.out.println("실수는 입력하시면 안되요!");
				sc.nextLine();
			}
		}
		

		
		sc.close();
	}

}








