package ex03;

public class Ex10 
{
	public static void main(String[] args) 
	{
		//1.배열 만들기
		int arr[][] = new int[4][4];
		
		//2.배열에 값넣기(0으로 초기화)
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = 0;
			}
		}
		
		//3.랜덤위치([i][j])에 랜덤값(1~10) 10개 넣기
		
		for(int i=0; i < 10; i++)
		{
			int row = (int)(Math.random()*4);
			int col = (int)(Math.random()*4);
			
			if(arr[row][col] == 0)//처음 값을 넣는 곳
				arr[row][col] = (int)(Math.random()*10+1);
			else//처음이 아닌 중복인 곳
			{
				i--;
				continue;
			}
		}
		
		//3.배열에 값꺼내서 출력하기
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
