package ex03;

import java.util.Scanner;

public class Ex08 
{
	public static void main(String[] args) 
	{
		//1.배열을 만든다. 사용자가 입력한 사이즈로(1~100의 크기)
		//2.만들어진 배열에 난수(난수도 1~100)를 넣는다
		//3.배열 원소에 같은 값이 들어가지 않도록 해라!!!!!!!!
		
		int arr[];//배열선언(만들기 1/2)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개? >>");
		int size = sc.nextInt();
		
		if(size < 1 || size>100)
		{
			System.out.println("1~100 사이의 수만 입력 부탁드립니다.");
			sc.close();
			return;
		}
		
		arr = new int[size];//배열 생성(만들기2/2)
		
		//2.만들어진 배열에 난수(난수도 1~100)를 넣는다
		for(int i=0; i<arr.length; i++)
		{
			boolean bBack = false;
			int num = (int)(Math.random()*100 +1);
			
			//3.배열 원소에 같은 값이 들어가지 않도록 체크
			for(int j=0; j<i ; j++){//여기서 i를 이해하는게 포인트
				if(num == arr[j]){
					--i;
					bBack = true;
					break;
				}
			}
			
			if(bBack)
				continue;
			
			arr[i] = num;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(i==0)
				System.out.print(arr[i] + " ");
			else {
				if(i%10 == 0)
					System.out.println();
				
				System.out.print(arr[i] + " ");
			}
		}
		
		sc.close();
	}

}














