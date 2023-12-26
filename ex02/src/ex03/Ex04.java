package ex03;

import java.util.Scanner;

public class Ex04 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 1개를 입력하시오>>");
		String s = sc.next();
		
		if(s.length() > 1){
			System.out.println("1글자만 넣어주세요");
			sc.close();
			return;
		}
		
		char c = s.charAt(0);
		
		if(c<'a' || c>'z')
		{
			System.out.println("소문자가 아닙니다");
			sc.close();
			return;
		}
		
		for(char i=c; i>='a'; --i) {//행
			for(char j='a'; j<=i; ++j){//열
				System.out.print(j);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
