package ex05;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택의 저장 공간의 크기 입력>>");
		int capacity = sc.nextInt();
		
		Stack ss1 = new StringStack(capacity);
		
		while(true)
		{
			System.out.print("문자열 입력>>");
			String str1 = sc.next();
			
			if(str1.equals("그만"))
				break;
			
			boolean success = ss1.push(str1);//푸시(넣기)
			
//			if(success == false)
			if(!success) {
				System.out.println("스택이 꽉차서 푸시가 안되요!!");
				break;
			}
		}
		
		//POP(꺼내기)을 사용
		int total_size = ss1.length();
		for(int i=0; i<total_size; i++)
		{
			System.out.print(ss1.pop() + " ");
		}
		sc.close();
	}

}







