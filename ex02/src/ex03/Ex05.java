package ex03;

import java.util.Scanner;

public class Ex05 
{
	public static void main(String[] args) 
	{
		//1.10개짜리 배열만들기
		//2.입력(scanner)을 받아서 배열에 넣기
		//3.배열에서 꺼내서 계산(로직:3의배수)하기
		
		//1.10개짜리 배열만들기
		int arr[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");
		//2.입력(scanner)을 받아서 배열에 넣기
		for(int i=0; i<arr.length; ++i){
			arr[i] = sc.nextInt();
		}
		
		//3.배열에서 꺼내서 계산(로직:3의배수)하기
		for(int i=0; i<arr.length; ++i){
			if(arr[i] % 3 ==0) {
				System.out.print(arr[i] +" ");
			}
		}
	}
}











