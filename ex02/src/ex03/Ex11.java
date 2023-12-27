package ex03;

public class Ex11 
{
	public static void main(String args[]) 
	{
		//진정한 예외처리(if 구문)
		if(args.length == 0)
		{
			System.out.println("명령행 인자(argument)가 없어요!!");
			return;
		}
		
		int sum=0;
		for(int i=0; i<args.length; i++)
		{
			sum = sum + Integer.parseInt(args[i]);
		}
		
		System.out.println(sum/args.length);
	}

}
