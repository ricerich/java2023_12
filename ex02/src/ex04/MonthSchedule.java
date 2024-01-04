package ex04;

import java.util.Scanner;

public class MonthSchedule {
	
	int totalDay;
	Scanner sc;
	Day arr[];

	public MonthSchedule(int totalDay) {
		sc = new Scanner(System.in);
		this.totalDay = totalDay;
		arr = new Day[totalDay];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = new Day();
		}
	}

	public void run() {
		System.out.println("이번달 스케줄 관리 프로그램.");
		
		while(true)
		{
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					return;
				default:
					System.out.println("잘못입력했어요!");
			}
		}
	}

	private void input() {
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		System.out.print("할일(빈칸없이 입력)?");
		String work = sc.next();
		day--;
		//arr[day] = new Day();//입력받는 순간에 객체를 생성
		arr[day].set(work);
	}

	private void view() {
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		day--;
		
		System.out.println((day+1)+"일 의 할일은");
//		if(arr[day] != null)
			arr[day].show();
		
	}

	private void finish() {
		sc.close();
		System.out.println("종료합니다");		
	}
}









