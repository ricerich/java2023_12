package ex03;

import java.util.Scanner;

public class Ex14 
{
	public static void main(String[] args) 
	{
		String course [ ] = {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
		int score [ ] = {95, 88, 76, 62, 55};
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("과목이름>>");
			String major = sc.next();
			
//			if(major == "그만")//이렇게 하면 안먹힘, 왜 String이니까, 객체니까
			if(major.equals("그만"))
			{
				System.out.println("종료합니다!");
				break;
			}
			//배열의 원소를 하나씩 꺼내서, 키보드로 입력받은 값고 비교
			int cnt=0;
			for(int i=0; i<course.length;i++)
			{
				
//				if(course[i] == major)
//				if(major == course[i])
//				if(major.equals(course[i]))
				if(course[i].equals(major))
				{
					System.out.println(major+"의 점수는 "+score[i]+"점 입니다");
					break;
				}
				cnt++;
			}
			
			//반복문을 끝까지 돌렸는데 없다.
			if(cnt == course.length)
				System.out.println("없는 과목 입니다");
		}
		
		sc.close();

	}
}











