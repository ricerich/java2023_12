package ex03;

public class Ex13 
{
	public static void main(String[] args) 
	{
		final String CLAP[] = {"박수짝", "박수짝짝"};
		
		for(int i=1; i<=99; i++)
		{
			int ten = i / 10;
			int one = i % 10;
			
			int cnt = 0;
			
			if(ten==3 || ten==6 || ten==9)
				cnt++;
			
			if(one==3 || one==6 || one==9)
				cnt++;
			
			if(cnt>0)
				System.out.println(i + CLAP[cnt-1]);
			
//			if(cnt>0)
//			{
//				if(cnt == 1)
//					System.out.println(i + "박수짝");
//				else if(cnt == 2)
//					System.out.println(i + "박수짝짝");
//			}
		}
		
		
//		for(int i=1; i<=99; i++)
//		{
//			int num = i;
//			int cnt=0;
//			for(int j=num%10; num>0; j=num%10)
//			{
//				if(j==3 || j==6 || j==9)
//					cnt++;
//				num = num /10;				
//			}
//			
//			if(cnt>0)
//				System.out.println(i + " : " +CLAP[cnt-1]);
//		}
	}

}












