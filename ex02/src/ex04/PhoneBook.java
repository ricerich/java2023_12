package ex04;

import java.util.Scanner;

public class PhoneBook//Manager역할을 하는 실행 클래스 
{
	//1.멤버변수
	//2.생성자
	//3.메소드

	//1.멤버변수
	Phone arr[];
	
	Scanner sc;
	
	public PhoneBook()
	{
//		arr = new Phone[3];
		sc = new Scanner(System.in);
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
		
		System.out.print("인원수>>");
		int num = sc.nextInt();
		arr = new Phone[num];
		
//		for(int i=0; i<num; i++)
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("이름과 전화번호(빈칸없이)>>");
			String name = sc.next();
			String tel = sc.next();
			
			arr[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		//2.배열에 저장하기
	}
	
	private void search()
	{
		while(true)
		{
			System.out.print("검색할 이름>>");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String tel = searchName(name);
			
			if(tel == null)
				System.out.println(name+"이 없습니다.");
			else
				System.out.println(name+"의 번호는 "+tel+" 입니다");
			
//			//메소드로 뺀다.구조화를 위해서
//			for(int i=0; i<arr.length; i++)
//			{
////				if(name.equals(arr[i].name)))//은닉성 잘해놨음
//				if(name.equals(arr[i].getName()))//은닉성 잘해놨음
//					System.out.println(name+"의 번호는 "+arr[i].getTel()+" 입니다");
//				else
//				{
//					if(i==arr.length-1)
//						System.out.println(name+"이 없습니다.");
//				}
//			}
		}
		
		
	}
	
	private String searchName(String name)
	{
		//메소드로 뺀다.구조화를 위해서
		for(int i=0; i<arr.length; i++)
		{
//			if(name.equals(arr[i].name)))//은닉성 잘해놨음
			if(name.equals(arr[i].getName()))//은닉성 잘해놨음
				return arr[i].getTel();
		}
		
		return null;
	}


}
