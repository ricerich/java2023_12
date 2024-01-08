package ex04;

import java.util.Scanner;

public class DictionaryManager 
{
	void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램");
		
		while(true)
		{
			System.out.print("한글단어?");
			String kor = sc.next();
			
			if(kor.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			String eng = Dictionary.kor2Eng(kor);
			
			if(eng == null)
				System.out.println(kor+"은 저의 사전에 없습니다");
			else
				System.out.println(kor+"은 "+eng);
			
		}
		sc.close();
	}

}
