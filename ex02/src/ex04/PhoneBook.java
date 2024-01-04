package ex04;

import java.util.Scanner;

public class PhoneBook//Manager역할을 하는 실행 클래스 
{
	//1.멤버변수
	//2.생성자
	//3.메소드

	//1.멤버변수
	Phone arr[];
	
	public PhoneBook()
	{
//		arr = new Phone[3];
	}
	
	//3.메소드
	public void run() {
		//1.사용자 입력 받기	
		//2.객체배열(예:Phone객체배열)에 저장 -> 멤버변수로 객체배열
		//3.검색하기
		
		
		input();//1.사용자 입력 받기	
		
		//2.배열에 저장하기
		//.....
		
		//3.검색하기
		search();
		
	}
	
	private void input()//1.사용자 입력 받기	
	{
		//반복횟수를 입력받고, 회수만큼 입력받기
		
		Scanner sc = new Scanner(System.in);
		//2.배열에 저장하기
	}
	
	private void search()
	{
		
	}
	


}
