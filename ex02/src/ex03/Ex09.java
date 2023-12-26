package ex03;

public class Ex09 
{
	public static void main(String[] args) 
	{
		//1.배열 만들기
		int arr[][] = new int[4][4];
		
		//2.배열에 값넣기
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = (int)(Math.random()*10 +1);
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
