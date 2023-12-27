package ex03;

public class Ex12 
{
	public static void main(String[] args) 
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
			try {
				sum = sum + Integer.parseInt(args[i]);
			}
			catch(Exception e)
			{
				System.out.println(args[i] + "는 숫자로 바꿀수 없어요!");
			}
		}
		
		System.out.println(sum);
	}

}
