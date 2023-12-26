package ex03;

import java.util.Scanner;

public class Ex03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		int n = sc.nextInt();
		
		if(n<=0){
			System.out.println("0보다 큰 정수를 넣어주세요");
			sc.close();
			return;
		}
		
		for(int i=n; i>=1; --i) {//행
			for(int j=0; j<i;++j){//열
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
