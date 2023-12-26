package ex03;

public class Ex07 
{
	public static void main(String[] args) 
	{
		//1.배열 만들기(만들기)-> 배열선언 + 배열생성
		//2.난수를 배열에 넣기(사용)
		//3.배열에서 하나씩 꺼내 출력(사용)
		//4.배열의 원소들의 평균을 구해서 출력(사용)
		
		//1.배열 만들기
		int arr[] = new int[10];
		
//		2.난수를 배열에 넣기(사용)
		for(int i=0; i<arr.length; i++)
		{
//			int num = (int)(Math.random()*10 +1);
//			arr[i] = num;
			
 			arr[i] = (int)(Math.random()*10 +1);
		}
		
		System.out.println("랜덤하게 들어간 10개의 값");
		//3.배열에서 하나씩 꺼내 출력(사용)
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		
		//4.배열의 원소들의 평균을 구해서 출력(사용)
		int sum = 0;		
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		double average = 0.0;
		average = (double)sum/arr.length;
		System.out.println("평균은" + average + "입니다.");

	}
}















