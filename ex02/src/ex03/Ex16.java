package ex03;

import java.util.Scanner;

public class Ex16 
{
	public static void main(String[] args) 
	{
//		String str [] = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 시작합니다.");
		
		while(true)
		{
			//1.내가 낸 가위,바위, 보, 그리고 그만도 가능
			System.out.print("가위 바위 보>>");
			String me = sc.next();
			
			if(me.equals("그만")){
				System.out.println("게임을 종료합니다...");
				sc.close();
				break;
			}
			
			String com="";
			//2.컴퓨터가 낸 가위, 바위, 보
            int n = (int)(Math.random()*3);// 0 or 1 or 2
         
            //1)첫번째 방법: if
//            if(n == 0)
//            	com = "가위";
//            else if(n == 1)
//            	com = "바위";
//            else if(n == 2)
//            	com = "보";
            
            //2)두번째 방법: switch~case
//            switch(n)
//            {
//            	case 0:
//            		com = "가위";
//            		break;
//            	case 1:
//            		com = "바위";
//            		break;
//            	case 2:
//            		com = "보";
//            		break;
//            }
            
            //3)세번째 방법
            String str[] = {"가위", "바위", "보"};
            com = str[n];
            
            
            //3.서로 뭐를 냈는지 확인 출력
            System.out.println("나는 "+ me +", 컴퓨터는 "+com);
			
			//4.결과를 출력(예: 이겼는 졌는지 비겼는지)
            if(me.equals("가위")){
                if(com.equals("가위"))
                	System.out.println("비겼습니다");
                else if(com.equals("바위"))
                	System.out.println("내가 졌습니다.");
                else if(com.equals("보"))
                	System.out.println("내가 이겼습니다.");
            }
            else if(me.equals("바위")){
                if(com.equals("가위"))
                	System.out.println("내가 이겼습니다.");
                else if(com.equals("바위"))
                	System.out.println("비겼습니다.");
                else if(com.equals("보"))
                	System.out.println("내가 졌습니다.");
            }
            else if(me.equals("보")){
                if(com.equals("가위"))
                	System.out.println("내가 졌습니다.");
                else if(com.equals("바위"))
                	System.out.println("내가 이겼습니다.");
                else if(com.equals("보"))
                	System.out.println("비겼습니다.");
            }
		}
		
		sc.close();
	}
}
















